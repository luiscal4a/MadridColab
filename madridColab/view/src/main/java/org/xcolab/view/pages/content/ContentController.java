package org.xcolab.view.pages.content;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import org.xcolab.client.contents.ContentsClient;
import org.xcolab.client.contents.exceptions.ContentNotFoundException;
import org.xcolab.client.contents.pojo.ContentArticle;
import org.xcolab.client.contents.pojo.ContentPage;
import org.xcolab.client.members.pojo.Member;
import org.xcolab.view.errors.AccessDeniedPage;
import org.xcolab.view.errors.ErrorText;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ContentController {

    @GetMapping("/page/{pageTitle}")
    public String showContentPage(HttpServletRequest request, HttpServletResponse response,
            Model model, Member member, @PathVariable String pageTitle) throws IOException {

        try {
            final ContentPage contentPage = ContentsClient.getContentPage(pageTitle);
            model.addAttribute("contentPage", contentPage);

            final ContentArticle contentArticle =
                    ContentsClient.getContentArticle(contentPage.getContentArticleId());

            if (!contentArticle.canView(member)) {
                return new AccessDeniedPage(member).toViewName(response);
            }

            model.addAttribute("contentArticleId", contentPage.getContentArticleId());

            if (contentPage.getMenuArticleId() != null) {
                model.addAttribute("menuArticleId", contentPage.getMenuArticleId());
            }

            //TODO COLAB-2611: allow different active pages
            model.addAttribute("_activePageLink", "about");
        } catch (ContentNotFoundException e) {
            response.setStatus(HttpStatus.NOT_FOUND.value());
            return ErrorText.PAGE_NOT_FOUND.flashAndReturnView(request);
        }
        return "content/contentPage";
    }

    @GetMapping("/widgets/content")
    @Deprecated
    public String showWidgetLegacy(HttpServletRequest request, HttpServletResponse response,
            Model model, @RequestParam Long contentArticleId) {
        return showWidget(request, response, model, contentArticleId);
    }

    @GetMapping("/widgets/content/{contentArticleId}")
    public String showWidget(HttpServletRequest request, HttpServletResponse response,
            Model model, @PathVariable Long contentArticleId) {
        response.setHeader(HttpHeaders.CACHE_CONTROL,
                CacheControl.maxAge(30, TimeUnit.SECONDS)
                        .staleWhileRevalidate(36, TimeUnit.HOURS)
                        .getHeaderValue());
        model.addAttribute("articleId", contentArticleId);
        return "content/widget";
    }
}

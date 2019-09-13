package org.xcolab.view.config.rewrite.rules.legacy;

import org.ocpsoft.rewrite.config.ConfigurationBuilder;
import org.ocpsoft.rewrite.config.Direction;
import org.ocpsoft.rewrite.servlet.config.Path;
import org.ocpsoft.rewrite.servlet.config.Redirect;

import org.xcolab.view.config.rewrite.SimpleRewriteBuilder;
import org.xcolab.view.config.rewrite.rules.RewriteRuleProvider;

public class LegacyNewsRewriteRules implements RewriteRuleProvider {

    @Override
    public void configure(ConfigurationBuilder configurationBuilder) {
        BlogRewriteBuilder.of(configurationBuilder)
                .fromLiferayUrlTitle("2016-climate-colab-conference-in-review")
                    .toPath("/2016/10/2016-crowds-climate-conference-in-review/")
                .fromLiferayUrlTitle("itba-kiri-team-25-c-77-f-proposal")
                    .toPath("/2016/11/winners-spotlight-winning-25c-team-meets-with-argentinian-president/")
                .fromLiferayUrlTitle("winners-to-be-special-guests-at-exclusive-mit-conference-this-october")
                    .toPath("/2015/04/winners-will-be-special-guests-at-exclusive-mit-conference-this-october/")
                .fromLiferayUrlTitle("winners-announced-in-3-contest-1")
                    .toPath("/2016/04/winners-announced-in-3-contests/")
                .fromLiferayUrlTitle("winner-spotlight-stop-groundwater-plan")
                    .toPath("/2014/10/winner-spotlight-stop-groundwater-plan/")
                .fromLiferayUrlTitle("winne")
                    .toPath("/2014/11/winner-spotlight-recycled-debris-for-adaptation-to-climate-change/")
                .fromLiferayUrlTitle("winner-spo")
                    .toPath("/2014/11/winner-spotlight-municipal-adaptation-strategy/")
                .fromLiferayUrlTitle("winner-spotlight-jan")
                    .toPath("/2014/10/winner-spotlight-jan-kunnas-of-the-global-plan-contest/")
                .fromLiferayUrlTitle("winner-spotlight-")
                    .toPath("/2014/10/winner-spotlight-james-dangelo-of-sno-caps-the-peoples-cap-and-trade/")
                .fromLiferayUrlTitle("winner-spotlight-alex")
                    .toPath("/2015/10/winner-spotlight-high-school-senior-alex-krotz/")
                .fromLiferayUrlTitle("winner-spotlight-global-4c-mitigation")
                    .toPath("/2015/01/winner-spotlight-global-4c-mitigation/")
                .fromLiferayUrlTitle("winner-spotlight-float-m-1")
                    .toPath("/2015/06/winner-spotlight-float-map-a-new-ngo-launched-from-2013-proposal/")
                .fromLiferayUrlTitle("winner-spotlight-climate-change-is-elementary")
                    .toPath("/2014/12/winner-spotlight-climate-change-is-elementary/")
                .fromLiferayUrlTitle("winner-spotlight-citizens-climate-lobby")
                    .toPath("/2015/01/winner-spotlight-citizens-climate-lobby/")
                .fromLiferayUrlTitle("winner-spotlight-conservaction")
                    .toPath("/2014/11/winner-spotlight-conservaction/")
                .fromLiferayUrlTitle("winner-of-climate-colab-social-network-prize-announced")
                    .toPath("/2014/12/winner-of-climate-colab-social-network-prize-announced/")
                .fromLiferayUrlTitle("white-house-initiative-recognizes-climate-colab")
                    .toPath("/2014/03/white-house-features-climate-colab/")
                .fromLiferayUrlTitle("webinar-u-s-carbon-price-opportunities-for-innovation")
                    .toPath("/2015/05/webinar-u-s-carbon-price-opportunities-for-innovation/")
                .fromLiferayUrlTitle("webinar-how-could-a-national-price-on-carbon-be-implemented-in-the-united-states-")
                    .toPath("/2014/07/webinar-how-could-a-national-price-on-carbon-be-implemented-in-the-united-states/")
                .fromLiferayUrlTitle("webinar-city-of-cambridge-s-contest-on-the-urban-heat-island-effect")
                    .toPath("/2014/12/webinar-city-of-cambridges-contest-on-the-urban-heat-island-effect/")
                .fromLiferayUrlTitle("webinar-ask-the-experts-of-the-pamir-mountain-contest")
                    .toPath("/2015/01/webinar-ask-the-experts-of-the-pamir-mountain-contest/")
                .fromLiferayUrlTitle("webinar-review-how-could-a-national-price-on-carbon-be-implemented-in-the-united-states-")
                    .toPath("/2014/07/webinar-review-how-could-a-national-price-on-carbon-be-implemented-in-the-united-states/")
                .fromLiferayUrlTitle("we-re-hiring-community-partnerships-manager")
                    .toPath("/2015/12/were-hiring-community-partnerships-manager/")
                .fromLiferayUrlTitle("wanted-skilled-web-developer-to-help-build-the-climate-colab")
                    .toPath("/2015/11/wanted-skilled-web-developer-to-help-build-the-climate-colab/")
                .fromLiferayUrlTitle("voting-period-has-ended-what-s-next-")
                    .toPath("/2013/09/voting-period-has-ended-whats-next/")
                .fromLiferayUrlTitle("voting-open-for-global-contest-")
                    .toPath("/2015/11/voting-open-for-global-contest/")
                .fromLiferayUrlTitle("voting-is-now-open-")
                    .toPath("/2013/08/voting-is-now-open/")
                .fromLiferayUrlTitle("voting-closed-")
                    .toPath("/2014/09/voting-is-now-closed/")
                .fromLiferayUrlTitle("voting-ends-tomorrow-")
                    .toPath("/2014/09/voting-ends-tomorrow/")
                .fromLiferayUrlTitle("voting-closed-for-global-climate-action-plan-contest-2015")
                    .toPath("/2015/12/voting-closed-for-global-climate-action-plan-contest-2015/")
                .fromLiferayUrlTitle("un-mit-announce-contests-seeking-climate-resilience-solutions-from-around-the-globe")
                    .toPath("/2015/12/un-mit-announce-contests-seeking-climate-resilience-solutions-from-around-the-globe/")
                .fromLiferayUrlTitle("treehugger-to-feature-2011-contest-winners")
                    .toPath("/2011/08/treehugger-to-feature-2011-contest-winners/")
                .fromLiferayUrlTitle("the-climate-colab-s-new-project-manager")
                    .toPath("/2014/12/the-climate-colabs-new-project-manager/")
                .fromLiferayUrlTitle("steven-schneider-1945-2010")
                    .toPath("/2010/07/steven-schneider-1945-2010/")
                .fromLiferayUrlTitle("spotlight-winner-puts-sustainability-commitment-to-practice-through-the-climate-colab")
                    .toPath("/2013/10/spotlight-winner-puts-sustainability-commitment-to-practice-through-the-climate-colab/")
                .fromLiferayUrlTitle("spotlight-winner-gives-a-voice-to-unheard-communities")
                    .toPath("/2013/11/spotlight-winner-gives-a-voice-to-unheard-communities/")
                .fromLiferayUrlTitle("spotlight-draft-dennis-peterson")
                    .toPath("/2014/05/spotlight-where-are-they-now-multi-year-winner-dennis-peterson/")
                .fromLiferayUrlTitle("spotlight-transition-lab-s-collaborative-approach-to-sustainability")
                    .toPath("/2013/09/spotlight-transition-labs-collaborative-approach-to-sustainability/")
                .fromLiferayUrlTitle("spotlight-tackling-africa-s-adaptation-to-climate-change")
                    .toPath("/2013/09/spotlight-tackling-africas-adaptation-to-climate-change/")
                .fromLiferayUrlTitle("spotlight-sunk-investment-map-earns-cred-by-being-crowd-tested-and-expert-recommended")
                    .toPath("/2013/10/spotlight-sunk-investment-map-earns-cred-by-being-crowd-tested-and-expert-recommended/")
                .fromLiferayUrlTitle("popular-choice-award-winner-turned-contest-author")
                    .toPath("/2014/04/spotlight-popular-choice-award-winner-turned-contest-author/")
                .fromLiferayUrlTitle("spotlight-nicaraguan-ngo-s-most-ambitious-project-takes-home-the-judges-choice-award")
                    .toPath("/2013/10/spotlight-nicaraguan-ngos-most-ambitious-project-takes-home-the-judges-choice-award/")
                .fromLiferayUrlTitle("spotlight-mission-2030-founder-nominated-for-amazing-people-award-after-winning-climate-colab-contest")
                    .toPath("/2013/10/spotlight-mission-2030-founder-nominated-for-amazing-people-award-after-winning-climate-colab-contest/")
                .fromLiferayUrlTitle("spotlight-idei-s-idea-grows-through-the-climate-colab")
                    .toPath("/2013/09/spotlight-ideis-idea-grows-through-the-climate-colab/")
                .fromLiferayUrlTitle("developing-real-local-impacts-drop-by-drop-")
                    .toPath("/2014/04/spotlight-developing-real-local-impacts-drop-by-drop/")
                .fromLiferayUrlTitle("spotlight-colab-winner-sees-outpouring-of-international-support")
                    .toPath("/2013/10/spotlight-colab-winner-sees-outpouring-of-international-support/")
                .fromLiferayUrlTitle("spotlight-aiming-high-for-cleaner-energy-supplies")
                    .toPath("/2014/04/spotlight-aiming-high-for-cleaner-energy-supplies/")
                .fromLiferayUrlTitle("spotlight-2011-team-invites-new-members-refocuses-proposal-takes-home-2013-award")
                    .toPath("/2013/10/spotlight-2011-team-invites-new-members-refocuses-proposal-takes-home-2013-award/")
                .fromLiferayUrlTitle("semi-finalist-revision-period-now-open")
                    .toPath("/2014/08/semi-finalists-announced-revision-period-now-open/")
                .fromLiferayUrlTitle("semi-finalists-announced-in-14-contests")
                    .toPath("/2016/06/semi-finalists-announced-in-over-a-dozen-contests/")
                .fromLiferayUrlTitle("semi-finalists-announced-in-nike-s-materials-matter-contest")
                    .toPath("/2016/06/semi-finalists-announced-in-nikes-materials-matter-contest/")
                .fromLiferayUrlTitle("semi-finalists-and-finalists-announced-")
                    .toPath("/2015/07/semi-finalists-and-finalists-announced-revision-period-begins/")
                .fromLiferayUrlTitle("search-and")
                    .toPath("/2015/01/search-and-find-contests-faster-the-outline-view/")
                .fromLiferayUrlTitle("save-the-dates-climate-colab-conference-2016")
                    .toPath("/2016/06/save-the-date-climate-colab-conference-2016/")
                .fromLiferayUrlTitle("round-1-of-contest-ends-judging-now-underway")
                    .toPath("/2010/11/round-1-of-contest-ends-judging-now-underway/")
                .fromLiferayUrlTitle("revision-period-closes-for-14-contests")
                    .toPath("/2014/08/revision-period-closes-for-14-contests-still-open-for-4/")
                .fromLiferayUrlTitle("resilience-dialogues-a-new-online-platform")
                    .toPath("/2016/10/resilience-dialogues-a-new-online-platform-to-support-community-resilience/")
                .fromLiferayUrlTitle("regional-finalists-announced")
                    .toPath("/2015/09/regional-finalists-announced/")
                .fromLiferayUrlTitle("press-release-white-house-features-newly-launched-mit-climate-colab-energy-water-nexus-contest")
                    .toPath("/2016/03/press-release-white-house-features-newly-launched-mit-climate-colab-energy-water-nexus-contest/")
                .fromLiferayUrlTitle("press-release-mit-lab-opens-10-contests-on-climate-change-2016")
                    .toPath("/2016/02/press-release-mit-lab-opens-10-contests-on-climate-change/")
                .fromLiferayUrlTitle("press-release-mit-climate-colab-seeks-high-impact-ideas-on-how-to-tackle-climate-change")
                    .toPath("/2015/03/press-release-mit-climate-colab-seeks-high-impact-ideas-on-how-to-tackle-climate-change/")
                .fromLiferayUrlTitle("press-release-grand-prize-winners-announced-at-mit-climate-change-conference")
                    .toPath("/2014/11/press-release-grand-prize-winners-announced-at-mit-climate-change-conference/")
                .fromLiferayUrlTitle("press-release-grand-prize-winner-announced-2016")
                    .toPath("/2016/09/press-release-grand-prize-winner-announced-2016/")
                .fromLiferayUrlTitle("press-release-regional-global-contests-open")
                    .toPath("/2015/05/press-release-crowdsourcing-climate-strategy/")
                .fromLiferayUrlTitle("press-release-contest-winners-confront-climate-challenge")
                    .toPath("/2013/11/press-release-contest-winners-confront-climate-challenge/")
                .fromLiferayUrlTitle("press-release-addressing-climate-change-by-harnessing-the-power-of-youth")
                    .toPath("/2014/06/press-release-addressing-climate-change-by-harnessing-the-power-of-youth/")
                .fromLiferayUrlTitle("press-release-34-winning-proposals-to-combat-climate-change-announced")
                    .toPath("/2014/10/press-release-34-winning-proposals-to-combat-climate-change-announced/")
                .fromLiferayUrlTitle("one-week-left-to-vote")
                    .toPath("/2010/11/one-week-left-to-vote/")
                .fromLiferayUrlTitle("nsf-supports-climate-colab")
                    .toPath("/2010/09/nsf-supports-climate-colab/")
                .fromLiferayUrlTitle("now-open-build-a-regional-climate-action-plan")
                    .toPath("/2015/05/now-open-build-a-regional-climate-action-plan/")
                .fromLiferayUrlTitle("now-open-build-a-global-climate-action-plan")
                    .toPath("/2015/07/now-open-build-a-global-climate-action-plan/")
                .fromLiferayUrlTitle("prof-malone-presents-at")
                    .toPath("/2014/03/now-online-video-of-climate-colab-presentation-at-wgbh-innovation-idealab/")
                .fromLiferayUrlTitle("winter-2015-contests-launched")
                    .toPath("/2015/10/nike-city-of-boulder-and-others-run-new-contests-on-the-climate-colab/")
                .fromLiferayUrlTitle("new-workspaces-now-open-")
                    .toPath("/2016/05/new-workspaces-now-open/")
                .fromLiferayUrlTitle("new-features-to-make-it-easier-to-contribute-and-to-join-teams")
                    .toPath("/2011/07/new-features-to-make-it-easier-to-contribute-and-to-join-teams/")
                .fromLiferayUrlTitle("new-contests-open-janos-pasztor-visits-mit-and-colab-catalys-1")
                    .toPath("/2016/03/new-contests-open-janos-pasztor-visits-mit-and-colab-catalysts/")
                .fromLiferayUrlTitle("new-contests-launched-")
                    .toPath("/2014/03/new-contests-launched/")
                .fromLiferayUrlTitle("mit-news-confronting-climate-change-from-the-bottom-up")
                    .toPath("/2013/11/mit-news-confronting-climate-change-from-the-bottom-up/")
                .fromLiferayUrlTitle("mit-joins-global-hunt-for-ways-to-cut-carbon")
                    .toPath("/2016/01/mit-joins-global-hunt-for-ways-to-cut-carbon/")
                .fromLiferayUrlTitle("mit-welcomes-janos-pasztor-senior-advisor-to-un-secretary-general-on-climate")
                    .toPath("/2016/02/mit-climate-colab-welcomes-janos-pasztor-senior-advisor-to-un-secretary-general-on-climate-change/")
                .fromLiferayUrlTitle("mit-climate-colab-featured-in-mit-s-campaign-for-a-better-world")
                    .toPath("/2016/05/mit-climate-colab-featured-in-mits-campaign-for-a-better-world/")
                .fromLiferayUrlTitle("mit-climate-colab-and-nike-call-for-materials-innovation-to-combat-climate-change")
                    .toPath("/2015/09/mit-climate-colab-and-nike-call-for-materials-innovation-to-combat-climate-change/")
                .fromLiferayUrlTitle("mit-cci-celebrates-10-year-anniversary-")
                    .toPath("/2016/11/mit-cci-celebrates-10-year-anniversary/")
                .fromLiferayUrlTitle("featr")
                    .toPath("/2015/02/low-carbon-features-of-our-conferences/")
                .fromLiferayUrlTitle("limited-progress-seen-even-as-more-nations-step-up-on-climate")
                    .toPath("/2015/10/limited-progress-seen-even-as-more-nations-step-up-on-climate/")
                .fromLiferayUrlTitle("know-someone-with-a-good-idea-you-could-win-2000")
                    .toPath("/2013/05/know-someone-with-a-good-idea-you-could-win-2000/")
                .fromLiferayUrlTitle("new-workspaces-open-")
                    .toPath("/2016/01/kicking-off-the-new-year-2016/")
                .fromLiferayUrlTitle("judging-underway-finalists-announced-early-july")
                    .toPath("/2013/06/judging-underway-finalists-announced-early-july/")
                .fromLiferayUrlTitle("solve-colab-launched-")
                    .toPath("/2016/07/joint-contests-now-open-on-solve-colab/")
                .fromLiferayUrlTitle("introducing-climatex-mit-s-open-online-experiment-in-climate-action")
                    .toPath("/2016/10/ntroducing-climatex-an-open-online-experiment-in-climate-action-at-mit/")
                .fromLiferayUrlTitle("preparing-climate-colab-for-further-growth-developers-finish-liferay-transition")
                    .toPath("/2016/12/improvements-to-the-climate-colab-platform/")
                .fromLiferayUrlTitle("hydra-0-4-released")
                    .toPath("/2010/03/hydra-0-4-released/")
                .fromLiferayUrlTitle("grand-prize-winner-spotlight-sunsaluter")
                    .toPath("/2015/11/grand-prize-winner-spotlight-sunsaluter/")
                .fromLiferayUrlTitle("grand-prize-winner-spotlight-danielle-dahan")
                    .toPath("/2015/06/grand-prize-winner-spotlight-danielle-dahan/")
                .fromLiferayUrlTitle("climate-colab-featured-on-share-america")
                    .toPath("/2016/02/grand-prize-winner-featured-on-u-s-state-departments-share-america/")
                .fromLiferayUrlTitle("grand-prize-winner-2015")
                    .toPath("/2015/10/grand-prize-winner-2015/")
                .fromLiferayUrlTitle("global-contest-winners-announced-2015")
                    .toPath("/2015/12/global-contest-winners-announced-2015/")
                .fromLiferayUrlTitle("george-shultz-bob-inglis-and-phil-sharp-advise-mit-climate-colab-on-carbon-policy-contest")
                    .toPath("/2014/03/george-shultz-bob-inglis-and-phil-sharp-advise-mit-climate-colab-on-carbon-policy-contest/")
                .fromLiferayUrlTitle("white-house-features-climate-colab-four-new-contests")
                    .toPath("/2016/03/four-new-colab-contests-energy-nexus-contest-featured-by-white-house/")
                .fromLiferayUrlTitle("finalists-selected-vote-to-select-popular-choice-winners-")
                    .toPath("/2014/09/finalists-selected-vote-to-select-popular-choice-winners/")
                .fromLiferayUrlTitle("finalists-selected-vote-to-select-popular-choice-winner-2")
                    .toPath("/2015/08/finalists-selected-vote-to-select-popular-choice-winners-2/")
                .fromLiferayUrlTitle("final-round-of-16-undergoing-open-for-1")
                    .toPath("/2014/08/finalists-now-being-selected-for-17-contests/")
                .fromLiferayUrlTitle("finalists-eligible-for-voting")
                    .toPath("/2013/08/finalists-eligible-for-voting/")
                .fromLiferayUrlTitle("finalists-announced-vote-for-popular-choice-winners-")
                    .toPath("/2016/07/finalists-announced-vote-for-popular-choice-winners/")
                .fromLiferayUrlTitle("finalists-announced-in-climate-colab-2010-contest")
                    .toPath("/2010/11/finalists-announced-in-climate-colab-2010-contest/")
                .fromLiferayUrlTitle("finalist-results-announced-")
                    .toPath("/2013/07/finalist-results-announced/")
                .fromLiferayUrlTitle("fellow-spotlight-simone-targetti-ferri")
                    .toPath("/2014/07/fellow-spotlight-simone-targetti-ferri/")
                .fromLiferayUrlTitle("fellow-spotlight-")
                    .toPath("/2014/06/fellow-spotlight-shifting-behaviors/")
                .fromLiferayUrlTitle("fellow-spotlight-shane-easter")
                    .toPath("/2014/07/fellow-spotlight-shane-easter/")
                .fromLiferayUrlTitle("fellow-spotlight-salem-afeworki")
                    .toPath("/2014/08/fellow-spotlight-salem-afeworki/")
                .fromLiferayUrlTitle("fellow-spotlight-patrick-ray")
                    .toPath("/2015/06/fellow-spotlight-patrick-ray/")
                .fromLiferayUrlTitle("fellow-spotligh-1")
                    .toPath("/2015/06/fellow-spotlight-mustafa-ali/")
                .fromLiferayUrlTitle("fellow-spotlight-monika-dos-santos")
                    .toPath("/2015/05/fellow-spotlight-monika-dos-santos/")
                .fromLiferayUrlTitle("fellow-spotlight-lydia-omuko")
                    .toPath("/2015/05/fellow-spotlight-lydia-omuko/")
                .fromLiferayUrlTitle("fellow-spotlight-constructing-climate-change-solutions-through-buildings")
                    .toPath("/2014/05/fellow-spotlight-constructing-climate-change-solutions-through-buildings/")
                .fromLiferayUrlTitle("fellow-spotlight-compassion-in-climate-change")
                    .toPath("/2014/06/fellow-spotlight-compassion-in-a-warming-world/")
                .fromLiferayUrlTitle("fellow-spotlight-alleviating-poverty-and-reducing-emissions-tal-lee-anderman")
                    .toPath("/2014/06/fellow-spotlight-alleviating-poverty-and-reducing-emissions-tal-lee-anderman/")
                .fromLiferayUrlTitle("expert-input-for-proposals-submitted-by-august-31")
                    .toPath("/2011/08/expert-input-for-proposals-submitted-by-august-31/")
                .fromLiferayUrlTitle("entries-for-climate-colab-2010-contest-due-october-31")
                    .toPath("/2010/10/entries-for-climate-colab-2010-contest-due-october-31/")
                .fromLiferayUrlTitle("debate-barn-raising-is-the-earth-s-climate-changing-due-to-human-activity-")
                    .toPath("/2010/01/debate-barn-raising-is-the-earths-climate-changing-due-to-human-activity/")
                .fromLiferayUrlTitle("deadline-extended-for-select-contests")
                    .toPath("/2013/07/deadline-extended-for-select-contests/")
                .fromLiferayUrlTitle("crowds-climate-from-ideas-to-action-review")
                    .toPath("/2014/11/crowds-climate-from-ideas-to-action-a-review-of-the-2014-climate-colab-conference/")
                .fromLiferayUrlTitle("creative-commons-4-0")
                    .toPath("/2016/09/creative-commons-4-0/")
                .fromLiferayUrlTitle("contests-now-open-spring-2016")
                    .toPath("/2016/02/contests-now-open/")
                .fromLiferayUrlTitle("contests-close-in-one-month")
                    .toPath("/2014/06/contests-close-in-one-month/")
                .fromLiferayUrlTitle("contest-deadline-extended-")
                    .toPath("/2015/04/contest-deadlines-extended/")
                .fromLiferayUrlTitle("contest-deadline-extended-to-june-15")
                    .toPath("/2013/05/contest-deadline-extended-to-june-15/")
                .fromLiferayUrlTitle("congratulations-to-our-survey-winners-")
                    .toPath("/2014/12/congratulations-to-our-survey-raffle-winners/")
                .fromLiferayUrlTitle("collaboratorium-copenhagen-challenge-voting-ends-december-11")
                    .toPath("/2009/12/collaboratorium-copenhagen-challenge-voting-ends-december-11/")
                .fromLiferayUrlTitle("collaboratorium-copenhagen-challenge-final-round-winners-announced")
                    .toPath("/2009/12/collaboratorium-copenhagen-challenge-final-round-winners-announced/")
                .fromLiferayUrlTitle("collaboratorium-copenhagen-challenge-announced")
                    .toPath("/2009/09/collaboratorium-copenhagen-challenge-announced/")
                .fromLiferayUrlTitle("colab-talk-when-the-clock-strikes-midnight")
                    .toPath("/2011/09/colab-talk-when-the-clock-strikes-midnight/")
                .fromLiferayUrlTitle("colab-talk-voting-ends-tomorrow")
                    .toPath("/2011/11/colab-talk-voting-ends-tomorrow/")
                .fromLiferayUrlTitle("colab-talk-vote-for-the-finalists")
                    .toPath("/2011/11/colab-talk-vote-for-the-finalists/")
                .fromLiferayUrlTitle("colab-talk-two-ne")
                    .toPath("/2014/11/colab-talk-two-new-contests-conference-videos-now-available/")
                .fromLiferayUrlTitle("colab-talk-the-power-of-numbers")
                    .toPath("/2011/09/colab-talk-the-power-of-numbers/")
                .fromLiferayUrlTitle("colab-talk-special-contest-edition")
                    .toPath("/2011/07/colab-talk-special-contest-edition/")
                .fromLiferayUrlTitle("colab-talk-september-17-2011")
                    .toPath("/2011/09/colab-talk-september-17-2011/")
                .fromLiferayUrlTitle("colab-talk-save-the-date-")
                    .toPath("/2015/07/colab-talk-save-the-date/")
                .fromLiferayUrlTitle("colab-talk-one-week-to-submit-proposals-to-three-contests")
                    .toPath("/2016/01/colab-talk-one-week-to-submit-proposals-to-three-contests/")
                .fromLiferayUrlTitle("june")
                    .toPath("/2014/06/colab-talk-new-contests-plus-features-in-popular-science-grist-discovery-news/")
                .fromLiferayUrlTitle("colab-talk-new-conference-speakers-announced-")
                    .toPath("/2014/10/colab-talk-new-conference-speakers-announced/")
                .fromLiferayUrlTitle("colab-talk-mold-the-finalist-proposals")
                    .toPath("/2011/10/colab-talk-mold-the-finalist-proposals/")
                .fromLiferayUrlTitle("colab-talk-meeting-with-policymakers")
                    .toPath("/2012/01/colab-talk-meeting-with-policymakers/")
                .fromLiferayUrlTitle("colab-talk-new-contests-plus-features-in-popular-science-grist-discovery-news-")
                    .toPath("/2014/06/colab-talk-former-heads-of-state-advise-new-contest-on-youth-leadership/")
                .fromLiferayUrlTitle("colab-talk-crowds-climate-starts-next-week")
                    .toPath("/2014/10/colab-talk-crowds-climate-starts-next-week/")
                .fromLiferayUrlTitle("winner-spt")
                    .toPath("/2014/10/colab-talk-crowds-climate-program-released/")
                .fromLiferayUrlTitle("colab-talk-cop17-and-rio-20-intersessional")
                    .toPath("/2011/12/colab-talk-cop17-and-rio20-intersessional/")
                .fromLiferayUrlTitle("colab-talk-congratulations-to-our-winners")
                    .toPath("/2011/11/colab-talk-congratulations-to-our-winners/")
                .fromLiferayUrlTitle("colab-talk-colab-2012-brainstorm")
                    .toPath("/2012/04/colab-talk-colab-2012-brainstorm/")
                .fromLiferayUrlTitle("colab-talk-announcing-the-finalists")
                    .toPath("/2011/10/colab-talk-announcing-the-finalists/")
                .fromLiferayUrlTitle("colab-talk-2012-activities")
                    .toPath("/2012/03/colab-talk-2012-activities/")
                .fromLiferayUrlTitle("welcoming-two-new-members-of-the-climate-colab-team")
                    .toPath("/2016/02/colab-talk-10-contests-open-semifinalists-selected-welcoming-new-staff-members/")
                .fromLiferayUrlTitle("colab-talk-june-3-2011")
                    .toPath("/2011/06/colab-talk-june-3-2011/")
                .fromLiferayUrlTitle("colab-talk-august-24-2011")
                    .toPath("/2011/08/colab-talk-august-24-2011/")
                .fromLiferayUrlTitle("mit-competition-uses-crowdsourcing-to-find-climate-change-solutions")
                    .toPath("/2014/10/climatewire-mit-competition-uses-crowdsourcing-to-find-climate-change-solutions/")
                .fromLiferayUrlTitle("climate-collaboratorium-launches-new-site")
                    .toPath("/2009/11/climate-collaboratorium-launches-new-site/")
                .fromLiferayUrlTitle("climate-colab-featured-in-grist")
                    .toPath("/2015/06/climate-colab-winner-featured-in-grist/")
                .fromLiferayUrlTitle("climate-colab-used-in-mit-class")
                    .toPath("/2012/10/climate-colab-used-in-mit-class/")
                .fromLiferayUrlTitle("climate-colab-tedx-talk")
                    .toPath("/2015/11/climate-colab-tedx-talk/")
                .fromLiferayUrlTitle("contests-closing-soon-still-time-to-enter-")
                    .toPath("/2016/05/climate-colab-talk-contests-closing-soon-still-time-to-enter/")
                .fromLiferayUrlTitle("winners-announced-and-social-network-cash-prize")
                    .toPath("/2016/04/climate-colab-talk-announcing-winners-social-network-cash-prize/")
                .fromLiferayUrlTitle("climate-colab-reddit-ama-4-17-15")
                    .toPath("/2015/04/climate-colab-reddit-ama-41715/")
                .fromLiferayUrlTitle("climate-colab-project-enters-new-phase")
                    .toPath("/2012/08/climate-colab-project-enters-new-phase/")
                .fromLiferayUrlTitle("climate-colab-now-on-facebook-and-twitter")
                    .toPath("/2010/10/climate-colab-now-on-facebook-and-twitter/")
                .fromLiferayUrlTitle("climate-colab-nominated-for-prestigious-index-award")
                    .toPath("/2015/02/climate-colab-nominated-for-index-award/")
                .fromLiferayUrlTitle("climate-colab-membership-reaches-1000")
                    .toPath("/2010/11/climate-colab-membership-reaches-1000/")
                .fromLiferayUrlTitle("climate-colab-members-named-sxsw-eco-start-up-showcase-finalists")
                    .toPath("/2016/10/climate-colab-members-featured-as-sxsw-eco-startup-showcase-finalists/")
                .fromLiferayUrlTitle("climate-colab-is-in-paris-for-cop21")
                    .toPath("/2015/12/climate-colab-is-in-paris-for-cop21/")
                .fromLiferayUrlTitle("climate-colab-webinar-how-could-a-national-price-on-carbon-be-implemented-in-the-united-states-")
                    .toPath("/2014/07/climate-colab-in-the-press-former-reagan-official-predicts-republican-skeptics-will-be-mummed-by-climate-change/")
                .fromLiferayUrlTitle("climate-colab-hits-12-000-members-")
                    .toPath("/2014/06/climate-colab-hits-12000-members/")
                .fromLiferayUrlTitle("climate-colab-global-challenge-starts-oct-1-2010")
                    .toPath("/2010/09/climate-colab-global-challenge-starts-oct-1-2010/")
                .fromLiferayUrlTitle("climate-colab-featured-on-the-weather-channel")
                    .toPath("/2015/04/climate-colab-featured-on-the-weather-channel/")
                .fromLiferayUrlTitle("climate-colab-featured-in-the-guardian")
                    .toPath("/2014/04/climate-colab-featured-in-the-guardian/")
                .fromLiferayUrlTitle("climate-colab-featured-in-new-york-times-dot-earth")
                    .toPath("/2010/10/climate-colab-featured-in-new-york-times-dot-earth/")
                .fromLiferayUrlTitle("new-contest-harnessing-the-power-of-mit-alumni-to-address-climate-change")
                    .toPath("/2015/10/climate-colab-featured-in-mits-climate-action-plan/")
                .fromLiferayUrlTitle("climate-colab-featured-in-ideascale-blog")
                    .toPath("/2016/07/climate-colab-featured-in-ideascale-blog/")
                .fromLiferayUrlTitle("climate-colab-featured-in-climatewire")
                    .toPath("/2015/05/climate-colab-featured-in-climatewire/")
                .fromLiferayUrlTitle("climate-colab-contest-featured-in-national-geographic")
                    .toPath("/2016/06/climate-colab-contest-featured-on-national-geographic/")
                .fromLiferayUrlTitle("climate-colab-at-sxsw-eco")
                    .toPath("/2016/10/climate-colab-at-sxsw-eco/")
                .fromLiferayUrlTitle("climate-colab-at-cop-22-in-morocco")
                    .toPath("/2016/11/climate-colab-at-cop-22-in-morocco/")
                .fromLiferayUrlTitle("climate-colab-announces-winners-of-2010-contest")
                    .toPath("/2010/11/climate-colab-announces-winners-of-2010-contest/")
                .fromLiferayUrlTitle("climate-colab-2011-contest-starts-may-16")
                    .toPath("/2011/05/climate-colab-2011-contest-starts-may-16/")
                .fromLiferayUrlTitle("climate-colab-2010-contest-has-now-ended")
                    .toPath("/2010/11/climate-colab-2010-contest-has-now-ended/")
                .fromLiferayUrlTitle("city-of-cambridge-announces")
                    .toPath("/2015/04/city-of-cambridge-announces-contest-winners/")
                .fromLiferayUrlTitle("what-will-it-takenew-contest-a-global-plan-for-climate-change")
                    .toPath("/2014/06/can-we-create-a-global-plan-for-climate-change/")
                .fromLiferayUrlTitle("calling-all-proposals-")
                    .toPath("/2013/11/calling-all-proposals/")
                .fromLiferayUrlTitle("briefings-on-climate-colab-2010-contest-at-un-and-u-s-congress")
                    .toPath("/2011/01/briefings-on-climate-colab-2010-contest-at-un-and-u-s-congress/")
                .fromLiferayUrlTitle("boston-globe-to-address-climate-change-mit-lab-seeks-the-wisdom-of-crowds")
                    .toPath("/2015/05/boston-globe-to-address-climate-change-mit-lab-seeks-the-wisdom-of-crowds/")
                .fromLiferayUrlTitle("announcing-the-social-network-prize-")
                    .toPath("/2016/04/announcing-the-climate-colab-social-network-prize/")
                .fromLiferayUrlTitle("2016-climate-colab-winners-announced")
                    .toPath("/2016/08/2016-climate-colab-winners-announced/")
                .fromLiferayUrlTitle("2015-climate-colab-winners-announced")
                    .toPath("/2015/09/2015-winners-announced-by-mit-climate-colab/")
                .fromLiferayUrlTitle("how-campus-competitions-could-help-this-environmental-venture-scale")
                    .toPath("/2016/01/2015-winner-featured-in-bostinno/")
                .fromLiferayUrlTitle("2015-voting-period-is-closed")
                    .toPath("/2015/08/2015-voting-period-is-closed/")
                .fromLiferayUrlTitle("2015-contests-launched")
                    .toPath("/2015/03/2015-contests-launched/")
                .fromLiferayUrlTitle("2015-conference-in-review")
                    .toPath("/2015/10/2015-conference-confronting-climate-change-at-every-level-on-all-fronts/")
                .fromLiferayUrlTitle("2015-climate-colab-winners-announced")
                    .toPath("/2015/09/2015-climate-colab-winners-announced/")
                .fromLiferayUrlTitle("2014-crowds-climate-conference-now-open-for-registrati-1")
                    .toPath("/2014/09/2014-crowds-climate-conference-now-open-for-registration/")
                .fromLiferayUrlTitle("2014-contests-update")
                    .toPath("/2014/01/2014-contests-update/")
                .fromLiferayUrlTitle("16-contests-closed-what-s-nex-1")
                    .toPath("/2014/08/2014-contests-closed-whats-next/")
                .fromLiferayUrlTitle("winners-announced-2014")
                    .toPath("/2014/10/2014-climate-colab-winners-announced/")
                .fromLiferayUrlTitle("2012-2013-climate-colab-contest-winners")
                    .toPath("/2013/09/2012-2013-climate-colab-contest-winners/")
                .fromLiferayUrlTitle("2012-13-climate-colab-contest-entries-due-in-one-week")
                    .toPath("/2013/06/2012-13-climate-colab-contest-entries-due-in-one-week/")
                .fromLiferayUrlTitle("semi")
                    .toPath("/2015/06/14-contests-now-closed-semi-finalists-being-selected/")
                .fromLiferayUrlTitle("14-contests-enter-semi-finalist-selections")
                    .toPath("/2016/05/14-contests-enter-semi-finalist-selections/")
                .fromLiferayUrlTitle("1300-votes-and-winners-prediction-game")
                    .toPath("/2013/08/1300-votes-and-winners-prediction-game/")
                .fromLiferayUrlTitle("-10-0-grand-prize-at-nov-2013-conference")
                    .toPath("/2013/02/10000-grand-prize-at-nov-2013-conference/")

                //crowdsensor rewrites
                .fromLiferayUrlTitle("deadline-for-entries-extended-to-october-10")
                    .toContentPage("news-deadline-for-entries-extended-to-october-10")
                .fromLiferayUrlTitle("get-feedback-from-crowdsensor-s-judges")
                    .toContentPage("news-get-feedback-from-crowdsensor-s-judges")
                .fromLiferayUrlTitle("welcome-to-the-crowdsensor-")
                    .toContentPage("news-welcome-to-the-crowdsensor-")
                .fromLiferayUrlTitle("improve-your-chance-to-win-a-prize")
                    .toContentPage("news-improve-your-chance-to-win-a-prize")
                .fromLiferayUrlTitle("winners-announced")
                    .toContentPage("news-winners-announced");

        // Legacy url that shows up in search results
        configurationBuilder
                .addRule()
                    .when(Direction.isInbound().and(Path.matches("/community/-/blogs/2338554")))
                    .perform(Redirect.permanent("http://news.climatecolab.com/2015/09/2015-winners-announced-by-mit-climate-colab/"));
    }

    private static class BlogRewriteBuilder {

        private final SimpleRewriteBuilder rewriteBuilder;

        private BlogRewriteBuilder(ConfigurationBuilder configurationBuilder) {
            this.rewriteBuilder = SimpleRewriteBuilder.of(configurationBuilder);
        }

        public static BlogRewriteBuilder of(ConfigurationBuilder configurationBuilder) {
            return new BlogRewriteBuilder(configurationBuilder);
        }

        public ToStep fromLiferayUrlTitle(String urlTitle) {
            return new ToStep(urlTitle);
        }

        private class ToStep {

            private final String urlTitle;

            public ToStep(String urlTitle) {
                this.urlTitle = urlTitle;
            }

            public BlogRewriteBuilder toPath(String newUriPath) {
                return to("http://news.climatecolab.com" + newUriPath);
            }

            public BlogRewriteBuilder toContentPage(String pageTitle) {
                return to("/page/" + pageTitle);
            }

            public BlogRewriteBuilder to(String to) {
                rewriteBuilder
                        .redirectFrom("/community/-/blogs/" + urlTitle)
                            .andFrom("/news/-/blogs/" + urlTitle)
                            .andFrom("/web/guest/news/-/blogs/" + urlTitle)
                            .andFrom("/web/guest/community/-/blogs/" + urlTitle)
                        .to(to);
                return BlogRewriteBuilder.this;
            }
        }
    }
}
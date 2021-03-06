package org.xcolab.view.taglibs.xcolab.jspTags.discussion.actions;

import org.xcolab.client.comment.pojo.CommentThread;
import org.xcolab.client.proposals.ProposalClient;
import org.xcolab.client.proposals.ProposalClientUtil;
import org.xcolab.client.proposals.exceptions.ProposalNotFoundException;
import org.xcolab.client.proposals.pojo.Proposal;
import org.xcolab.view.pages.proposals.discussion.ProposalDiscussionPermissions;
import org.xcolab.view.taglibs.xcolab.jspTags.discussion.DiscussionPermissions;

import javax.servlet.http.HttpServletRequest;

public abstract class BaseDiscussionsActionController {

    protected DiscussionPermissions getDiscussionPermissions(HttpServletRequest request,
            CommentThread commentThread) {
        final ProposalClient proposalClient = ProposalClientUtil.getClient();

        if (commentThread.getCategory() == null) {
            final Proposal proposal = getProposal(proposalClient, commentThread);
            if (proposal != null) {
                return new ProposalDiscussionPermissions(request, proposal);
            }
        }
        return new DiscussionPermissions(request);
    }

    protected Proposal getProposal(ProposalClient proposalClient, CommentThread commentThread) {
        try {
            return proposalClient.getProposalByThreadId(commentThread.getId());
        } catch (ProposalNotFoundException e) {
            return null;
        }
    }
}

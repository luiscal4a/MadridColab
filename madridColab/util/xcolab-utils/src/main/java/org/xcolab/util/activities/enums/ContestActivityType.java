package org.xcolab.util.activities.enums;

public enum ContestActivityType implements ActivityType {

    COMMENT_ADDED,
    PROPOSAL_CREATED
    ;

    @Override
    public ActivityCategory getCategory() {
        return ActivityCategory.CONTEST;
    }
}

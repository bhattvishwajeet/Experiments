package com.vbsoft.issues;

public abstract class DesignIssue {

	protected String programName;
	protected String projectName;
	protected String eventName;
	protected String activityName;
	protected ApprovalBehavior ab;
	
	public abstract boolean submitForReview();
	public abstract boolean closeIssue();
	public abstract boolean cancelIssue();
	
	
	
	
}

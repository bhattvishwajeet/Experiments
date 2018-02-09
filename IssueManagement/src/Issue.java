import java.util.*;
public abstract class Issue {

	protected String controlNumber;
	protected ArrayList<String> assigneeList;
	protected ApprovalBehavior approvalBehavior;
	
	protected Issue() {
		
	}
	
	protected void setApprovalBehavior(ApprovalBehavior approvalBehavior) {
		this.approvalBehavior = approvalBehavior;
	}
	
	protected void approveIssue() {
		approvalBehavior.approve();
	}
	
	
	
}

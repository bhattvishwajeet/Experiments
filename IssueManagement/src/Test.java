
public class Test {

	public static void main(String args[]) throws Exception{
	
		/*
		ExpertCertificationIssue exIssue = new ExpertCertificationIssue();
		exIssue.approveIssue();
		
		ZoneIssue zoneIssue = new ZoneIssue();
		zoneIssue.approveIssue();
		*/
	
		ExpertCertificationIssue exIssue = new ExpertCertificationIssue();
		exIssue.setApprovalBehavior(new ApprovalByChiefEvaluator());
		exIssue.approveIssue();
		
		ZoneIssue zoneIssue = new ZoneIssue();
		zoneIssue.setApprovalBehavior(new ApprovalByAssignees());
		zoneIssue.approveIssue();
		
		
		
	}
	
}

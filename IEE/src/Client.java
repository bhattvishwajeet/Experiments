import java.util.ArrayList;

import com.vbsoft.issues.DAOIssueSummaryForPIC;
import com.vbsoft.issues.DesignIssue;
import com.vbsoft.issues.IssueFactory;

public class Client {
	
	public static void main(String args[]) throws Exception{
		System.out.println("I want to create issues !");
		DesignIssue di = IssueFactory.createExpertCertificationIssue("Vishwajeet","Bhatt");
		di.closeIssue();

		DAOIssueSummaryForPIC pis = new DAOIssueSummaryForPIC();
		ArrayList <String> list = pis.getAssignedIssues();
		System.out.println("the list of issues:"+list);

	}
}

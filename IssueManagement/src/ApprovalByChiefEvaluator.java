
public class ApprovalByChiefEvaluator implements ApprovalBehavior {

	@Override
	public void approve() {
		//this logic keeps changing
		System.out.println("Only Chief Evaluator can approve this issue.");
	}

}


public class ApprovalByChiefEvaluator implements ApprovalBehavior {

	@Override
	public void approve() {
		System.out.println("Only Chief Evaluator can approve this issue.");
	}

}

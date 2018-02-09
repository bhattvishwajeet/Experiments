package com.vbsoft.issues;



public class IssueFactory {

	/*
		public DesignIssue getSpec(String issueType) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
			DesignIssue designIssue;
			switch (issueType) {
			case "ExpertCertification":
				designIssue = new ExpertCertificationIssue();
				break;
			case "Zone":
				designIssue = new ZoneIssue();
				break;
			default:
				throw new ClassNotFoundException();
				
			}
			return designIssue;
		}
		*/
	
		public static ExpertCertificationIssue createExpertCertificationIssue(String evaluator, String requiredParam2) {
			ExpertCertificationIssue obj = new ExpertCertificationIssue.Builder(evaluator,requiredParam2).optionalParam1("OptionalParam1").build();
			return obj;
			
			
		}
		
	
	
}

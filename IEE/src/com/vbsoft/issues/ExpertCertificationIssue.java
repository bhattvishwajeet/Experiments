package com.vbsoft.issues;


class ExpertCertificationIssue extends DesignIssue {

	private String expertName;
	private String requiredParam2;
	
	static class Builder{
		
		private final String expertName;
		private final String requiredParam2;
		//optional parameters will not be final 
		private String optionalParam1="Project Name";
		private String optionalParam2="Program Name";
		
		public Builder(String expertName, String requiredParam2) {
			this.expertName = expertName;
			this.requiredParam2 = requiredParam2;
		}

		public Builder optionalParam1(String optionalParam1) {
			this.optionalParam1 = optionalParam1;
			return this;
		}
		
		public Builder optionalParam2(String optionalParam2) {
			this.optionalParam2 = optionalParam2;
			return this;
		}
		
		public ExpertCertificationIssue build() {
			return new ExpertCertificationIssue(this);
		}
		
	}
	
	private ExpertCertificationIssue(Builder builder) {
		expertName = builder.expertName;
		requiredParam2 = builder.requiredParam2;
		projectName = builder.optionalParam1;
		programName = builder.optionalParam2;
	}
	

	
	
	
	@Override
	public
	boolean submitForReview() {
		System.out.println("Submitting the expert certification issue for review");
		return false;
	}

	@Override
	public
	boolean closeIssue() {
		System.out.println("Submitting the expert certification issue for completion");
		return false;
	}

	@Override
	public boolean cancelIssue() {
		// TODO Auto-generated method stub
		return false;
	}

}

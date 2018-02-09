package com.vbsoft.issues;

class ZoneIssue extends DesignIssue {

	@Override
	public boolean submitForReview() {
		System.out.println("Submitting the zone issue for review");
		return false;
	}

	@Override
	public boolean closeIssue() {
		System.out.println("Submitting the expert certification issue for completion!");
		return false;
	}

	@Override
	public boolean cancelIssue() {
		// TODO Auto-generated method stub
		return false;
	}
	
}

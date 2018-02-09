package com.vbsoft.receivers;
import java.util.ArrayList;

public class IssueSummary {
	
	private String context;
	
	public IssueSummary(String context) {
		this.context = context;
	}
	
	public ArrayList getIssueSummary() {
		System.out.println("I am displaying the issue summary");
		return new ArrayList();
	}
	
}

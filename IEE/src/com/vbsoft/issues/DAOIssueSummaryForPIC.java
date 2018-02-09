package com.vbsoft.issues;

import java.util.ArrayList;

public class DAOIssueSummaryForPIC implements DAOIssueSummaryInterface{

	@Override
	public ArrayList<String> getAssignedIssues() {
		System.out.println("I will return the list of issues assigned to a PIC.");
		ArrayList<String> returnList = new ArrayList<String>();
		returnList.add("PIC1");
		returnList.add("PIC2");
		
		return returnList;
	}

}

package com.vbsoft.phone;



public class OSFactory {

	public OS getSpec(String sOS) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		OS osObject;
		switch (sOS) {
		case "IOS":
			osObject = new IOS();
			break;
		case "Android":
			osObject = new Android();
			break;
		default:
			throw new ClassNotFoundException();
			
		}
		return osObject;
	}
}

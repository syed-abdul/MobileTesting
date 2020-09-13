package org.test;

import java.util.List;

import io.appium.java_client.MobileElement;

public class Base {
	
	public static boolean isElementPresent(List<MobileElement> element1) {
		boolean isfount= false;
		if(element1.size()!=0) {
			isfount=true;
		}
		return isfount;

	}
	
	
}

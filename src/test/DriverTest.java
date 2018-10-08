package test;

import helper.EasyAutomationHelper;

public class DriverTest {

	// This will test browser launch with a particular URL
	public static void main(String[] args) {
		
		EasyAutomationHelper easy_automation = new EasyAutomationHelper();
		easy_automation.openApp();
		easy_automation.closeApp();
	}

}

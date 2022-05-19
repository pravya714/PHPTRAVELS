package com.phptravelsnew.scripts;

import org.testng.annotations.Test;

import com.phptravelsnew.TestBase.TestBase;
import com.phptravelsnew.pages.CfMybooking;

public class MyBookingTestClass extends TestBase {
	
	CfMybooking objbkg; 
	@Test(priority=2)
	public void VerifyCfMybooking() throws Exception {
		
		//create cfmybooking object
		
		objbkg =new CfMybooking(driver);
		
		objbkg.clickmybooking();
		Thread.sleep(500);
		objbkg.clickViewVoucher();
		Thread.sleep(1000);
		
	}

}

package com.phptravelsnew.scripts;

import org.testng.annotations.Test;

import com.phptravels.utilities.ExcelUtility;
import com.phptravelsnew.TestBase.TestBase;
import com.phptravelsnew.pages.CfMybooking;
import com.phptravelsnew.pages.CfMyprofile;
import com.phptravelsnew.pages.Cfaddfund;
//import com.phptravelsnew.pages.CfMybooking;
import com.phptravelsnew.pages.CfendLogin;
import com.phptravelsnew.pages.Cflogout;

public class CustomerFrontEndTestClass extends TestBase{
	
	CfendLogin objLogin;
	CfMybooking objbkg; 
	CfMyprofile objmpl;
	Cfaddfund objafund;
	Cflogout objout;
	
	@Test(priority=1)
public void verifyCfendLogin() throws Exception {
			
			//create login page object
	    	objLogin=new CfendLogin(driver);
	    	
	    	objLogin.clickcfend();
	    	Thread.sleep(500);
	    	
	    	for(String winHandle :driver.getWindowHandles())
	    		{
	    		driver.switchTo().window(winHandle);
	    		}
	    	String Email=ExcelUtility.getCellData(0,0);
			String Password=ExcelUtility.getCellData(0,1);
		    objLogin.setEmail(Email);
		    Thread.sleep(1000);
		    
		    objLogin.setPassword(Password);
		    Thread.sleep(500);
		    
		    objLogin.clickLogin();
		    Thread.sleep(500);
	    	
		}
	
	@Test(priority=2)
	public void VerifyCfMybooking() throws Exception {
		
		//create cfmybooking object
		
		objbkg =new CfMybooking(driver);
		
		objbkg.clickmybooking();
		Thread.sleep(1000);
		String winHandleBefore = driver.getWindowHandle();
		
		objbkg.clickViewVoucher();
		Thread.sleep(5000);
		//switch to new window opened
		for(String winHandle:driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
		driver.close();//this will close new opened window
		//switch back to main window using this code
		driver.switchTo().window(winHandleBefore);
		
	}
	@Test(priority=3)
	public void VerifyCfaddfund() throws Exception {
		objafund=new Cfaddfund(driver);
		
		objafund.clickAddFunds();
		Thread.sleep(3000);
		objafund.clickPayWithpaypal();
		Thread.sleep(3000);
		objafund.clickPayNow();
		Thread.sleep(3000);
		objafund.clickBacktoInvoice();
		Thread.sleep(500);
		objafund.clickyes();
		Thread.sleep(500);
	
	}
	@Test(priority=4)
	public void VerifyCfMyprofile() throws Exception {
		
		objmpl= new CfMyprofile(driver);
		
		objmpl.clickMyProfile();
		Thread.sleep(2000);
		objmpl.clickaddress1();
		Thread.sleep(500);
		String Address1=ExcelUtility.getCellData(0,4);
		objmpl.setaddress1(Address1);
		Thread.sleep(1000);
		objmpl.clickUpdateProfile();
		Thread.sleep(500);
		
	}
	@Test(priority=5)
	public void VerifyCflogout() {
		objout=new Cflogout(driver);
		objout.clicklogout();
	}
}

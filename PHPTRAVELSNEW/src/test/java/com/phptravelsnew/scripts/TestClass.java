package com.phptravelsnew.scripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.phptravelsnew.pages.CfInvalid;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelsnew.TestBase.TestBase;

public class TestClass extends TestBase {
	
	
		
		CfInvalid objLogin;
		
		@Test(priority=2)
		public void verifyCfLoginpage() throws Throwable {
			
			//create login page object
	    	objLogin=new CfInvalid(driver);
	    	
	    
	    	String Email=ExcelUtility.getCellData(0,0);
			String Password=ExcelUtility.getCellData(0,1);
		    objLogin.setEmail(Email);
		    Thread.sleep(1000);
		    
		    objLogin.setPassword(Password);
		    driver.manage().timeouts().implicitlyWait(300,TimeUnit.SECONDS);
		    
		    objLogin.clickLogin();
		    Thread.sleep(500);
	    	
		}
		@Test(priority=1)
public void verifyCfInvalid() throws Exception {
			
			//create login page object
	    	objLogin=new CfInvalid(driver);
	    	
	    	objLogin.clickcfend();
	    	Thread.sleep(500);
	    	
	    	for(String winHandle :driver.getWindowHandles())
	    		{
	    		driver.switchTo().window(winHandle);
	    		}
	    	String Email=ExcelUtility.getCellData(0,2);
			String Password=ExcelUtility.getCellData(0,3);
		    objLogin.setEmail(Email);
		    Thread.sleep(1000);
		    
		    objLogin.setPassword(Password);
		    Thread.sleep(500);
		    
		    objLogin.clickLogin();
		    Thread.sleep(500);
	    	
		}

}

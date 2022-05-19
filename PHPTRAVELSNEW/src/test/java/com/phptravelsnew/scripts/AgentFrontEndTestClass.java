package com.phptravelsnew.scripts;

import com.phptravels.utilities.ExcelUtility;
import com.phptravelsnew.TestBase.TestBase;
import com.phptravelsnew.pages.AfAddfund;
import com.phptravelsnew.pages.AfHomepage;
import com.phptravelsnew.pages.AfLoginpage;
import com.phptravelsnew.pages.AfMybooking;
import com.phptravelsnew.pages.AfMyprofile;
import com.phptravelsnew.pages.AfhomeHotelsearch;
import com.phptravelsnew.pages.AgentFrontLogout;
import com.phptravelsnew.pages.AgentFrontftvbo;

import org.testng.annotations.Test;

public class AgentFrontEndTestClass extends TestBase {
	
	AfLoginpage objaflgn;
	AfMybooking objabkg;
	AfAddfund objafd;
	AfMyprofile objamp;
	AfHomepage objhome;
	AfhomeHotelsearch objhsrh;
	AgentFrontftvbo objftvbo;
	AgentFrontLogout objout;
	
	
	@Test(priority=1)
	public void VerifyAfLoginpage() throws Exception {
		
		objaflgn=new AfLoginpage(driver);
		
		objaflgn.clickafend();
    	Thread.sleep(500);
    	
    	for(String winHandle :driver.getWindowHandles())
    		{
    		driver.switchTo().window(winHandle);
    		}
    	String Email=ExcelUtility.getCellData(1,0);
		String Password=ExcelUtility.getCellData(1,1);
		objaflgn.setEmail(Email);
	    Thread.sleep(1000);
	    
	    objaflgn.setPassword(Password);
	    Thread.sleep(500);
	    
	    objaflgn.clickLogin();
	    Thread.sleep(500);
    	
	}
	
	@Test(priority=2)
	public void VerifyAfMybooking() throws Exception {
		
		//create Afmybooking object
		
		objabkg =new AfMybooking(driver);
		
		objabkg.clickmybooking();
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void VerifyAfAddfund() throws Exception {
		
		//create AfAddfund object
		
		objafd =new AfAddfund(driver);
		
		objafd.clickAddFunds();
		Thread.sleep(1000);
	}
	
	@Test(priority=4)
	public void VerifyAfMyprofile() throws Exception {
		
		//create AfMy profile object
		
		objamp =new AfMyprofile(driver);
		
		objamp.clickMyProfile();
		Thread.sleep(1000);
}
	@Test(priority=5)
	public void VerifyAfHomepage() throws Exception {
		
		//create AfHomepage object
		
		objhome =new AfHomepage(driver);
		
		objhome.clickhome();
		Thread.sleep(1000);
		
}
	@Test(priority=6)
	public void VerifyAfhomeHotelsearch() throws Exception{
		
		//create AfHomeHotelsearch  object
		
		objhsrh =new AfhomeHotelsearch(driver);
		
		objhsrh.searchHotel();
	}
	@Test(priority=7)
	public void VerifyAgentFrontftvbo() throws Exception{
		
		//create AfHomepage object
		
		objftvbo =new AgentFrontftvbo(driver);
		
		objftvbo.clickflights();
		Thread.sleep(2000);
		objftvbo.clickTours();
		Thread.sleep(2000);
		objftvbo.clickvisa();
		Thread.sleep(2000);
		objftvbo.clickBlog();
		Thread.sleep(3000);
		objftvbo.clickOffers();
		Thread.sleep(4000);
		objftvbo.clickUSD();
		Thread.sleep(4000);
		objftvbo.clickINR();
		Thread.sleep(4000);
		
	}


	@Test(priority=8)
	public void VerifyAgentFrontLogout() throws Exception{
		
		//create AgentFrontLogout object
		
		objout =new AgentFrontLogout(driver);
		
		objout.clickAccount();
		Thread.sleep(3000);
		
		objout.clickLogout();
	}	
	
		

	
	
}

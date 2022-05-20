package com.phptravelsnew.scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.utilities.ExcelUtility;
import com.phptravelsnew.TestBase.TestBase;
import com.phptravelsnew.pages.AbInvalidlogin;
import com.phptravelsnew.pages.AbLoginpage;
import com.phptravelsnew.pages.AdminBooking_page;
import com.phptravelsnew.pages.AdminLogout;
import com.phptravelsnew.pages.AfAddfund;
import com.phptravelsnew.pages.AfHomepage;
import com.phptravelsnew.pages.AfLoginpage;
import com.phptravelsnew.pages.AfMybooking;
import com.phptravelsnew.pages.AfMyprofile;
import com.phptravelsnew.pages.AfhomeHotelsearch;
import com.phptravelsnew.pages.AgentFrontLogout;
import com.phptravelsnew.pages.AgentFrontftvbo;
import com.phptravelsnew.pages.CfMybooking;
import com.phptravelsnew.pages.CfMyprofile;
import com.phptravelsnew.pages.Cfaddfund;
import com.phptravelsnew.pages.CfendLogin;
import com.phptravelsnew.pages.Cflogout;

public class TotalTestClass extends TestBase{
	
	CfendLogin objLogin;
	CfMybooking objbkg; 
	CfMyprofile objmpl;
	Cfaddfund objafund;
	Cflogout objout;
	AfLoginpage objaflgn;
	AfMybooking objabkg;
	AfAddfund objafd;
	AfMyprofile objamp;
	AfHomepage objhome;
	AfhomeHotelsearch objhsrh;
	AgentFrontftvbo objftvbo;
	AgentFrontLogout objout1;
	AbLoginpage objablgn;
	AbInvalidlogin objinvalid;
	
	AdminBooking_page bookingObj1;
	AdminBooking_page bookingObj2;
	AdminBooking_page bookingObj3;
	AdminBooking_page bookingObj4;
	AdminBooking_page bookingObj5;
	AdminLogout  objout2;
	
	
	
	
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
		
		@Test(priority=6)
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
		@Test(priority=7)
		public void VerifyAfMybooking() throws Exception {
			
			//create Afmybooking object
			
			objabkg =new AfMybooking(driver);
			
			objabkg.clickmybooking();
			Thread.sleep(1000);
		}
		@Test(priority=8)
		public void VerifyAfAddfund() throws Exception {
			
			//create AfAddfund object
			
			objafd =new AfAddfund(driver);
			
			objafd.clickAddFunds();
			Thread.sleep(1000);
		}
		
		@Test(priority=9)
		public void VerifyAfMyprofile() throws Exception {
			
			//create AfMy profile object
			
			objamp =new AfMyprofile(driver);
			
			objamp.clickMyProfile();
			Thread.sleep(1000);
	}
		@Test(priority=10)
		public void VerifyAfHomepage() throws Exception {
			
			//create AfHomepage object
			
			objhome =new AfHomepage(driver);
			
			objhome.clickhome();
			Thread.sleep(1000);
			
	}
		@Test(priority=11)
		public void VerifyAfhomeHotelsearch() throws Exception{
			
			//create AfHomeHotelsearch  object
			
			objhsrh =new AfhomeHotelsearch(driver);
			
			objhsrh.searchHotel();
		}
		@Test(priority=12)
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


		@Test(priority=13)
		public void VerifyAgentFrontLogout() throws Exception{
			
			//create AgentFrontLogout object
			
			objout1 =new AgentFrontLogout(driver);
			
			objout1.clickAccount();
			Thread.sleep(3000);
			
			objout1.clickLogout();
		}	
		@Test(priority=14)
		public void VerifyAdminlogin() throws Exception {
			
			objinvalid=new AbInvalidlogin(driver);
			
			 objinvalid.clickabend();
			   Thread.sleep(1000);
			   
			   for(String winHandle :driver.getWindowHandles())
				{
				driver.switchTo().window(winHandle);
				}
			String Email=ExcelUtility.getCellData(2,0);
			String Password=ExcelUtility.getCellData(2,1);
			objinvalid.setEmail(Email);
		   Thread.sleep(1000);
		   
		   objinvalid.setPassword(Password);
		   Thread.sleep(500);
		   
		   objinvalid.clickLogin();
		   Thread.sleep(500);
			
			
		}
		@Test(priority=15)
		public void Test_bookingslink() throws InterruptedException
		{
			bookingObj1=new AdminBooking_page(driver);
			Thread.sleep(4000);
			bookingObj1.test_bookingLink();
			Thread.sleep(3000);
			String title = "All Bookings View";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Admin Booking link is clickable..");
	        }
	        catch(AssertionError e)
	        {
	        System.out.println("Admin  Booking link not working ..!");        	 
	        }
				
		}
		
		@Test(priority=16)
		public void Display_Invoice() throws InterruptedException
		{
			bookingObj4=new AdminBooking_page(driver);
			bookingObj4.display_invoice();
			Thread.sleep(3000);
			String title = "Flight Invoice - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Booking Invoice is Displayed..");
	        }
	        catch(AssertionError e)
	        {
	        System.out.println("Booking invoice not displayed...!");        	 
	        }
			
		}
		@Test(priority=17)
		public void Delete_Record() throws InterruptedException
		{
			bookingObj2=new AdminBooking_page(driver);
			bookingObj2.delete_record();
			Alert alert = driver.switchTo().alert(); // switch to alert
			Thread.sleep(4000);
			alert.accept();
			Thread.sleep(3000);
		}
		@Test(priority=18)
		public void test_websiteLink() throws InterruptedException
		{
			
			bookingObj3=new AdminBooking_page(driver);
			bookingObj3.test_website();
			String title = "PHPTRAVELS | Travel Technology Partner - PHPTRAVELS";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Website link is clickable..");
	        }
	        catch(AssertionError e)
	        {
	        System.out.println("Website link not clickable...!");        	 
	        }
			
		}

		
		@Test(priority=19)
		public void BookingStatus_Change() throws InterruptedException
		{
			bookingObj5=new AdminBooking_page(driver);
			bookingObj5.Change_StatusRecord();
			System.out.println("Booking status is changed from pending to Confirm...");
		}
		
		@Test(priority=20)
		public void VerifyAdminLogout() throws InterruptedException
		{
			objout2=new AdminLogout(driver);
			
			objout2.clickperson();
			Thread.sleep(1000);
			objout2.clickLogout();
			String title = "Administrator Login";	    
	        String actualTitle = driver.getTitle(); 
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Admin Logout successfully..");
	        }
	        catch(AssertionError e)
	        {
	        System.out.println("Admin is not logged out..!");        	 
	        }
	        driver.quit();
		}
		
		
			
		
	}



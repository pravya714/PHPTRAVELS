package com.phptravelsnew.scripts;

import com.phptravels.utilities.ExcelUtility;
import com.phptravelsnew.TestBase.TestBase;
import com.phptravelsnew.pages.AbInvalidlogin;
import com.phptravelsnew.pages.AbLoginpage;
import com.phptravelsnew.pages.AdminBooking_page;
import com.phptravelsnew.pages.AdminLogout;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminBackEndTestClass extends TestBase {
	
	AbLoginpage objablgn;
	AbInvalidlogin objinvalid;
	
	AdminBooking_page bookingObj1;
	AdminBooking_page bookingObj2;
	AdminBooking_page bookingObj3;
	AdminBooking_page bookingObj4;
	AdminBooking_page bookingObj5;
	AdminLogout  objout;
	
	
	
	@Test(priority=1)
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
	@Test(priority=2)
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
	
	@Test(priority=3)
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
	@Test(priority=4)
	public void Delete_Record() throws InterruptedException
	{
		bookingObj2=new AdminBooking_page(driver);
		bookingObj2.delete_record();
		Alert alert = driver.switchTo().alert(); // switch to alert
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(3000);
	}
	@Test(priority=5)
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

	
	@Test(priority=6)
	public void BookingStatus_Change() throws InterruptedException
	{
		bookingObj5=new AdminBooking_page(driver);
		bookingObj5.Change_StatusRecord();
		System.out.println("Booking status is changed from pending to Confirm...");
	}
	
	@Test(priority=7)
	public void VerifyAdminLogout() throws InterruptedException
	{
		objout=new AdminLogout(driver);
		
		objout.clickperson();
		Thread.sleep(1000);
		objout.clickLogout();
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

	


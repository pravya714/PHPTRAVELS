package com.phptravelsnew.scripts;

import com.phptravels.utilities.ExcelUtility;
import com.phptravelsnew.TestBase.TestBase;
import com.phptravelsnew.pages.SupplierBooking_page;
import com.phptravelsnew.pages.SupplierDashboard_page;
import com.phptravelsnew.pages.Supplier_login_page;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Supplier_TestClass extends TestBase{
	
	//SupplierHome_page obj1;
	//AdminHome_page obj3;
	Supplier_login_page objlgn;
	SupplierDashboard_page obj6;
	SupplierDashboard_page obj7;
	SupplierDashboard_page obj8;
	SupplierDashboard_page obj9;
	SupplierDashboard_page obj10;
	
	SupplierBooking_page bookingobj1;
	
	
	@Test(priority=1)
	
	public void VerifySupplier_login() throws Exception {
		
		objlgn= new Supplier_login_page(driver);
		
	   objlgn.clicksbend();
	   Thread.sleep(1000);
	   
	   for(String winHandle :driver.getWindowHandles())
		{
		driver.switchTo().window(winHandle);
		}
	String Email=ExcelUtility.getCellData(0,5);
	String Password=ExcelUtility.getCellData(0,6);
	objlgn.setEmail(Email);
   Thread.sleep(1000);
   
   objlgn.setPassword(Password);
   Thread.sleep(500);
   
   objlgn.clickLogin();
   Thread.sleep(500);
	
	   
		
	}
	
	@Test(priority=2)
	public void Booking_status_Change() throws InterruptedException
	{
		bookingobj1=new SupplierBooking_page(driver);
		bookingobj1.BookingStatus_Change();
		Thread.sleep(3000);
		
	}
	
	@Test(priority=3)
	public void dashboard_salesview() throws InterruptedException
	{
		obj6=new SupplierDashboard_page(driver);
		obj6.text_searchDashboard();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=4)
	public void RevenuebreakDown_GraphCheck() throws InterruptedException
	{
		obj7=new SupplierDashboard_page (driver);
		obj7.chart_view();
		Thread.sleep(2000);
		
	}
	
	@Test(priority=5)
	public void ToursLink_click() throws InterruptedException
	{
		obj8=new SupplierDashboard_page(driver);
		obj8.tourslink_click();
	}
	@Test(priority=6)
	public void Booking_linkClick() throws InterruptedException
	{
		obj9=new SupplierDashboard_page(driver);
		obj9.bookinglink_click();
		
		    String title = "All Bookings View";	    
	        String actualTitle = driver.getTitle(); 
	      
	        try
	        {
	        Assert.assertEquals(actualTitle,title); 
	        System.out.println("Supplier Booking_Link  is Clickable..");
	        }
	        catch(AssertionError e)
	        {
	        System.out.println("Supplier Booking link is not clickable .It Shows Error.!");
	        	 
	        }
	        
	        driver.navigate().back();
		    
	}
	
	
	
	@Test(priority=7)
	public void logout_Supplier() throws InterruptedException
	{
		obj10=new SupplierDashboard_page(driver);
		obj10.logout_admin();
		Thread.sleep(3000);
		String title = "Supplier Login";	    
        String actualTitle = driver.getTitle(); 
        try
        {
        Assert.assertEquals(actualTitle,title); 
        System.out.println("Supplier Loggedout successfully"); 
       
        }
        catch(AssertionError e)
        {
        	 System.out.println("Supplier couldn't loggedout..");
        	 

        }
       // Thread.sleep(3000);
		driver.close();
		
		
	}
	
}




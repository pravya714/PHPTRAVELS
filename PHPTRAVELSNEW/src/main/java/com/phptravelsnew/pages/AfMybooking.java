package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfMybooking {
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements 

@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")
private WebElement  MyBookings;
@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr/td[4]/div/a")
private WebElement  ViewVoucher;

public AfMybooking(WebDriver driver){
   this.driver = driver;
   //This initElements method will create all WebElements
   PageFactory.initElements(driver, this);
}

public void clickmybooking() {
	 MyBookings.click();
	
}
	

}

package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class CfMybooking extends TestBase{
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements 

@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")
private WebElement  MyBookings;
@FindBy(xpath="//a[@href='https://www.phptravels.net/flights/booking/invoice/4281/2']")
private WebElement  ViewVoucher;

public CfMybooking(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void clickmybooking() {
	 MyBookings.click();
	
}
public void clickViewVoucher() {
	 ViewVoucher.click();
}

}

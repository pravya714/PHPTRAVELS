package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class CfMyprofile extends TestBase {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements 
@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
private WebElement  MyProfile;
@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/table/tbody/tr[11]/td[3]/div/input")
private WebElement address1;
@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
private WebElement UpdateProfile;

public CfMyprofile(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void clickMyProfile() {
	MyProfile.click();
}
	public void clickaddress1() {
		address1.click();
	}
	public void setaddress1(String straddress1) {
		address1.clear();
		//address1.sendKeys(straddress1);
	}
    public void clickUpdateProfile() {
    	UpdateProfile.click();
    }
}

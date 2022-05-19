package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class AfMyprofile extends TestBase {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements 
@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
private WebElement  MyProfile;

public AfMyprofile(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void clickMyProfile() {
	MyProfile.click();
}

}

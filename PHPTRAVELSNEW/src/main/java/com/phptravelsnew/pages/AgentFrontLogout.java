package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class AgentFrontLogout extends TestBase {
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements

@FindBy(xpath="//button[contains(.,'Account')]")
private WebElement Account ;
@FindBy(xpath="//a[@href='https://www.phptravels.net/account/logout']")
private WebElement Logout;

public AgentFrontLogout(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
public void clickAccount() {
	Account.click();
}

public void clickLogout() {
	 Logout.click();
	
}

}

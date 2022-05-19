package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class AbInvalidlogin extends TestBase{
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements
	
@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[4]/div/div/div[2]/div/div/div[1]/div/a/small")
private WebElement abend;
@FindBy(name="email")
private WebElement email;
@FindBy(name="password")
private WebElement password;
@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
private WebElement Login;

public AbInvalidlogin(WebDriver driver){
this.driver = driver;
//This initElements method will create all WebElements
PageFactory.initElements(driver, this);
}

public void clickabend() {
	abend.click();
}
//set email
public void setEmail(String strEmail) {
	email.sendKeys(strEmail); 
}
//set password
public void setPassword(String strPassword) {
	 password.sendKeys(strPassword);
}

public void clickLogin() {
	Login.click();
}

	
	

}

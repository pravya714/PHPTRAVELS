package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class CfLoginpage extends TestBase{
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements
	
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")
	private WebElement Login;
	
	public CfLoginpage(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}
	
	
	//set email
	public void setEmail(String strEmail) {
		email.clear();
		email.sendKeys(strEmail); 
	}
	//set password
	public void setPassword(String strPassword) {
		password.clear();
		 password.sendKeys(strPassword);
	}
	
	public void clickLogin() {
		Login.click();
	}
	

}

package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class Supplier_logout extends TestBase{
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

@FindBy(xpath="//*[@id=\"dropdownMenuProfile\"]/i")
private WebElement person;
@FindBy(xpath="//a[@href='https://www.phptravels.net/api/admin/logout']")
private WebElement Logout;

public Supplier_logout(WebDriver driver){
	   this.driver = driver;
	   //This initElements method will create all WebElements
	   PageFactory.initElements(driver, this);
	}
public void clickperson() {
	person.click();
}
public void clickLogout() {
	Logout.click();
}


}

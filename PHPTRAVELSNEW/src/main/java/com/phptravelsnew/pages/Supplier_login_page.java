package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class Supplier_login_page extends TestBase{

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements


@FindBy(xpath="//*[@id=\"Main\"]/section[1]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/a/small")
private WebElement sbend;
@FindBy(xpath="/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[1]/label/input")
private WebElement email;
@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input")
private WebElement password;
@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]")
private WebElement submit;


public Supplier_login_page(WebDriver driver){
 this.driver = driver;
 //This initElements method will create all WebElements
 PageFactory.initElements(driver, this);
}

public void clicksbend() {
	sbend.click();
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
	submit.click();
}

	 
}




package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cfaddfundnew {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements 
@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a")
private WebElement  AddFunds;
@FindBy(xpath="//*[@id=\"myTab\"]/label/label/div/div/div[1]/span")
private WebElement PayWithpaypal;
@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button")
private WebElement PayNow; 
@FindBy(xpath="/html/body/div/div/div/div/div[1]")
private WebElement PayPal;
@FindBy(xpath="//*[@id=\"email\"]")
private WebElement email;
@FindBy(xpath="//*[@id=\"btnNext\"]")
private WebElement btnNext;
@FindBy(xpath="//*[@id=\"password\"]")
private WebElement password;
@FindBy(xpath="//*[@id=\"btnLogin\"]")
private WebElement btnLogin;
@FindBy(xpath="//*[@id=\"confirmButtonTop\"]")
private WebElement confirmButtonTop;



public Cfaddfundnew(WebDriver driver){
	   this.driver = driver;
	   //This initElements method will create all WebElements
	   PageFactory.initElements(driver, this);
	}
 public void clickAddFunds() {
	AddFunds.click();
	
 }
 public void clickPayWithpaypal() {
 PayWithpaypal.click();
 }
 public void clickPayNow() {
  PayNow.click(); 
 }
 public void clickPayPal() {
  PayPal.click();
 }
// WebElement email = driver.findElement(By.id(“user_email_login”));
 
public void login_paypal(String email_value,String password_value) throws InterruptedException {
	Thread.sleep(3000);
	email.click();
	Thread.sleep(3000);
	email.sendKeys(email_value);
	Thread.sleep(2000);
	//email.sendKeys(String sb-itxir5994130);
	
	btnNext.click();
}

}

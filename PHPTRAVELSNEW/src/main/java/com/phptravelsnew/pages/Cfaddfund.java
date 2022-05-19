package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cfaddfund {
	
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


@FindBy(xpath="/html/body/div/div[2]/div[2]")
private WebElement BacktoInvoice;
@FindBy(xpath="/html/body/div/div[2]/div[1]/a")
private WebElement yes;




public Cfaddfund(WebDriver driver){
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
 public void clickBacktoInvoice() {
  BacktoInvoice.click();
 }
 public void clickyes() {
	 yes.click();
 }
}

package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class AgentFrontftvbo extends TestBase {
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements

@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
private WebElement flights;
@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a")
private WebElement Tours;
@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a")
private WebElement visa;
@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")
private WebElement Blog;
@FindBy(xpath="//a[@ href=\'https://www.phptravels.net/offers'and@title='offers']")
private WebElement Offers;
@FindBy(id="currency")
private WebElement USD;
@FindBy(xpath="//*[@id=\"fadein\"]/header/div[1]/div/div/div[2]/div/div/div[2]/div/ul/li[7]/a")
private WebElement INR;


public AgentFrontftvbo(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
public void clickflights() {
	flights.click();
}
public void clickTours() {
	Tours.click();
}

public void clickvisa() {
	visa.click();
}
public void clickBlog() {
	Blog.click();
}
public void clickOffers() {
	Offers.click();
}
public void clickUSD() {
	USD.click();
}
public void clickINR() {
	 INR.click();
}
	
}

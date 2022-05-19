package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class AFFlight extends TestBase{
	
	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements

@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
private WebElement flights;

public AFFlight(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}
public void clickflights() {
	flights.click();
}

}

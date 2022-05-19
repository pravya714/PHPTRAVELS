package com.phptravelsnew.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phptravelsnew.TestBase.TestBase;

public class AfhomeHotelsearch extends TestBase{
	

	 /** 
	  * All WebElements are identified by @FindBy annotation
*/
WebDriver driver;

//locating elements

@FindBy(xpath="//*[@id=\"select2-hotels_city-container\"]")
private WebElement search_hotel_first;
@FindBy(xpath="//*[contains(@class,'select2-search__field')]")
private WebElement search_hotel_second;
@FindBy(xpath="//*[@id=\"select2-hotels_city-results\"]")
private WebElement search_hotel_third;
@FindBy(xpath="//*[@id=\"submit\"]")
private WebElement search_button;



public AfhomeHotelsearch(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}

public void searchHotel() throws InterruptedException {
	search_hotel_first.click();
	Thread.sleep(2000);
	search_hotel_second.sendKeys("Dubai");
	Thread.sleep(4000);
	search_hotel_third.click();
	Thread.sleep(3000);
	 search_button.click();
	 Thread.sleep(1000);
	
}


} 
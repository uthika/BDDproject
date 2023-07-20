package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	// 1. By Locators: Object Repository
	private By getStartedButton1 = By.xpath("//button[@class='btn']");
	private By homepage = By.xpath("//a[@class='navbar-brand']");
	
	private By homeGetStarted = By.linkText("Get Started");
	

	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3.page actions:features(behaviour) of the page the form of methods
	public void clickGetStarted() {
		driver.findElement(getStartedButton1).click();
		   
	}
	
	public String verifyHomePage() {
		 WebElement l=driver.findElement(homepage);
		 String value = l.getAttribute("href");
	     return value;
	}
	
	public void clickGetStarted(String option) {
		
		WebElement getStartedlink = driver.findElement(homeGetStarted);
		getStartedlink.click();
	}
	
	public void getErrorMessage() {
		
	}

}

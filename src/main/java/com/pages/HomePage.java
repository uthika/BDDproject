package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	// 1. By Locators: 
	private By getStartedButton1 = By.xpath("//button[@class='btn']");
	private By getStartedButton2 = By.xpath("//button[@class='btn']");
	

	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	

}

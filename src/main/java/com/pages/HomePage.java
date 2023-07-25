package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	
	// 1. By Locators: Object Repository
    //	private By getStartedButton1 = By.xpath("//button[@class='btn']");
	private By homepage = By.xpath("//a[@class='navbar-brand']");
	
	//private By homeGetStarted = By.linkText("Get Started");
	private By getStartedButton1 = By.xpath("//button[@class='btn']");
	private By Datastructure= By.xpath("//h5[text()='Data Structures-Introduction']/..//a");
	private By Array= By.xpath("//h5[text()='Array']/..//a");
	private By linkedlist= By.xpath("//h5[text()='Linked List']/..//a");
	private By Stack= By.xpath("//h5[text()='Stack']/..//a");
	private By Queue= By.xpath("//h5[text()='Queue']/..//a");
	private By Tree= By.xpath("//h5[text()='Tree']/..//a");
	private By Graph=By.xpath("//h5[text()='Graph']/..//a");
	//private By alert=By.xpath("//div[@class='alert alert-primary']");
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement alert;
	private By dropdown=By.xpath("//a[@class='nav-link dropdown-toggle']");
	private By signin=By.xpath("//a[text()='Sign in']");
	private By register=By.xpath("//a[text()=' Register ']");
	
	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	}
	
	//3.page actions:features(behaviour) of the page the form of methods
	public void clickGetStartedmain() {
		driver.findElement(getStartedButton1).click();
		   
	}
	public String gethomepagetitle()
	{
		String title=driver.getTitle();
		System.out.println("title"+title);
		return title;
	}
	
	public String verifyHomePage() {
		 WebElement l=driver.findElement(homepage);
		 String value = l.getAttribute("href");
	     return value;
	}
	
	public void clickGetStarted(String option) throws InterruptedException {
		
		switch(option)
		{
		case "Datastructures":
	    driver.findElement(Datastructure).click();
		break;
		case "Arrays":
			driver.findElement(Array).click();
		break;
		case "Linkedlist":
			driver.findElement(linkedlist).click();
		break;
		case "Stack":
			driver.findElement(Stack).click();
		break;
		case "Queue":
			driver.findElement(Queue).click();
		break;
		case "Tree":
			driver.findElement(Tree).click(); 
		break;
	
		}
	}
	
	public String getErrorMessage() {
		
		String errormessage=alert.getText();
		return errormessage;
	
		
		
	}
	
	public void clickdropdownoptions(String option)
	{
		driver.findElement(dropdown).click();
		driver.findElement(By.linkText(option)).click();
	}
	
	public void clicksignin()
	{
		driver.findElement(signin).click();
		
	}
	public String getsignurl()
	{
		WebElement s=driver.findElement(signin);
		String url1=s.getAttribute("href");
		return url1;
	}
	public void clickregister()
	{
		driver.findElement(register).click();
		
	}
	public String getregisterurl()
	{
		WebElement s=driver.findElement(register);
		String url2=s.getAttribute("href");
		return url2;
	}

}

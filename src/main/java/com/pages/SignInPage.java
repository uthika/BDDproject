package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;

public class SignInPage {
	
	private WebDriver driver;
	
	private @FindBy (xpath = "//input[@type = 'text']") WebElement uname;
	private @FindBy (xpath = "//input[@type = 'password']") WebElement pwd;
	
	private @FindBy (xpath= "//a[text()='Register!']") WebElement registerLink;
	private @FindBy (xpath= "//a[@href='/register']") WebElement registerLink2;
	private @FindBy (xpath= "//input[@value='Login']") WebElement loginBtn;
	private @FindBy (xpath = "//div[@class='alert alert-primary']") WebElement loginFailError;
	private @FindBy (xpath= "//a[@href='/logout']") WebElement signOutLink;
	private @FindBy (xpath= "//a[text()='Sign in']") WebElement signInLink;
	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSigIn() {
		
		signInLink.click();
	}
	

	public void registerclick() {
		registerLink.click();
	}
	
	public String isRegistrationPage() {
		return driver.getTitle();
		
	}
	
	public void verifySignInPage() {
        loginBtn.isDisplayed();		
	}
	
	public void invalidlogin(String username,String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public void isOnSignInPage() {
		driver.getTitle();		
	}
	
	public void getDataFromExcel(String username, String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
		
	}
	
	public String loginFailError() {
		loginFailError.isDisplayed();
		
		return loginFailError.getText();
	}
	
	public void validlogin(String username,String password) {
		uname.sendKeys(username);
		pwd.sendKeys(password);
	}
	
	public void checkSignOut() {
		signOutLink.click();
	}
	public void logoutSuccessMsg() {
		loginFailError.getText();
		System.out.println(loginFailError);
	}
}
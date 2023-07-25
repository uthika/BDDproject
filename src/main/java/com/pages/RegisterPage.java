package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;
import com.qa.util.LoggerLoad;

import io.cucumber.messages.types.Duration;

public class RegisterPage {
	private WebDriver driver;
	
	// 1. By Locators: Object Repository
	
	private @FindBy (xpath= "//a[text()= ' Register ']") WebElement registerLink;
	private @FindBy (xpath= "//input[@value='Register']") WebElement registerBtn;
	private @FindBy (name= "username") WebElement uname;
	private @FindBy (name= "password1") WebElement pwd1;
	private @FindBy (name= "password2") WebElement pwd2;
	private @FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;


	// 2. Constructor of the page class:
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}	
	//3.page actions:features(behavior) of the page the form of methods
	public void clickRegister() {
		registerBtn.click();
		}

	public void clearUsernameText() {
		
		uname.clear();
		
	}
	
    public void clearPwdText() {
		
		pwd1.clear();
		
	}
	
	public void warningUserName() {
		
		@SuppressWarnings("unused")
		String validationMessage = uname.getAttribute("validationMessage");
		LoggerLoad.info("Please fill out username field");
	}
	public void warningPassword(String String) {
		
		@SuppressWarnings("unused")
		String validationMessage = pwd1.getAttribute("validationMessage");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoggerLoad.info("Please fill out password  field");
	
	}
	public void warningconfirmPassword(String String) {

		@SuppressWarnings("unused")
		String validationMessage = pwd2.getAttribute("validationMessage");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoggerLoad.info("Please fill out password confirmation field");
	
	}
    public String verifyisregister()
    {
    	String title=driver.getTitle();
    	return title;
    }
    
    public void enterUsernameOnly(String username) {
    	uname.sendKeys(username);
    	
    }
    public void enterUsernameAndPasswordOnly(String username,String password) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	
    }
    
    public void enterinvalidvalues(String username, String password, String passwordconfirmation)
    
    {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    public String GetErrorMsg() {
		//LoggerLoad.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String wmes1=errorMsg.getText();
		//LoggerLoad.warn(wmes1);
		return wmes1;
	}
    
    public void usernameAlreadyExists(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    
    public void passwordNotMatch(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    public void passwordMinReq(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    public void passwordEntirelyNum(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    public void passwordNotSecure(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    
    public void passwordIsCommon(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
    public void validRegistration(String username, String password, String passwordconfirmation) {
    	uname.sendKeys(username);
    	pwd1.sendKeys(password);
    	pwd2.sendKeys(passwordconfirmation);
    }
}





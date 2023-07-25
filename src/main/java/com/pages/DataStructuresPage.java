package com.pages;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.LoggerLoad;

public class DataStructuresPage {
	
	private WebDriver driver;
	
//	private @FindBy (xpath= "//a[@href='/login']")WebElement signin;
	private @FindBy (xpath= "//a[text()='Sign in']") WebElement signin;
	private @FindBy (xpath="//input[@id='id_username']")WebElement Username ;
	private @FindBy (xpath="//input[@id='id_password']")WebElement password ;
	private @FindBy (xpath="//input[@value='Login']") WebElement login;
	private @FindBy (xpath="//a[text()='Get Started']")WebElement  datastructuregetstarted;
	private @FindBy (xpath="//h4[text()='Data Structures-Introduction']") WebElement datastructureintro;
	private @FindBy (xpath="//a[@href='time-complexity']")WebElement timecomplexitylink;
	private @FindBy (xpath="//a[@href='/tryEditor']")WebElement tryherelink;
	private @FindBy (xpath="//form/div/div/div/textarea")WebElement tryeditortext;
	private @FindBy (xpath ="//button[text()='Run']")WebElement runButton;
	private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	
	
	public DataStructuresPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void signInClick() {
		signin.click();
	}
	
	public void enterUserName(String username) {
		Username.click();
		Username.clear();
		Username.sendKeys(username);
	}

	public void enterPassword(String pwd) {
		password.click();
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void loginButton(){
		login.click();
		LoggerLoad.info("user enters valid username and password for data structure module");

	}
	
	public void dsClick() {
		datastructuregetstarted.click();		
	}
	
	public void verifydsIntro() {
		if(datastructureintro.isDisplayed()) {
			LoggerLoad.info("In the DS Intro Page");
		}
	}
	
	public void timecomplexity() {
		timecomplexitylink.click();
	}
	
	public String verifyTimeComplexity() {
		String title = driver.getTitle();
		return title;
	}
	public void tryhere() {
		tryherelink.click();
	}
	
	public String verifyTryEditor() {
		String title = driver.getTitle();
		return title;
		
	}
	
	public boolean verifyRunBtnisPresent() {
		return runButton.isDisplayed();
	}
	
	public void getExcelData(String pythoncode) {
		
		tryeditortext.sendKeys(pythoncode);
		
	}
	
	public void runPython() {
		runButton.click();
	}
	
	public String readOutput() {
		return output.getText();
	}
	
	public void clearTextEditor() {
		tryeditortext.clear();
		
	}
	public String alert() {
		// Wait for the alert to appear
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Get the text of the alert
		String alertText = alert.getText();

		// Accept or dismiss the alert
		alert.accept(); // To accept the alert
		// alert.dismiss(); // To dismiss the alert
	    LoggerLoad.warn("checking alert message from tryeditor "+ alertText );
	    return alertText;
	}
}



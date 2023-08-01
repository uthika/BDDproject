package com.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.LoggerLoad;

public class StackPage {
	
	public WebDriver driver;
	
	 private @FindBy (xpath= "//a[@class='nav-link dropdown-toggle']") WebElement drpdwn;
	 private @FindBy (linkText= "Stack") WebElement Stack;
	 private @FindBy (linkText= "Operations in Stack") WebElement operationStack;
	 private @FindBy (linkText= "Implementation") WebElement implementLink;
	 private @FindBy (linkText= "Applications") WebElement applStack;
	 private @FindBy (xpath= "//a[@class='btn btn-info']") WebElement tryhere;
	 private @FindBy (xpath= "//form/div/div/div/textarea") WebElement txtedit;
	 private @FindBy (xpath= "//button[@type='button']") WebElement runbtn;
	 private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	 
	
		
	 public StackPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
	 public void clickDropDown() {
		 drpdwn.click();
	 }
	 public void clickStack()
		{
			Stack.click();
		}
	 
	 public void clickOperationStack()
		{
			operationStack.click();
		}
	 public String getStackpagetitle()
		{
			String title=driver.getTitle();
			System.out.println("title"+title);
			return title;
		}
	 public boolean verifyTryhere()
		{
			return tryhere.isDisplayed();
		}
		
		public void clickTryhere()
		{
			tryhere.click();
		}
		
		public boolean verifyRun()
		{
			return runbtn.isDisplayed();
		}
		
		public void getExcelDataArray(String code1) 
		{
			txtedit.sendKeys(code1);
		}
		
		public void clickRunStack()
		{
			runbtn.click();
		}
		public String readOutput() {
			return output.getText();
		}
		public void clickimplementation()
		{
			implementLink.click();
		}
		public void clickapplication()
		{
			applStack.click();
		}
	 
	 public String alert() {
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			String alertText = alert.getText();
			alert.accept();
		    LoggerLoad.warn("checking alert message from tryeditor "+ alertText );
		    return alertText;
		}
	 
	 public void clicklinks(String stacklinks) {
	    	driver.findElement(By.linkText(stacklinks)).click();
	    	
	    }
	  public void clickAlllinks(String links) {
	    	driver.findElement(By.linkText(links)).click();
	    	
	    }
}

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

import com.qa.factory.DriverFactory;
import com.qa.util.LoggerLoad;

public class ArrayPage {
	public WebDriver driver;
	
	private @FindBy (xpath= "//a[@class='nav-link dropdown-toggle']") WebElement dsdrpdown;
	private @FindBy (linkText= "Arrays") WebElement arrays;
	private @FindBy (xpath= "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[2]//a[text()='Get Started']") WebElement arraygetsrt;
	private @FindBy (xpath= "//a[text()='Arrays in Python']") WebElement arraypyth;
	//private @FindBy (xpath= "//a[text()='Try here>>>']") WebElement tryhere;
	private @FindBy (xpath= "//a[@href='/tryEditor']") WebElement tryhere;
	private @FindBy (xpath= "//form/div/div/div/textarea") WebElement txteditor;
	private @FindBy (xpath ="//button[text()='Run']")WebElement runbtn;
	private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	private @FindBy (xpath ="//a[text()='Arrays Using List']")WebElement arraylst;
	
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickArrayfromdropdown()
	{
		dsdrpdown.click();
		arrays.click();
		
	}
	public void clickarraygetstr()
	{
		arraygetsrt.click();
	}
	
	public String getarrayhomepagetitle()
	{
		String title=driver.getTitle();
		System.out.println("title"+title);
		return title;
	}
	public void clickarrayinpython()
	{
		arraypyth.click();
	}
	public String getarraypythonpagetitle()
	{
		String title=driver.getTitle();
		System.out.println("title"+title);
		return title;
	}
	public void clicktryhere()
	{
		tryhere.click();
	}
	public boolean verifyText()
	{
		 return txteditor.isDisplayed();
		
	}
	public boolean verifyRun()
	{
		 return runbtn.isDisplayed();
		
	}
    public void getExcelDataArray(String pythoncode) {
		
		txteditor.sendKeys(pythoncode);
		
	}
	
	public void runPythonArray() {
		runbtn.click();
	}
	public String readOutput() {
		return output.getText();
	}
	public String alert() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertText = alert.getText();
		alert.accept();
	    LoggerLoad.warn("checking alert message from tryeditor "+ alertText );
	    return alertText;
	}
	public void clickArrayslist()
	{
		arraylst.click();
	}


	
	

}

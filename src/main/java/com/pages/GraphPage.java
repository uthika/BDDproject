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

public class GraphPage {
	public WebDriver driver;
	
	private @FindBy (xpath= "//a[@class='nav-link dropdown-toggle']") WebElement drpdwn;
	private @FindBy (xpath= "//h5[text()='Graph']/..//a") WebElement graphdrpdwn;
	private @FindBy (linkText= "Graph") WebElement graph;
	private @FindBy (xpath= "//a[text()='Graph']") WebElement graphlink;
	private @FindBy (xpath= "//a[@class='btn btn-info']") WebElement tryhere;
	private @FindBy (xpath= "//form/div/div/div/textarea") WebElement txtedit;
	private @FindBy (xpath= "//button[@type='button']") WebElement runbtn;
	private @FindBy (linkText= "Graph Representations") WebElement graphrep;
	private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	
	public GraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickGraphdrpdwn()
	{
		drpdwn.click();
	
	}
	
	public String getGraphpagetitle()
	{
		String title=driver.getTitle();
		System.out.println("title"+title);
		return title;
	}
	
	public void clickGraph()
	{
		graph.click();
	}
	
	public void clickGraphlink()
	{
		graphlink.click();
	}
	public void clickGraphreplink()
	{
		graphrep.click();
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
	
	public void clickRunGraph()
	{
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
    public boolean verifyGraphrep()
	{
		return graphrep.isDisplayed();
	}
	
	

}

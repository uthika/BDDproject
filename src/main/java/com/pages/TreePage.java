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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePage {
    public WebDriver driver;
	
    private @FindBy (xpath= "//a[@class='nav-link dropdown-toggle']") WebElement drpdwn;
	private @FindBy (linkText= "Tree") WebElement Tree;
	private @FindBy (linkText= "Overview of Trees") WebElement ovrTree;
	private @FindBy (xpath= "//a[@class='btn btn-info']") WebElement tryhere;
	private @FindBy (xpath= "//form/div/div/div/textarea") WebElement txtedit;
	private @FindBy (xpath= "//button[@type='button']") WebElement runbtn;
	private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	
	public TreePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickDatadrpdwn()
	{
		drpdwn.click();
	
	}
	public void clickTree()
	{
		Tree.click();
	}
	public String getTreepagetitle()
	{
		String title=driver.getTitle();
		System.out.println("title"+title);
		return title;
	}
	public void clickOvrTree()
	{
		ovrTree.click();
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
	
	public void clickRunTree()
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
    
    public void clicklinks(String treelinks) {
    	driver.findElement(By.linkText(treelinks)).click();
    	
    }
    public void clickAlllinks(String links) {
    	driver.findElement(By.linkText(links)).click();
    	
    }
   
    
   
	
	
}

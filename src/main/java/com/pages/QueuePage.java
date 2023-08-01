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

public class QueuePage {
	private WebDriver driver;
	
	private @FindBy (xpath= "//a[@class='nav-link dropdown-toggle']") WebElement dsdrpdown;
	private @FindBy (linkText= "Queue") WebElement queuedrpdown;
	private @FindBy (xpath= "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[5]//a[text()='Get Started']") WebElement queuegetsrt;
	private @FindBy(xpath="//div/ul/a[text()='Implementation of Queue in Python']") WebElement implementationofQueueinPythonLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement implementationofQueueinPythonTryHere;
	private @FindBy (xpath= "//form/div/div/div/textarea") WebElement EditorBox;
	private @FindBy(xpath="//button[@type='button']") WebElement RunBtn;
	private @FindBy(xpath="//div/ul/a[text()='Implementation using collections.deque']") WebElement implementationusingCollectionsDequeueLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement implementationusingCollectionsDequeueTryHere;
	private @FindBy(xpath="//div/ul/a[text()='Implementation using array']") WebElement implementationusingArrayLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement implementationusingArrayTryHere;
	private @FindBy(xpath="//div/ul/a[text()='Queue Operations']") WebElement queueOperationsLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement queueOperationsTryHere;
	private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	
	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void selectQueuefromDropdown() {
		dsdrpdown.click();
		queuedrpdown.click();
	}
	
	public void clickQueueGetStarted() {
		queuegetsrt.click();
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public void clickImplementationofQueueinPythonLink() {
		implementationofQueueinPythonLink.click();
	}
	
	public String verifyImplementationofQueueinPythonPage() {
		return driver.getTitle();
	}
	public void clickImplementationofQueueinPythonTryHere() {
		implementationofQueueinPythonTryHere.click();
	}
	public boolean verifyImplementationofQueueinPythonLinkTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void getExcelDataLinkedList(String pythoncode) {
		
		EditorBox.sendKeys(pythoncode);
		
	}
	
	public void runPythonQueue() {
		RunBtn.click();
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
	
	public void clickImplementationusingCollectionsDequeueLink() {
		implementationusingCollectionsDequeueLink.click();
	}
	
	public String verifyImplementationusingCollectionsDequeuePage() {
		return driver.getTitle();
	}
	
	public void clickImplementationusingCollectionsDequeueLinkTryHere() {
		implementationusingCollectionsDequeueTryHere.click();
	}
	public boolean verifyImplementationusingCollectionsDequeueLinkTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void clickimplementationusingArrayLink() {
		implementationusingArrayLink.click();
	}
	
	public String verifyImplementationusingArrayPage() {
		return driver.getTitle();
	}
	
	public void clickImplementationusingArrayTryHere() {
		implementationusingArrayTryHere.click();
	}
	public boolean verifyImplementationusingArrayLinkTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void clickQueueOperationsLink() {
		queueOperationsLink.click();
	}
	
	public String verifyQueueOperationsPage() {
		return driver.getTitle();
	}
	
	public void clickQueueOperationsTryHere() {
		queueOperationsTryHere.click();
	}
	public boolean verifyQueueOperationsTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	
	
}

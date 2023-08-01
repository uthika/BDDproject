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

public class LinkedListPage {
	private WebDriver driver;
	
	private @FindBy (xpath= "//a[@class='nav-link dropdown-toggle']") WebElement dsdrpdown;
	private @FindBy (linkText= "Linked List") WebElement linkedlistdrpdown;
	private @FindBy (xpath= "//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]//a[text()='Get Started']") WebElement linkedlistgetsrt;
	private @FindBy(xpath="//div/ul/a[text()='Introduction']") WebElement LlIntroductionLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement LlIntroductionTryHere;
	private @FindBy (xpath= "//form/div/div/div/textarea") WebElement EditorBox;
	private @FindBy(xpath="//button[@type='button']") WebElement RunBtn;
	private @FindBy(xpath="//div/ul/a[text()='Creating Linked LIst']") WebElement CreatingLinkedListLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement CreatingLinkedListTryHere;
	private @FindBy(xpath="//div/ul/a[text()='Types of Linked List']") WebElement TypesLinkedListLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement TypesLinkedListTryhere;
	private @FindBy(xpath="//div/ul/a[text()='Implement Linked List in Python']") WebElement ImplementLinkedListlink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement ImplementLinkedListTryhere;
	private @FindBy(xpath="//div/ul/a[text()='Traversal']") WebElement TraversalLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement TraversalTryhere;
	private @FindBy(xpath="//div/ul/a[text()='Insertion']") WebElement InsertionLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement InsertionTryhere;
	private @FindBy(xpath="//div/ul/a[text()='Deletion']") WebElement DeletionLink;
	private @FindBy(xpath="//a[@class='btn btn-info']") WebElement DeletionTryhere;
	private @FindBy (xpath ="//pre[@id='output']")WebElement output;
	
	
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void seleclLLfromDropdown() {
		dsdrpdown.click();
		linkedlistdrpdown.click();
	}
	
	public void clickLinkedListGetStarted() {
		linkedlistgetsrt.click();
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
	}
	
	public void clickIntroductionLink() {
		LlIntroductionLink.click();
	}
	
	public String verifyIntroductionPage() {
		return driver.getTitle();
	}
	public void clickIntroductionTryHere() {
		LlIntroductionTryHere.click();
	}
	public boolean verifyIntroductionTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void getExcelDataLinkedList(String pythoncode) {
		
		EditorBox.sendKeys(pythoncode);
		
	}
	
	public void runPythonLinkedList() {
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
	
	public void clickCreatingLinkedList() {
		CreatingLinkedListLink.click();
	}
	
	public String verifyCreatingLinkedListPage() {
		return driver.getTitle();
	}
	
	public void clickCreatingLinkedListTryHere() {
		CreatingLinkedListTryHere.click();
	}
	public boolean verifyCreatingLinkedListTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	//5 more
	
	public void clickTypesofLinkedList() {
		TypesLinkedListLink.click();
	}
	
	public String verifyTypesofLinkedListPage() {
		return driver.getTitle();
	}
	
	public void clickTypesofLinkedListTryHere() {
		TypesLinkedListTryhere.click();
	}
	public boolean verifyTypesofLinkedListTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void clickImplementLinkedListinPython() {
		ImplementLinkedListlink.click();
	}
	
	public String verifyImplementLinkedListinPythonPage() {
		return driver.getTitle();
	}
	
	public void clickImplementLinkedListinPythonTryHere() {
		ImplementLinkedListTryhere.click();
	}
	public boolean verifyImplementLinkedListinPythonTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void clickTraversalLink() {
		TraversalLink.click();
	}
	
	public String verifyTraversalPage() {
		return driver.getTitle();
	}
	
	public void clickTraversalTryHere() {
		TraversalTryhere.click();
	}
	public boolean verifyTraversalTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void clickInsertionLink() {
		InsertionLink.click();
	}
	
	public String verifyInsertionPage() {
		return driver.getTitle();
	}
	
	public void clickInsertionTryHere() {
		InsertionTryhere.click();
	}
	public boolean verifyInsertionTryEditor() {
		return RunBtn.isDisplayed();
	}
	
	public void clickDeletionLink() {
		DeletionLink.click();
	}
	
	public String verifyDeletionPage() {
		return driver.getTitle();
	}
	
	public void clickDeletionTryHere() {
		DeletionTryhere.click();
	}
	public boolean verifyDeletionTryEditor() {
		return RunBtn.isDisplayed();
	}

}

package com.stepdefinitions;
import org.testng.Assert;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.pages.SignInPage;
import com.pages.HomePage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;


public class SignInSteps {

	private HomePage homepage = new HomePage(DriverFactory.getDriver());
	private SignInPage signinpage = new SignInPage(DriverFactory.getDriver());
	
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		signinpage.clickSigIn();
	}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		signinpage.registerclick();
	
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	    String title =signinpage.isRegistrationPage();
	    Assert.assertEquals("Registration",title);
	    
	}
	

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password) {
		signinpage.clickSigIn();
	   signinpage.invalidlogin(username, password);
	   
	}
	@Then("click login button")
	public void click_login_button() throws InterruptedException {
	   signinpage.clickLoginBtn();
	   
	}

	

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheet1, Integer RowNumber ) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/SignIn.xlsx",Sheet1);
		String uname = testData.get(RowNumber).get("username");
		String pwd = testData.get(RowNumber).get("password");
		signinpage.getDataFromExcel(uname, pwd);
		
		
	}
	
	@Then("click login button to verify")
	public void click_login_button_to_verify() throws InterruptedException {
	   signinpage.clickLoginBtn();
	   String errorMsg = signinpage.loginFailError();
	   System.out.println("errorMsg"+errorMsg);
	   Assert.assertTrue(errorMsg.equals("Invalid Username and Password") || errorMsg.equals("You are logged in"));
	   
	   Thread.sleep(1000);
	   
	}

	@Given("The user is on the Sign in page")
	public void the_user_is_in_the_sign_in_page() {
		signinpage.checkSignOut();
		signinpage.clickSigIn();
		signinpage.verifySignInPage();
	   
	}

	@When("The user enters a valid {string} and {string}")
	public void the_user_enters_a_valid_and(String username, String password) {
	   signinpage.validlogin(username, password);
		
	}

	@Given("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
	   homepage.verifyHomePage();
	}
	

	@When("The user clicks on {string}")
	public void the_user_clicks(String string) throws InterruptedException {
    Thread.sleep(1000);
    signinpage.checkSignOut();
	}

	@Then("It should display the success message {string}")
	public void it_should_display_the_success_message(String string) {
	   
		signinpage.logoutSuccessMsg();
	}


}

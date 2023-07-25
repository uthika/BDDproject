package com.stepdefinitions;

import com.pages.DataStructuresPage;


import com.pages.HomePage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

public class DataStructureSteps {
	
	private HomePage home = new HomePage(DriverFactory.getDriver());
	private SignInPage signinpage = new SignInPage(DriverFactory.getDriver());
	private DataStructuresPage dspage=new DataStructuresPage(DriverFactory.getDriver());
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() throws InterruptedException {
//		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	    Thread.sleep(3000);
		dspage.signInClick();
	    
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String uname, String pass) {
	   dspage.enterUserName(uname);
	   dspage.enterPassword(pass);
	}

	@Then("The user click on login button")
	public void the_user_click_on_login_button() {
	    dspage.loginButton();
	}

	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		home.verifyHomePage();
		LoggerLoad.info("User is in home page");
	}

	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		dspage.dsClick();
	}

	@Then("The user should be redirected to data structure introduction page")
	public void the_user_should_be_redirected_to_data_structure_introduction_page() {
	    dspage.verifydsIntro();
	}
	
	@Given("The user is on {string} after logged in")
	public void the_user_is_on_after_logged_in(String string) {
		dspage.verifydsIntro();
		LoggerLoad.info("User is in Data structures intro page");
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
	    dspage.timecomplexity();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	    String title = dspage.verifyTimeComplexity();
	    Assert.assertEquals("Time Complexity", title);
	}
	
	@Given("The user is now on {string} after logged in")
	public void the_user_is_now_on_after_logged_in(String string) {
		 String title = dspage.verifyTimeComplexity();
		 Assert.assertEquals("Time Complexity", title);
		 LoggerLoad.info("User is on Time Complexity page");
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
	    dspage.tryhere();
	}

	@Then("The user should be directed to a tryEditor page")
	public void the_user_should_be_directed_to_a_try_editor_page() {
		String title = dspage.verifyTimeComplexity();
		 Assert.assertEquals("Assessment", title);
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    boolean run=dspage.verifyRunBtnisPresent();
	    Assert.assertEquals(run, true);
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		dspage.getExcelData(code);
		dspage.runPython();
	    
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
	   String output = dspage.readOutput();
	    LoggerLoad.info("Valid DS Intro module output"+output);
	    DriverFactory.getDriver().navigate().back();
	    dspage.tryhere();
	    
	}
	
	
	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws InvalidFormatException, IOException {
		
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		dspage.getExcelData(code);
		dspage.runPython();
	}


	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	    dspage.alert();
	}

}

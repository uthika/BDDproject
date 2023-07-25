package com.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.pages.RegisterPage;
import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	private RegisterPage registerpage = new RegisterPage(DriverFactory.getDriver());
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
	     String pagename=registerpage.verifyisregister();
	     System.out.println("The user is on registerpage:" +pagename);
		       
	}

	@When("he user clicks {string} button with all fields empty")
	public void he_user_clicks_button_with_all_fields_empty(String string) {
		registerpage.clickRegister();
	
	} 

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
	    registerpage.warningUserName();
	}

	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, DataTable dataTable) {
	  List<Map<String, String>> credList = dataTable.asMaps();
	  String username1 = credList.get(0).get("username");
	  registerpage.enterUsernameOnly(username1);
	}

	@Then("It should display an error {string} below Password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
	    registerpage.warningPassword(string);
	    registerpage.clearUsernameText();
	    
	}

	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String string2, String string3, DataTable dataTable) {
		List<Map<String, String>> credList = dataTable.asMaps();
		String username2 = credList.get(0).get("username");
		String password2 = credList.get(0).get("password");
		registerpage.enterUsernameAndPasswordOnly(username2, password2);
		registerpage.clickRegister();
	}

	@Then("It should display an error {string} below Password Confirmation textbox")
	public void it_should_display_an_error_below_password_confirmation_textbox(String string) {
	   registerpage.warningconfirmPassword(string);
	   registerpage.clearUsernameText();
	   registerpage.clearPwdText();
	}

	@When("The user enters a {string} with characters other than Letters, digits and {string}")
	public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, DataTable dataTable) {
	  List<Map<String, String>> credList = dataTable.asMaps();
	  String username3 = credList.get(0).get("username");
	  String password3 = credList.get(0).get("password");
	  String password4 = credList.get(0).get("password confirmation");
	  registerpage.enterinvalidvalues(username3,password3,password4);
	  registerpage.clickRegister();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	    registerpage.GetErrorMsg();
	}


	@When("The user enters a valid existing {string} with {string} and {string}")
	public void the_user_enters_a_valid_existing_with_and(String string, String string2, String string3, DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username4 = credList.get(0).get("username");
		 String password5 = credList.get(0).get("password");
		 String password6 = credList.get(0).get("password confirmation");
		 registerpage.usernameAlreadyExists(username4,password5,password6);
		 registerpage.clickRegister();
	}

	@When("The user clicks {string} button after entering valid {string} and different passwords in {string} and {string} fields")
	public void the_user_clicks_button_after_entering_valid_and_different_passwords_in_and_fields(String string, String string2, String string3, String string4, DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username5 = credList.get(0).get("username");
		 String password7 = credList.get(0).get("password");
		 String password8 = credList.get(0).get("password confirmation");
		 registerpage.passwordNotMatch(username5,password7,password8);
		 registerpage.clickRegister();
	}

	@When("The user enters a valid {string} and {string} with characters less than {int}")
	public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1, io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username6 = credList.get(0).get("username");
		 String password9 = credList.get(0).get("password");
		 String password10 = credList.get(0).get("password confirmation");
		 registerpage.passwordMinReq(username6,password9,password10);
		 registerpage.clickRegister();
	}

	@When("The user enters a valid {string} and {string} with only numbers")
	public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username7 = credList.get(0).get("username");
		 String password11 = credList.get(0).get("password");
		 String password12 = credList.get(0).get("password confirmation");
		 registerpage.passwordEntirelyNum(username7,password11,password12);
		 registerpage.clickRegister();
	}

	@When("The user enters a valid {string} and {string} similar to username")
	public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username8 = credList.get(0).get("username");
		 String password13 = credList.get(0).get("password");
		 String password14 = credList.get(0).get("password confirmation");
		 registerpage.passwordNotSecure(username8,password13,password14);
		 registerpage.clickRegister();
	}

	@When("The user enters a valid {string} and commonly used password {string}")
	public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username9 = credList.get(0).get("username");
		 String password15 = credList.get(0).get("password");
		 String password16 = credList.get(0).get("password confirmation");
		 registerpage.passwordIsCommon(username9,password15,password16);
		 registerpage.clickRegister();
	}

	@When("The user enters a valid {string} and {string} and {string}")
	public void the_user_enters_a_valid_and_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		 List<Map<String, String>> credList = dataTable.asMaps();
		 String username10 = credList.get(0).get("username");
		 String password17 = credList.get(0).get("password");
		 String password18 = credList.get(0).get("password confirmation");
		 registerpage.validRegistration(username10,password17,password18);
		 registerpage.clickRegister();
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String string) {
	    registerpage.GetErrorMsg();
	}



}

package com.stepdefinitions;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomeSteps {
	private HomePage homepage=new HomePage(DriverFactory.getDriver());
	

@Given("The user opens DS Algo portal link")
public void the_user_opens_ds_algo_portal_link() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
}

@When("The user clicks the {string} button")
public void the_user_clicks_the_button(String string) {
	
	homepage.clickGetStarted();
}

@SuppressWarnings("deprecation")
@Then("The user should be redirected to homepage")
public void the_user_should_be_redirected_to_homepage() {
	String title = homepage.verifyHomePage();
	Assert.assertTrue(title.contains("/home"));
	//Assert.assertEquals("/home", title);
	
}

@SuppressWarnings("deprecation")
@Given("The user is on Home page")
public void the_user_is_on_home_page() {
	String title = homepage.verifyHomePage();
	Assert.assertTrue(title.contains("/home"));
}

@When("The user clicks on Get Started link on homepage {string} without login")
public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
	homepage.clickGetStarted(option);
}

@Then("It should alert the user with a message {string}")
public void it_should_alert_the_user_with_a_message(String string) {
    
}

@When("The user clicks on dropdown {string} without login")
public void the_user_clicks_on_dropdown_without_login(String string) {
   
}

@Given("The user opens Home Page")
public void the_user_opens_home_page() {
    
}

@When("The user clicks {string}")
public void the_user_clicks(String string) {
    
}

@Then("The user should be redirected to Sign in page")
public void the_user_should_be_redirected_to_sign_in_page() {
   
}

@Then("The user should be redirected to Register form")
public void the_user_should_be_redirected_to_register_form() {
 
}


}

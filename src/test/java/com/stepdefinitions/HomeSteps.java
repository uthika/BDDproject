package com.stepdefinitions;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomeSteps {
	private HomePage homepage=new HomePage(DriverFactory.getDriver());
	public String expectedurl1="https://dsportalapp.herokuapp.com/login";
	public String expectedurl2="https://dsportalapp.herokuapp.com/register";
	public String expectedtitle="NumpyNinja";

@Given("The user opens DS Algo portal link")
public void the_user_opens_ds_algo_portal_link() {
	DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/");
}

@When("The user clicks the {string} button")
public void the_user_clicks_the_button(String string) {
	
	homepage.clickGetStartedmain();
}


@Then("The user should be redirected to homepage")
public void the_user_should_be_redirected_to_homepage() {
	String title = homepage.verifyHomePage();
	Assert.assertTrue(title.contains("/home"));

}


@Given("The user is on Home page")
public void the_user_is_on_home_page() {
	String title = homepage.verifyHomePage();
	//Assert.assertEquals(title,"https://dsportalapp.herokuapp.com/");	
}

@When("The user clicks on Get Started link on homepage {string} without login")
public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) throws InterruptedException {
	
	homepage.clickGetStarted(option);
}

@Then("It should alert the user with a message {string}")
public void it_should_alert_the_user_with_a_message(String message) {
	String errormessage=homepage.getErrorMessage();
	Assert.assertEquals(message,errormessage );
    
}

@When("The user clicks on dropdown {string} without login")
public void the_user_clicks_on_dropdown_without_login(String option) {
	homepage.clickdropdownoptions(option);
}



@When("The user clicks {string}")
public void the_user_clicks(String string) {

    homepage.clicksignin();
    homepage.clickregister();
}

@Then("The user should be redirected to Sign in page")
public void the_user_should_be_redirected_to_sign_in_page() {
  String actualurl1=homepage.getsignurl();
  Assert.assertEquals(actualurl1,expectedurl1);
  
  System.out.println(actualurl1);
  
}

@Then("The user should be redirected to Register form")
public void the_user_should_be_redirected_to_register_form() {
	String actualurl2=homepage.getregisterurl();
	Assert.assertEquals(actualurl2, expectedurl2);
}


}

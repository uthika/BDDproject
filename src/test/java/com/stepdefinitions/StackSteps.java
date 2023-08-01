package com.stepdefinitions;


import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.StackPage;

public class StackSteps {
	
	private StackPage stackpage=new StackPage(DriverFactory.getDriver());
	
	@Given("The user is navigated to the LinkedList Deletion Page")
	public void the_user_is_navigated_to_the_linked_list_deletion_page() {
	    DriverFactory.getDriver().navigate().back();

	}

	@When("The user clicks the Stack item from the drop down menu")
	public void the_user_clicks_the_stack_item_from_the_drop_down_menu() throws InterruptedException {
	    stackpage.clickDropDown();
	    stackpage.clickStack();
	    
	}

	@Then("The user should be presented with Stack Page")
	public void the_user_should_be_presented_with_stack_page() {
		String title=stackpage.getStackpagetitle();
		Assert.assertEquals(title,"Stack");
		stackpage.clickOperationStack();
	}

	@Given("The user is on the Operations in Stack Page with Tryhere link")
	public void the_user_is_on_the_operations_in_stack_page_with_tryhere_link() {
		stackpage.verifyTryhere();
	}
	
	@When("The user clicks the Tryhere link in Stack module")
	public void the_user_clicks_the_tryhere_link_in_stack_module() {
	    stackpage.clickTryhere();
	}
	

	@When("The user clicks the Tryhere link in {string} for Stack module")
	public void the_user_clicks_the_tryhere_link_in_for_stack_module(String string) {
	    stackpage.clickTryhere();
	}

	@Then("The user should be navigated to editor Page with Run button in Operations in Stack Page")
	public void the_user_should_be_navigated_to_editor_page_with_run_button_in_operations_in_stack_page() {
		stackpage.verifyRun();
	}

	@Given("The user is on the Operations in Stack Page from the Editor Page")
	public void the_user_is_on_the_operations_in_stack_page_from_the_editor_page() {
		DriverFactory.getDriver().navigate().back();
	}

	@When("The user clicks the {string} for Stack module")
	public void the_user_clicks_the_for_stack_module(String string) {
	    stackpage.clicklinks(string);
	}

	@When("The user click Try here link and enters the valid code from {string} and {int} for Stack module")
	public void the_user_click_try_here_link_and_enters_the_valid_code_from_and_for_stack_module(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		stackpage.clickTryhere();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		stackpage.getExcelDataArray(code1);
		stackpage.clickRunStack();
	}

	@Then("The user should be able to view the output in Stack module")
	public void the_user_should_be_able_to_view_the_output_in_stack_module() {
		 stackpage.readOutput();
	}
	
	@Given("The user is on the Operations in Stack Page")
	public void the_user_is_on_the_operations_in_stack_page() {
		DriverFactory.getDriver().navigate().back();
	}
	
	@When("The user clicks the {string} in  Stack module")
	public void the_user_clicks_the_in_stack_module(String string) {
		stackpage.clicklinks(string);
	}

	@When("The user click Try here link and enters the invalid code from {string} and {int} in Stack module")
	public void the_user_click_try_here_link_and_enters_the_invalid_code_from_and_in_stack_module(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		stackpage.clickTryhere();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		stackpage.getExcelDataArray(code1);
		stackpage.clickRunStack();
		
	}

	@Then("The user should be able to get the Error Message in Stack module")
	public void the_user_should_be_able_to_get_the_error_message_in_stack_module() {
		stackpage.alert();
	}

	@Given("The user is on the Stack Page to check all titles")
	public void the_user_is_on_the_stack_page_to_check_all_titles() {
		DriverFactory.getDriver().navigate().back();
	}

	@When("The user clicks the {string} in all Stack Page")
	public void the_user_clicks_the_in_all_stack_page(String links) {
		stackpage.clickAlllinks(links);
	}

	@Then("The user should be navigated to {string} of Stack Pages")
	public void the_user_should_be_navigated_to_of_stack_pages(String titles) {
		String title=stackpage.getStackpagetitle();
		Assert.assertEquals(title,titles);
	}
}

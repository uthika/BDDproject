package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.ArrayPage;
import com.pages.LinkedListPage;
import com.pages.LinkedListPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListSteps {
	
	private LinkedListPage linkedlistpage=new LinkedListPage(DriverFactory.getDriver());

	
	@Given("User is on ninja home page after logging in")
	public void user_is_on_ninja_home_page_after_logging_in() {
//		DriverFactory.getDriver().navigate().back();
//		DriverFactory.getDriver().navigate().back();
//		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@When("User clicks on getstarted button of Linked List")
	public void user_clicks_on_getstarted_button_of_linked_list() {
		linkedlistpage.clickLinkedListGetStarted();
	}

	@Then("User navigates to linked list page")
	public void user_navigates_to_linked_list_page() {
	   String value =linkedlistpage.verifyPageTitle();
	   Assert.assertEquals("Linked List", value);
	   
	}

	@Given("User is in the Linked List page after logged in to test introduction link")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_introduction_link() {
	    String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test introduction link");
	}

	@When("The user clicks Introduction {string} link")
	public void the_user_clicks_introduction_link(String string) {
		linkedlistpage.clickIntroductionLink();
	}

	@Then("The user should be directed to Introduction of Linked List Page")
	public void the_user_should_be_directed_to_introduction_of_linked_list_page() {
		linkedlistpage.verifyIntroductionPage();
	}

	@When("User clicks {string} button on Introduction page")
	public void user_clicks_button_on_introduction_page(String string) {
	   linkedlistpage.clickIntroductionTryHere();
	}

	@Then("User navigates to try editor page with a run button to test introduction link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_introduction_link() {
		boolean var=linkedlistpage.verifyIntroductionTryEditor();
		Assert.assertEquals(var, true);
		
	}

	@Given("The user is in a page having an tryEditor with a Run button to test introduction link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_introduction_link() {
		linkedlistpage.verifyIntroductionTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test introduction link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_introduction_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test introduction link")
	public void the_user_clicks_on_run_button_to_test_introduction_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for introduction link")
	public void the_user_should_be_presented_with_run_result_for_introduction_link() {
		linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for introduction page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_introduction_page() {
	    DriverFactory.getDriver().navigate().back();
	    linkedlistpage.clickIntroductionTryHere();
	    linkedlistpage.verifyIntroductionTryEditor();
	    
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario for introduction page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_introduction_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for introduction page")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_introduction_page() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for introduction page")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_introduction_page() {
		linkedlistpage.alert();
	}

	@Given("User is in the Linked List page after logged in to test creating linked list")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_creating_linked_list() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.seleclLLfromDropdown();
		String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test creating linked list link");
		
	}

	@When("The user clicks Creating Linked List {string} link")
	public void the_user_clicks_creating_linked_list_link(String string) {
	    linkedlistpage.clickCreatingLinkedList();
	}

	@Then("The user should be directed to Creating Linked List of Linked List Page")
	public void the_user_should_be_directed_to_creating_linked_list_of_linked_list_page() {
	     String value3=linkedlistpage.verifyCreatingLinkedListPage();
	     Assert.assertEquals("Creating Linked LIst", value3);
	}

	@When("User clicks {string} button on Creating Linked List page")
	public void user_clicks_button_on_creating_linked_list_page(String string) {
	     linkedlistpage.clickCreatingLinkedListTryHere();
	}

	@Then("User navigates to try editor page with a run button to test Creating Linked List link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_creating_linked_list_link() {
	    boolean val2=linkedlistpage.verifyCreatingLinkedListTryEditor();
	    Assert.assertEquals(val2, true);
	}

	@Given("The user is in a page having an tryEditor with a Run button to test Creating Linked List link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_creating_linked_list_link() {
		linkedlistpage.verifyCreatingLinkedListTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test Creating Linked List link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_creating_linked_list_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test Creating Linked List link")
	public void the_user_clicks_on_run_button_to_test_creating_linked_list_link() {
	    linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for Creating Linked List link")
	public void the_user_should_be_presented_with_run_result_for_creating_linked_list_link() {
	    linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for Creating Linked List page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_creating_linked_list_page() {
	    DriverFactory.getDriver().navigate().back();
	    linkedlistpage.clickCreatingLinkedListTryHere();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario for Creating Linked List page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_creating_linked_list_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for Creating Linked List page")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_creating_linked_list_page() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for Creating Linked List page")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_creating_linked_list_page() {
	    linkedlistpage.alert();
	}

	@Given("User is in the Linked List page after logged in to test types of linked list")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_types_of_linked_list() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.seleclLLfromDropdown();
		String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test types of linked list");
	}

	@When("The user clicks Types of Linked List {string} link")
	public void the_user_clicks_types_of_linked_list_link(String string) {
	    linkedlistpage.clickTypesofLinkedList();
	}

	@Then("The user should be directed to Types of Linked List of Linked List Page")
	public void the_user_should_be_directed_to_types_of_linked_list_of_linked_list_page() {
	    linkedlistpage.verifyTypesofLinkedListPage();
	}

	@When("User clicks {string} button on Types of Linked List page")
	public void user_clicks_button_on_types_of_linked_list_page(String string) {
	    linkedlistpage.clickTypesofLinkedListTryHere();
	}

	@Then("User navigates to try editor page with a run button to test Types of Linked List link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_types_of_linked_list_link() {
	    boolean val3= linkedlistpage.verifyTypesofLinkedListTryEditor();
	    Assert.assertEquals(val3, true);
	   
	}

	@Given("The user is in a page having an tryEditor with a Run button to test Types of Linked List link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_types_of_linked_list_link() {
		linkedlistpage.verifyTypesofLinkedListTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test Types of Linked List link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_types_of_linked_list_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test Types of Linked List link")
	public void the_user_clicks_on_run_button_to_test_types_of_linked_list_link() {
	    linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for Types of Linked List link")
	public void the_user_should_be_presented_with_run_result_for_types_of_linked_list_link() {
	   linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for Types of Linked List page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_types_of_linked_list_page() {
	    DriverFactory.getDriver().navigate().back();
	    linkedlistpage.clickTypesofLinkedListTryHere();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario for Types of Linked List page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_types_of_linked_list_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for Types of Linked List page")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_types_of_linked_list_page() {
	   linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for Types of Linked List page")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_types_of_linked_list_page() {
	   linkedlistpage.alert();
	}

	@Given("User is in the Linked List page after logged in to test implement linked list in python")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_implement_linked_list_in_python() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.seleclLLfromDropdown();
		String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test implement linked list in python");
	}

	@When("The user clicks Implement Linked List in Python {string} link")
	public void the_user_clicks_implement_linked_list_in_python_link(String string) {
	   linkedlistpage.clickImplementLinkedListinPython();
	}

	@Then("The user should be directed to Implement Linked List in Python of Linked List Page")
	public void the_user_should_be_directed_to_implement_linked_list_in_python_of_linked_list_page() {
		linkedlistpage.verifyImplementLinkedListinPythonPage();
	}

	@When("User clicks {string} button on Implement Linked List in Pythont page")
	public void user_clicks_button_on_implement_linked_list_in_pythont_page(String string) {
		linkedlistpage.clickImplementLinkedListinPythonTryHere();
	}

	@Then("User navigates to try editor page with a run button to test Implement Linked List in Python link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_implement_linked_list_in_python_link() {
		boolean val4=linkedlistpage.verifyImplementLinkedListinPythonTryEditor();
	    Assert.assertEquals(val4, true);
	}

	@Given("The user is in a page having an tryEditor with a Run button to test Implement Linked List in Python link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_implement_linked_list_in_python_link() {
		linkedlistpage.verifyImplementLinkedListinPythonTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test Implement Linked List in Python link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_implement_linked_list_in_python_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test Implement Linked List in Python link")
	public void the_user_clicks_on_run_button_to_test_implement_linked_list_in_python_link() {
	    linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for Implement Linked List in Python link")
	public void the_user_should_be_presented_with_run_result_for_implement_linked_list_in_python_link() {
		linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for Implement Linked List in Python page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_implement_linked_list_in_python_page() {
	   DriverFactory.getDriver().navigate().back();
	   linkedlistpage.clickImplementLinkedListinPythonTryHere();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario for Implement Linked List in Python page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_implement_linked_list_in_python_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for Implement Linked List in Python")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_implement_linked_list_in_python() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for Implement Linked List in Python")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_implement_linked_list_in_python() {
		linkedlistpage.alert();
	}

	@Given("User is in the Linked List page after logged in to test traversal")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_traversal() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.seleclLLfromDropdown();
		String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test traversal");
	}

	@When("The user clicks traversal {string} link")
	public void the_user_clicks_traversal_link(String string) {
	    linkedlistpage.clickTraversalLink();
	}

	@Then("The user should be directed to traversal of Linked List Page")
	public void the_user_should_be_directed_to_traversal_of_linked_list_page() {
		linkedlistpage.verifyTraversalPage();
	}

	@When("User clicks {string} button on traversal page")
	public void user_clicks_button_on_traversal_page(String string) {
		linkedlistpage.clickTraversalTryHere();
	}

	@Then("User navigates to try editor page with a run button to test traversal link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_traversal_link() {
	    boolean val4=linkedlistpage.verifyTraversalTryEditor();
	    Assert.assertEquals(val4, true);
	}

	@Given("The user is in a page having an tryEditor with a Run button to test traversal link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_traversal_link() {
		linkedlistpage.verifyTraversalTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test traversal link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_traversal_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test traversal link")
	public void the_user_clicks_on_run_button_to_test_traversal_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for traversal link")
	public void the_user_should_be_presented_with_run_result_for_traversal_link() {
		linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for traversal page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_traversal_page() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.clickTraversalTryHere();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario for traversal page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_traversal_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for traversal link")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_traversal_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for traversal link")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_traversal_link() {
		linkedlistpage.alert();
	}

	@Given("User is in the Linked List page after logged in to test insertion")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_insertion() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.seleclLLfromDropdown();
		String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test insertion");
	}

	@When("The user clicks Insertion {string} link")
	public void the_user_clicks_insertion_link(String string) {
		linkedlistpage.clickInsertionLink();
	}

	@Then("The user should be directed to Insertion of Linked List Page")
	public void the_user_should_be_directed_to_insertion_of_linked_list_page() {
	    linkedlistpage.verifyInsertionPage();
	}

	@When("User clicks {string} button on Insertion page")
	public void user_clicks_button_on_insertion_page(String string) {
		linkedlistpage.clickInsertionTryHere();
	}

	@Then("User navigates to try editor page with a run button to test Insertion link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_insertion_link() {
		boolean val5 =linkedlistpage.verifyInsertionTryEditor();
	    Assert.assertEquals(val5, true);
	}

	@Given("The user is in a page having an tryEditor with a Run button to test Insertion link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_insertion_link() {
		linkedlistpage.verifyInsertionTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test Insertion link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_insertion_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test Insertion link")
	public void the_user_clicks_on_run_button_to_test_insertion_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for Insertion link")
	public void the_user_should_be_presented_with_run_result_for_insertion_link() {
		linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for Insertion page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_insertion_page() {
	    DriverFactory.getDriver().navigate().back();
	    linkedlistpage.clickInsertionTryHere();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario forInsertion page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_insertion_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for Insertion link")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_insertion_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for Insertion link")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_insertion_link() {
		linkedlistpage.alert();
	}

	@Given("User is in the Linked List page after logged in to test deletion")
	public void user_is_in_the_linked_list_page_after_logged_in_to_test_deletion() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.seleclLLfromDropdown();
		String value2=linkedlistpage.verifyPageTitle();
	    Assert.assertEquals("Linked List", value2);
	    LoggerLoad.info("User is in linked list module to test deletion link");
	}

	@When("The user clicks Deletion {string} link")
	public void the_user_clicks_deletion_link(String string) {
		linkedlistpage.clickDeletionLink();
	}

	@Then("The user should be directed to Deletion of Linked List Page")
	public void the_user_should_be_directed_to_deletion_of_linked_list_page() {
		linkedlistpage.verifyDeletionPage();
	}

	@When("User clicks {string} button on Deletion page")
	public void user_clicks_button_on_deletion_page(String string) {
		linkedlistpage.clickDeletionTryHere();
	}

	@Then("User navigates to try editor page with a run button to test Deletion link")
	public void user_navigates_to_try_editor_page_with_a_run_button_to_test_deletion_link() {
		boolean val6=linkedlistpage.verifyDeletionTryEditor();
	    Assert.assertEquals(val6, true);
	}

	@Given("The user is in a page having an tryEditor with a Run button to test Deletion link")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_deletion_link() {
		linkedlistpage.verifyDeletionTryEditor();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int} to test Deletion link")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_to_test_deletion_link(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test Deletion link")
	public void the_user_clicks_on_run_button_to_test_deletion_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with Run result for Deletion link")
	public void the_user_should_be_presented_with_run_result_for_deletion_link() {
		linkedlistpage.readOutput();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test invalid scenario for Deletion page")
	public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_deletion_page() {
		DriverFactory.getDriver().navigate().back();
		linkedlistpage.clickDeletionTryHere();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int} to test invalid scenario for Deletion page")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and_to_test_invalid_scenario_for_deletion_page(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		linkedlistpage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button to test invalid scenario for Deletion link")
	public void the_user_clicks_on_run_button_to_test_invalid_scenario_for_deletion_link() {
		linkedlistpage.runPythonLinkedList();
	}

	@Then("The user should be presented with error message for invalid scenario for Deletion link")
	public void the_user_should_be_presented_with_error_message_for_invalid_scenario_for_deletion_link() {
		linkedlistpage.alert();
	}


}

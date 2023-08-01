package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.QueuePage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;
import com.qa.util.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueSteps {
	
	private QueuePage queuepage=new QueuePage(DriverFactory.getDriver());
	
	@Given("User is on dsalgo portal home page after logged in")
	public void user_is_on_dsalgo_portal_home_page_after_logged_in() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@When("User clicks on {string} getstarted button in dsalgo homepage")
	public void user_clicks_on_getstarted_button_in_dsalgo_homepage(String string) {
		queuepage.clickQueueGetStarted();
	}

	@Then("The user is navigated to {string} data structure page to test queue links")
	public void the_user_is_navigated_to_data_structure_page_to_test_queue_links(String string) {
		String value =queuepage.verifyPageTitle();
		Assert.assertEquals("Queue", value);
	}

	@When("User clicks on {string} link from queue page")
	public void user_clicks_on_link_from_queue_page(String string) {
		queuepage.clickImplementationofQueueinPythonLink();
	}

	@Then("User should be redirected to Implementation of queue in Python page")
	public void user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		queuepage.verifyImplementationofQueueinPythonPage();
	}

	@When("The user clicks {string} button in implementation of queue in python page")
	public void the_user_clicks_button_in_implementation_of_queue_in_python_page(String string) {
	    queuepage.clickImplementationofQueueinPythonTryHere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test implementation of queue in python")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    boolean var=queuepage.verifyImplementationofQueueinPythonLinkTryEditor();
		Assert.assertEquals(var, true);
	}

	@Given("The user is in Implementation of queue in python page having an tryEditor with a Run button to test")
	public void the_user_is_in_implementation_of_queue_in_python_page_having_an_try_editor_with_a_run_button_to_test() {
		queuepage.verifyImplementationofQueueinPythonLinkTryEditor();
	}

	@When("The user enters valid python code in Implementation of queue in python tryEditor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_implementation_of_queue_in_python_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for valid code in implementation in python page")
	public void the_user_clicks_on_run_button_for_valid_code_in_implementation_in_python_page() {
	    queuepage.runPythonQueue();
	}

	@Then("The user should be presented with Run result for Implementation of queue in Python")
	public void the_user_should_be_presented_with_run_result_for_implementation_of_queue_in_python() {
	    queuepage.readOutput();
	}

	@Given("The user is in queue module having an tryEditor with a Run button to test invalid scenario for implementation of queue in python page")
	public void the_user_is_in_queue_module_having_an_try_editor_with_a_run_button_to_test_invalid_scenario_for_implementation_of_queue_in_python_page() {
		DriverFactory.getDriver().navigate().back();
	    queuepage.clickImplementationofQueueinPythonTryHere();
	    queuepage.verifyImplementationofQueueinPythonLinkTryEditor();
	}

	@When("The user enter python code with invalid syntax in Implementation of queue in python tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_implementation_of_queue_in_python_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("User clicks on run button for invalid code for implementation of queue in python")
	public void user_clicks_on_run_button_for_invalid_code_for_implementation_of_queue_in_python() {
	   queuepage.runPythonQueue();
	}

	@Then("User The user should be presented with error message for implementation of queue in python")
	public void user_the_user_should_be_presented_with_error_message_for_implementation_of_queue_in_python() {
	   queuepage.alert();
	}

	@Given("The user is on the {string} to test Implementation using collections deque link")
	public void the_user_is_on_the_to_test_implementation_using_collections_deque_link(String string) {
		DriverFactory.getDriver().navigate().back();
		queuepage.selectQueuefromDropdown();
		String value2=queuepage.verifyPageTitle();
	    Assert.assertEquals("Queue", value2);
	    LoggerLoad.info("User is in queue module to test collections dequeue link");
	}

	@When("The user clicks Implementation using collections deque link")
	public void the_user_clicks_implementation_using_collections_deque_link() {
	   queuepage.clickImplementationusingCollectionsDequeueLink();
	}

	@Then("The user should be redirected to {string} page in Implementation using collections deque link")
	public void the_user_should_be_redirected_to_page_in_implementation_using_collections_deque_link(String string) {
	    queuepage.verifyImplementationusingCollectionsDequeuePage();
	}

	@When("The user clicks {string} button on {string} page in Implementation using collections deque link page")
	public void the_user_clicks_button_on_page_in_implementation_using_collections_deque_link_page(String string, String string2) {
	    queuepage.clickImplementationusingCollectionsDequeueLinkTryHere();
	}

	@Then("The user should be redirected to Try Here page in Implementation using collections deque link")
	public void the_user_should_be_redirected_to_try_here_page_in_implementation_using_collections_deque_link() {
	    boolean var1=queuepage.verifyImplementationusingCollectionsDequeueLinkTryEditor();
	    Assert.assertEquals(var1, true);
	}

	@Given("The user is in queue page having an tryEditor with a Run button to test Implementation using collections deque link")
	public void the_user_is_in_queue_page_having_an_try_editor_with_a_run_button_to_test_implementation_using_collections_deque_link() {
		queuepage.verifyImplementationusingCollectionsDequeueLinkTryEditor();
	}

	@When("The user enter valid python code in Implementation using collections deque page tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_implementation_using_collections_deque_page_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for valid code in list to test Implementation using collections deque link")
	public void the_user_clicks_on_run_button_for_valid_code_in_list_to_test_implementation_using_collections_deque_link() {
	    queuepage.runPythonQueue();
	}

	@Then("The user should be presented with Run result for Implementation using collections deque page")
	public void the_user_should_be_presented_with_run_result_for_implementation_using_collections_deque_page() {
	    queuepage.readOutput();
	}

	@Given("The user is in queue page having an tryEditor with a Run button to test for invalid syntax")
	public void the_user_is_in_queue_page_having_an_try_editor_with_a_run_button_to_test_for_invalid_syntax() {
		DriverFactory.getDriver().navigate().back();
	    queuepage.clickImplementationusingCollectionsDequeueLinkTryHere();
	    queuepage.verifyImplementationusingCollectionsDequeueLinkTryEditor();
	}

	@When("The user enter python code with invalid syntax in Implementation using collections deque page tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_implementation_using_collections_deque_page_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for invalid code in list to test Implementation using collections deque link")
	public void the_user_clicks_on_run_button_for_invalid_code_in_list_to_test_implementation_using_collections_deque_link() {
	   queuepage.runPythonQueue();
	}

	@Then("The user should be presented with error message for Implementation using collections deque page")
	public void the_user_should_be_presented_with_error_message_for_implementation_using_collections_deque_page() {
	   queuepage.alert();
	}

	@Given("The user is on the {string} to test Implementation using array")
	public void the_user_is_on_the_to_test_implementation_using_array(String string) {
		DriverFactory.getDriver().navigate().back();
		queuepage.selectQueuefromDropdown();
		String value2=queuepage.verifyPageTitle();
	    Assert.assertEquals("Queue", value2);
	    LoggerLoad.info("User is in queue module to test implementation using array");
	}

	@When("The user clicks Implementation using array link")
	public void the_user_clicks_implementation_using_array_link() {
	    queuepage.clickimplementationusingArrayLink();
	}

	@Then("The user should be redirected to {string} page in Implementation using array")
	public void the_user_should_be_redirected_to_page_in_implementation_using_array(String string) {
	    queuepage.verifyImplementationusingArrayPage();
	}

	@When("The user clicks {string} button on {string} in Implementation using array page")
	public void the_user_clicks_button_on_in_implementation_using_array_page(String string, String string2) {
		queuepage.clickImplementationusingArrayTryHere();
	}

	@Then("The user should be redirected to Try Here page in Implementation using array")
	public void the_user_should_be_redirected_to_try_here_page_in_implementation_using_array() {
		boolean var3=queuepage.verifyImplementationusingArrayLinkTryEditor();
		Assert.assertEquals(var3, true);
	}

	@Given("The user is in array page having an tryEditor with a Run button to test for valid code in Implementation using array")
	public void the_user_is_in_array_page_having_an_try_editor_with_a_run_button_to_test_for_valid_code_in_implementation_using_array() {
		queuepage.verifyImplementationusingArrayLinkTryEditor();
	}

	@When("The user enter valid python code in Implementation using array tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_implementation_using_array_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for valid code in Implementation using array")
	public void the_user_clicks_on_run_button_for_valid_code_in_implementation_using_array() {
	    queuepage.runPythonQueue();
	}

	@Then("The user should be presented with Run result for Implementation using array page")
	public void the_user_should_be_presented_with_run_result_for_implementation_using_array_page() {
	    queuepage.readOutput();
	}

	@Given("The user is in queue page having an tryEditor with a Run button to test for invalid code in Implementation using array")
	public void the_user_is_in_queue_page_having_an_try_editor_with_a_run_button_to_test_for_invalid_code_in_implementation_using_array() {
		DriverFactory.getDriver().navigate().back();
	    queuepage.clickImplementationusingArrayTryHere();
	    queuepage.verifyImplementationusingArrayLinkTryEditor();
	}

	@When("The user enter python code with invalid syntax in Implementation using array page tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_implementation_using_array_page_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for invalid code in Implementation using array")
	public void the_user_clicks_on_run_button_for_invalid_code_in_implementation_using_array() {
	   queuepage.runPythonQueue();
	}

	@Then("The user should be presented with error message for Implementation using array page")
	public void the_user_should_be_presented_with_error_message_for_implementation_using_array_page() {
	    queuepage.alert();
	}

	@Given("The user is on the {string} for testing in Queue Operations page")
	public void the_user_is_on_the_for_testing_in_queue_operations_page(String string) {
		DriverFactory.getDriver().navigate().back();
		queuepage.selectQueuefromDropdown();
		String value2=queuepage.verifyPageTitle();
	    Assert.assertEquals("Queue", value2);
	    LoggerLoad.info("User is in queue module to test Queue Operations");
	}

	@When("The user clicks Queue operations link")
	public void the_user_clicks_queue_operations_link() {
	   queuepage.clickQueueOperationsLink();
	}

	@Then("The user is redirected to {string} page to test Queue operations link")
	public void the_user_is_redirected_to_page_to_test_queue_operations_link(String string) {
	    queuepage.verifyQueueOperationsPage();
	}

	@When("The user clicks on {string} button on {string} page to test Queue operations link")
	public void the_user_clicks_on_button_on_page_to_test_queue_operations_link(String string, String string2) {
	    queuepage.clickQueueOperationsTryHere();
	}

	@Then("The user should be redirected to Try Here page in Queue Operations")
	public void the_user_should_be_redirected_to_try_here_page_in_queue_operations() {
	    boolean var4=queuepage.verifyQueueOperationsTryEditor();
	    Assert.assertEquals(var4, true);
	}

	@Given("The user is in queue page having an tryEditor with a Run button to test for valid code in Queue Operations page")
	public void the_user_is_in_queue_page_having_an_try_editor_with_a_run_button_to_test_for_valid_code_in_queue_operations_page() {
	    queuepage.verifyQueueOperationsTryEditor();
	}

	@When("The user enter valid python code in Queue Operations page tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_queue_operations_page_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for valid code in Queue Operations page")
	public void the_user_clicks_on_run_button_for_valid_code_in_queue_operations_page() {
	    queuepage.runPythonQueue();
	}

	@Then("The user should be presented with Run result for Queue Operations page")
	public void the_user_should_be_presented_with_run_result_for_queue_operations_page() {
	     queuepage.readOutput();
	}

	@Given("The user is in queue page having an tryEditor with a Run button to test invalid code Queue Operations page")
	public void the_user_is_in_queue_page_having_an_try_editor_with_a_run_button_to_test_invalid_code_queue_operations_page() {
		DriverFactory.getDriver().navigate().back();
	    queuepage.clickQueueOperationsTryHere();
	    queuepage.verifyQueueOperationsTryEditor();
	}

	@When("The user enter python code with invalid syntax in Queue Operations page tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_queue_operations_page_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Exception, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		queuepage.getExcelDataLinkedList(code);
	}

	@When("The user clicks on run button for invalid code Queue Operations page")
	public void the_user_clicks_on_run_button_for_invalid_code_queue_operations_page() {
	    queuepage.runPythonQueue();
	}

	@Then("The user should be presented with error message for Queue Operations page")
	public void the_user_should_be_presented_with_error_message_for_queue_operations_page() {
		queuepage.alert();
	}


}

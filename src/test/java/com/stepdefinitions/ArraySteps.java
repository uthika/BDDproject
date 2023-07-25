package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.ArrayPage;
import com.pages.DataStructuresPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArraySteps {
	private ArrayPage arraypage=new ArrayPage(DriverFactory.getDriver());
	@Given("User is on {string}")
	public void user_is_on(String string) {
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		
	    }

	@When("User clicks on {string} getstarted button")
	public void user_clicks_on_getstarted_button(String string) {
		arraypage.clickarraygetstr();
        }

	@Then("The user is navigated to {string} data structure page")
	public void the_user_is_navigated_to_data_structure_page(String string) {
		String title=arraypage.getarrayhomepagetitle();
		Assert.assertEquals(title,"Array");
		}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) {
		arraypage.clickarrayinpython();
	    }

	@Then("User should be redirected to Arrays in Python page")
	public void user_should_be_redirected_to_arrays_in_python_page() {
		String title1=arraypage.getarraypythonpagetitle();
	    Assert.assertEquals(title1,"Arrays in Python");
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		arraypage.clicktryhere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		 Boolean val1= arraypage.verifyText();
		   Boolean val2= arraypage.verifyRun();
		   //Assert.assertEquals(val1, true);
		   Assert.assertEquals(val2, true);
		}

	@Given("The user is in Arrays page having an tryEditor with a Run button to test")
	public void the_user_is_in_arrays_page_having_an_try_editor_with_a_run_button_to_test() {
		arraypage.verifyRun();
	}

	@When("The user enters valid python code in Arrays tryEditor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_arrays_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws Throwable, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		arraypage.getExcelDataArray(code);
	}

	@When("The user clicks on run button for valid code")
	public void the_user_clicks_on_run_button_for_valid_code() {
		arraypage.runPythonArray();
	}

	@Then("The user should be presented with Run result for Arrays in Python")
	public void the_user_should_be_presented_with_run_result_for_arrays_in_python() {
		arraypage.readOutput();
	}

	@Given("The user is in Arrays module having an tryEditor with a Run button to test")
	public void the_user_is_in_arrays_module_having_an_try_editor_with_a_run_button_to_test() {
		arraypage.verifyRun();
		DriverFactory.getDriver().navigate().back();
	    arraypage.clicktryhere();
	    }

	@When("The user enter python code with invalid syntax in Arrays tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_arrays_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		arraypage.getExcelDataArray(code);
       }

	@When("User clicks on run button for invalid code")
	public void user_clicks_on_run_button_for_invalid_code() {
		arraypage.runPythonArray();
       }

	@Then("User The user should be presented with error message")
	public void user_the_user_should_be_presented_with_error_message() {
		 arraypage.alert();

	}

	@Given("The user is on the {string}")
	public void the_user_is_on_the(String string) {
		//DriverFactory.getDriver().navigate().back();
	
		DriverFactory.getDriver().navigate().back();
		 
		
	 }

	@When("The user clicks Arrays Using List link")
	public void the_user_clicks_arrays_using_list_link() {
	    arraypage.clickArrayslist();
	}

	@Then("The user should be redirected to {string} page in Arrays using List page")
	public void the_user_should_be_redirected_to_page_in_arrays_using_list_page(String string) {
		  String title1=arraypage.getarraypythonpagetitle();
	      Assert.assertEquals(title1,"Arrays Using List");
	}

	@When("The user clicks {string} button on {string} page in Arrays using List page")
	public void the_user_clicks_button_on_page_in_arrays_using_list_page(String string, String string2) {
		  arraypage.clicktryhere();
	}

	@Then("The user should be redirected to Try Here page")
	public void the_user_should_be_redirected_to_try_here_page() {
		  arraypage.verifyRun();
		//arraypage.verifyText();
	}

	@Given("The user is in array page having an tryEditor with a Run button to test")
	public void the_user_is_in_array_page_having_an_try_editor_with_a_run_button_to_test() {
		  arraypage.verifyRun();
	}

	@When("The user enter valid python code in Arrays using List page tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_arrays_using_list_page_try_editor_from_sheet_and(String pythonCode, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/PythonCodeInput.xlsx",pythonCode);
		String code = testData.get(RowNumber).get("pythoncode");
		arraypage.getExcelDataArray(code);

	}

	@When("The user clicks on run button for valid code in list")
	public void the_user_clicks_on_run_button_for_valid_code_in_list() {
		arraypage.runPythonArray();
	}

	@Then("The user should be presented with Run result for Arrays using List page")
	public void the_user_should_be_presented_with_run_result_for_arrays_using_list_page() {
		 arraypage.readOutput();
	}

	@When("The user enter python code with invalid syntax in Arrays using list page tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_arrays_using_list_page_try_editor_from_sheet_and(String string, Integer int1) {
	 
	}

	@When("The user clicks on run button for invalid code in list")
	public void the_user_clicks_on_run_button_for_invalid_code_in_list() {
	   
	}

	@Then("The user should be presented with error message for Arrays using List page")
	public void the_user_should_be_presented_with_error_message_for_arrays_using_list_page() {
	   
	}
	@Given("The user is on the {string} to perform basic operations")
	public void the_user_is_on_the_to_perform_basic_operations(String string) {
	    
	}


	@When("The user clicks Basic Operations in Lists link")
	public void the_user_clicks_basic_operations_in_lists_link() {
	 
	}

	@Then("The user should be redirected to {string} page in Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_page_in_basic_operations_in_lists_page(String string) {
	   
	}

	@When("The user clicks {string} button on {string} in Basic Operations in Lists page")
	public void the_user_clicks_button_on_in_basic_operations_in_lists_page(String string, String string2) {
	  
	}
	@Then("The user should be redirected to Try Here page in Basic Opeartions")
	public void the_user_should_be_redirected_to_try_here_page_in_basic_opeartions() {
	   
	}


	@When("The user enter valid python code in Basic Operations in Lists tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_basic_operations_in_lists_try_editor_from_sheet_and(String string, Integer int1) {
	    
	}

	@When("The user clicks on run button for valid code in Basic Operations in Lists")
	public void the_user_clicks_on_run_button_for_valid_code_in_basic_operations_in_lists() {
	    
	}

	@Then("The user should be presented with Run result for Basic Operations in Lists page")
	public void the_user_should_be_presented_with_run_result_for_basic_operations_in_lists_page() {
	  
	}

	@When("The user enter python code with invalid syntax in Basic Operations in Lists page tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_basic_operations_in_lists_page_try_editor_from_sheet_and(String string, Integer int1) {
	 
	}

	@When("The user clicks on run button for invalid code in Basic Operations in Lists")
	public void the_user_clicks_on_run_button_for_invalid_code_in_basic_operations_in_lists() {
	    
	}

	@Then("The user should be presented with error message for Basic Operations in Lists page")
	public void the_user_should_be_presented_with_error_message_for_basic_operations_in_lists_page() {
	 
	}
	@Given("The user is on the {string} for performing in Applications of Array page")
	public void the_user_is_on_the_for_performing_in_applications_of_array_page(String string) {
	    
	}


	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
	
	}
	@Then("The user should be redirected to Try Here page in Applications of Array")
	public void the_user_should_be_redirected_to_try_here_page_in_applications_of_array() {
	 
	}

	@Then("The user is redirected to {string} page")
	public void the_user_is_redirected_to_page(String string) {
	    
	}

	@When("The user clicks on {string} button on {string} page")
	public void the_user_clicks_on_button_on_page(String string, String string2) {
	  
	}

	@When("The user enter valid python code in Applications of Array page tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_applications_of_array_page_try_editor_from_sheet_and(String string, Integer int1) {
	
	}

	@When("The user clicks on run button for valid code in Applications of Array page")
	public void the_user_clicks_on_run_button_for_valid_code_in_applications_of_array_page() {
	 
	}

	@Then("The user should be presented with Run result for Applications of Array page")
	public void the_user_should_be_presented_with_run_result_for_applications_of_array_page() {
	  
	}

	@When("The user enter python code with invalid syntax in Applications of Array page tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_applications_of_array_page_try_editor_from_sheet_and(String string, Integer int1) {
	   
	}

	@When("The user clicks on run button for invalid code Applications of Array page")
	public void the_user_clicks_on_run_button_for_invalid_code_applications_of_array_page() {
	    
	}

	@Then("The user should be presented with error message for Applications of Array page")
	public void the_user_should_be_presented_with_error_message_for_applications_of_array_page() {
	    
	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	    
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
	    
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
	    
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	    
	}

	@Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
	    
	}

	@Given("The user is on {string} page of {string}")
	public void the_user_is_on_page_of(String string, String string2) {
	   
	}

	@When("The user enter valid python code in tryEditor in Search the array link from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_in_search_the_array_link_from_sheet_and_for_the_question(String string, Integer int1) {
	    
	}

	@When("The user clicks on run button for valid code in {string} page")
	public void the_user_clicks_on_run_button_for_valid_code_in_page(String string) {
	    
	}

	@Then("The user should be presented with Run result for Search the array link")
	public void the_user_should_be_presented_with_run_result_for_search_the_array_link() {

	}

	@When("The user clicks on Submit button")
	public void the_user_clicks_on_submit_button() {
	   
	}

	@Then("The user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
	
	}

	@When("The user enter invalid python code in tryEditor in Search the array link from sheet {string} and {int} for the question")
	public void the_user_enter_invalid_python_code_in_try_editor_in_search_the_array_link_from_sheet_and_for_the_question(String string, Integer int1) {
	   
	}

	@Then("The user should be presented with error message for Search the array link")
	public void the_user_should_be_presented_with_error_message_for_search_the_array_link() {
	   
	}
	@Given("The user is on the Practice page")
	public void the_user_is_on_the_practice_page() {
	   
	}
	@Given("The user is on the Practice page to check Even Number of Digits")
	public void the_user_is_on_the_practice_page_to_check_even_number_of_digits() {
	    
	}

	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
	    
	}

	@When("The user enter valid python code in tryEditor in Max Consecutive Ones from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_in_max_consecutive_ones_from_sheet_and_for_the_question(String string, Integer int1) {
	   
	}

	@When("The user clicks on run button for valid code in Max Consecutive Ones")
	public void the_user_clicks_on_run_button_for_valid_code_in_max_consecutive_ones() {
	   
	}

	@Then("The user should be presented with Run result for Max Consecutive Ones")
	public void the_user_should_be_presented_with_run_result_for_max_consecutive_ones() {
	    
	}

	@When("The user enter invalid python code in tryEditor in Max Consecutive Ones from sheet {string} and {int} for the question")
	public void the_user_enter_invalid_python_code_in_try_editor_in_max_consecutive_ones_from_sheet_and_for_the_question(String string, Integer int1) {
	  
	}

	@When("The user clicks on run button for invalid code in Max Consecutive Ones")
	public void the_user_clicks_on_run_button_for_invalid_code_in_max_consecutive_ones() {
	    
	}

	@Then("The user should be presented with error message for Max Consecutives Ones")
	public void the_user_should_be_presented_with_error_message_for_max_consecutives_ones() {
	  
	}

	@Given("The user is on {string} of {string}")
	public void the_user_is_on_of(String string, String string2) {
	   
	}

	@When("The user enter valid python code in tryEditor in Even Number of Digits from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_in_even_number_of_digits_from_sheet_and_for_the_question(String string, Integer int1) {
	    
	}

	@When("The user clicks on run button for valid code in Find Numbers with Even Number of Digits")
	public void the_user_clicks_on_run_button_for_valid_code_in_find_numbers_with_even_number_of_digits() {
	    
	}

	@Then("The user should be presented with Run result for Even Number of Digits")
	public void the_user_should_be_presented_with_run_result_for_even_number_of_digits() {
	    
	}

	@Given("The user is on Question page of Find Numbers with Even Number of Digits after logged in")
	public void the_user_is_on_question_page_of_find_numbers_with_even_number_of_digits_after_logged_in() {
	 
	}

	@When("The user enter invalid python code in tryEditor in  Even Number of Digits from sheet {string} and {int} for the question")
	public void the_user_enter_invalid_python_code_in_try_editor_in_even_number_of_digits_from_sheet_and_for_the_question(String string, Integer int1) {
	    
	}

	@When("The user clicks on run button for invalid code in Find Numbers with Even Number of Digits")
	public void the_user_clicks_on_run_button_for_invalid_code_in_find_numbers_with_even_number_of_digits() {
	
	}

	@Then("The user should be presented with error message for Even Number of Digits")
	public void the_user_should_be_presented_with_error_message_for_even_number_of_digits() {
	   
	}

	@Given("The user is on the Practice page after logged in")
	public void the_user_is_on_the_practice_page_after_logged_in() {
	    
	}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	    
	}

	@Given("The user is on Question page of Squares of a Sorted Array after logged in")
	public void the_user_is_on_question_page_of_squares_of_a_sorted_array_after_logged_in() {
	
	}

	@When("The user enter valid python code in tryEditor in Squares of a Sorted Array from sheet {string} and {int} for the question")
	public void the_user_enter_valid_python_code_in_try_editor_in_squares_of_a_sorted_array_from_sheet_and_for_the_question(String string, Integer int1) {
	 
	}

	@When("The user clicks on run button for valid code in Sorted Array")
	public void the_user_clicks_on_run_button_for_valid_code_in_sorted_array() {
	    
	}

	@Then("The user should be presented with Run result for Squares of Sorted Array")
	public void the_user_should_be_presented_with_run_result_for_squares_of_sorted_array() {
	   
	}

	@When("The user enter invalid python code in tryEditor in Squares of a Sorted Array from sheet {string} and {int} for the question")
	public void the_user_enter_invalid_python_code_in_try_editor_in_squares_of_a_sorted_array_from_sheet_and_for_the_question(String string, Integer int1) {
	
	}

	@When("The user clicks on run button for invalid code in Sorted Array")
	public void the_user_clicks_on_run_button_for_invalid_code_in_sorted_array() {
	
	}

	@Then("The user should be presented with error message for Squares of Sorted Array")
	public void the_user_should_be_presented_with_error_message_for_squares_of_sorted_array() {
	    
	}


	
	}


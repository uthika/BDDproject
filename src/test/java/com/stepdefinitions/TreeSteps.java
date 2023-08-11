package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.GraphPage;
import com.pages.TreePage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeSteps {
	private TreePage treepage=new TreePage(DriverFactory.getDriver());
	
	@Given("The user is navigated to the Home Page")
	public void the_user_is_navigated_to_the_home_page() {
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		}

	@When("The user clicks the Tree item from the drop down menu")
	public void the_user_clicks_the_tree_item_from_the_drop_down_menu() {
		treepage.clickDatadrpdwn();
		treepage.clickTree();
	}

	@Then("The user should be presented with Tree Page")
	public void the_user_should_be_presented_with_tree_page() {
		String title=treepage.getTreepagetitle();
		Assert.assertEquals(title,"Tree");
		}

	@Given("The user is on the Tree Page")
	public void the_user_is_on_the_tree_page() {
		String title=treepage.getTreepagetitle();
		//Assert.assertEquals(title,"Tree");
		}

	@When("The user clicks the Overview of Trees in Tree")
	public void the_user_clicks_the_overview_of_trees_link() {
		treepage.clickOvrTree();
	}

	@Then("The user should be navigated to Overview of Trees Page")
	public void the_user_should_be_navigated_to_overview_of_trees_page() {
		String title=treepage.getTreepagetitle();
		Assert.assertEquals(title,"Overview of Trees");
		
	}

	@Given("The user is on the Overview of Trees Page with Tryhere link")
	public void the_user_is_on_the_overview_of_trees_page_with_tryhere_link() {
           treepage.verifyTryhere();
	}

	@When("The user clicks the Tryhere link in Overview of Trees Page")
	public void the_user_clicks_the_tryhere_link_in_overview_of_trees_page() {
	        treepage.clickTryhere();
	}

	@Then("The user should be navigated to editor Page with Run button in Overview of Trees Page")
	public void the_user_should_be_navigated_to_editor_page_with_run_button_in_overview_of_trees_page() {
	         treepage.verifyRun();
	}

	@Given("The user is on the Overview of Trees Editor Page with Run button")
	public void the_user_is_on_the_overview_of_trees_editor_page_with_run_button() {
		  treepage.verifyRun();
	}

	@When("The user enters valid code for Overview of Trees from the sheet {string} and {int}")
	public void the_user_enters_valid_code_for_overview_of_trees_from_the_sheet_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		treepage.getExcelDataArray(code1);
	
	}

	@When("The user clicks {string} button for Overview of Trees for valid code")
	public void the_user_clicks_button_for_overview_of_trees_for_valid_code(String string) {
	     treepage.clickRunTree();
	}

	@Then("The user should be able to view the output")
	public void the_user_should_be_able_to_view_the_output() {
	     treepage.readOutput();
	}
	
	@Given("The user is on the Overview of Trees Editor Page with Run button to test invalid code")
	public void the_user_is_on_the_overview_of_trees_editor_page_with_run_button_to_test_invalid_code() {
		treepage.verifyRun();
		DriverFactory.getDriver().navigate().back();
		treepage.clickTryhere();
	
	}

	@When("The user enters invalid code for Overview of Trees from the sheet {string} and {int}")
	public void the_user_enters_invalid_code_for_overview_of_trees_from_the_sheet_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		treepage.getExcelDataArray(code1);
	
	}

	@When("The user clicks {string} button for Overview of Trees for invalid code")
	public void the_user_clicks_button_for_overview_of_trees_for_invalid_code(String string) {
		treepage.clickRunTree();
	}
	@Then("The user should be alerted with Error Message for Overview of Trees")
	public void the_user_should_be_alerted_with_error_message_for_overview_of_trees() {
	    treepage.alert();
	}
	
	@Given("The user is on the Overview of Trees Page from the Editor Page")
	public void the_user_is_on_the_overview_of_trees_page_from_the_editor_page() {
		DriverFactory.getDriver().navigate().back();
	}
	@When("The user clicks the {string}")
	public void the_user_clicks_the(String string) {
	   treepage.clicklinks(string);
	}


	@When("The user click Try here link and enters the valid code from {string} and {int}")
	public void the_user_click_try_here_link_and_enters_the_valid_code_from_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		treepage.clickTryhere();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		treepage.getExcelDataArray(code1);
		treepage.clickRunTree();
	
		
	}
	@When("The user clicks the {string} in Tree")
	public void the_user_clicks_the_link(String links) {
		treepage.clicklinks(links);
	   
	}

	
	@When("The user click Try here link and enters the invalid code from {string} and {int}")
	public void the_user_click_try_here_link_and_enters_the_invalid_code_from_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		treepage.clickTryhere();
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		treepage.getExcelDataArray(code1);
		treepage.clickRunTree();
	
		
	
	}

	@Then("The user should be able to get the Error Message")
	public void the_user_should_be_able_to_get_the_error_message() {
		treepage.alert();
	}
	
	@Given("The user is on the Tree Page to check all titles")
	public void the_user_is_on_the_tree_page_to_check_all_titles() {
		DriverFactory.getDriver().navigate().back();
	}

	@When("The user clicks the {string} in all Tree Page")
	public void the_user_clicks_the_in_all_tree_page(String links) {
	    treepage.clickAlllinks(links);
	}

	@Then("The user should be navigated to {string} Pages")
	public void the_user_should_be_navigated_to_pages(String titles) {
		String title=treepage.getTreepagetitle();
		Assert.assertEquals(title,titles);
		
	}

}

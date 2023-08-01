package com.stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pages.ArrayPage;
import com.pages.GraphPage;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphSteps {
	private GraphPage graphpage=new GraphPage(DriverFactory.getDriver());
	@Given("The user is on the Home Page")
	public void the_user_is_on_the_home_page() {
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
		DriverFactory.getDriver().navigate().back();
	}

	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
	   graphpage.clickGraphdrpdwn();
	   graphpage.clickGraph();
	}

	@Then("The user should be presented with Graph Page")
	public void the_user_should_be_presented_with_graph_page() {
	    String title=graphpage.getGraphpagetitle();
		Assert.assertEquals(title,"Graph");
		
	}

	@Given("The user is on the Graph Page")
	public void the_user_is_on_the_graph_page() {
		 String title=graphpage.getGraphpagetitle();
		 Assert.assertEquals(title,"Graph");
		
	}

	@When("The user clicks the Graph link")
	public void the_user_clicks_the_graph_link() {
	     graphpage.clickGraph();
	}

	@Then("The user should be navigated to Graph Page")
	public void the_user_should_be_navigated_to_graph_page() {
		  String title=graphpage.getGraphpagetitle();
		  Assert.assertEquals(title,"Graph");
		
	}

	@Given("The user is on the Graph Page with Tryhere link")
	public void the_user_is_on_the_graph_page_with_tryhere_link() {
	       Boolean val=graphpage.verifyTryhere();
	       Assert.assertEquals(true, val);
	}

	@When("The user clicks the Tryhere link")
	public void the_user_clicks_the_tryhere_link() {
		   graphpage.clickTryhere();
	}

	@Then("The user should be navigated to editor Page with Run button")
	public void the_user_should_be_navigated_to_editor_page_with_run_button() {
	       Boolean val1=graphpage.verifyRun();
	       Assert.assertEquals(true, val1);
	}

	@Given("The user is on the Editor Page with Run button")
	public void the_user_is_on_the_editor_page_with_run_button() {
		   Boolean val1=graphpage.verifyRun();
	       Assert.assertEquals(true, val1);
	}
	

	@When("The user enters valid code from the sheet {string} and {int}")
	public void the_user_enters_valid_code_from_the_sheet_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		graphpage.getExcelDataArray(code1);
	
	}

	@When("The user clicks {string} button for valid code")
	public void the_user_clicks_button_for_valid_code(String string) {
	      graphpage.clickRunGraph();
	}

	@Then("The user should be presented with the output")
	public void the_user_should_be_presented_with_the_output() {
	       graphpage.readOutput();
	}

	@Given("The user is on the Editor Page")
	public void the_user_is_on_the_editor_page() {
		 Boolean val1=graphpage.verifyRun();
		 Assert.assertEquals(true, val1);
	     DriverFactory.getDriver().navigate().back();
		 graphpage.clickTryhere();
	}

	@When("The user enters invalid code from the sheet {string} and {int}")
	public void the_user_enters_invalid_code_from_the_sheet_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		graphpage.getExcelDataArray(code1);
	
	}

	@When("The user clicks {string} button for invalid code")
	public void the_user_clicks_button_for_invalid_code(String string) {
		graphpage.clickRunGraph();
	}

	@Then("The user should be presented with the desired output")
	public void the_user_should_be_presented_with_the_desired_output() {
	    graphpage.alert();
	}

	@Given("The user is on the Graph Page with Graph Representations link")
	public void the_user_is_on_the_graph_page_with_graph_representations_link() {
		DriverFactory.getDriver().navigate().back();
		Boolean link1=graphpage.verifyGraphrep();
		Assert.assertEquals(true, link1);
	}

	@When("The user clicks the Graph Representations link")
	public void the_user_clicks_the_graph_representations_link() {
		graphpage.clickGraphreplink();
	}

	@Then("The user should be navigated to Graph Representations Page")
	public void the_user_should_be_navigated_to_graph_representations_page() {
		String title=graphpage.getGraphpagetitle();
		 Assert.assertEquals(title,"Graph Representations");
	}

	@Given("The user is on the Graph Representations Page")
	public void the_user_is_on_the_graph_representations_page() {
		String title=graphpage.getGraphpagetitle();
	    Assert.assertEquals(title,"Graph Representations");
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		graphpage.clickTryhere();
	   
	}

	@Then("The user should be navigated to Graph Representations Editor Page")
	public void the_user_should_be_navigated_to_graph_representations_editor_page() {
		Boolean val1=graphpage.verifyRun();
	    Assert.assertEquals(true, val1);
	
	}

	@Then("The user should be presented with Edit Textbox and Run button")
	public void the_user_should_be_presented_with_edit_textbox_and_run_button() {
		Boolean val1=graphpage.verifyRun();
		 Assert.assertEquals(true, val1);
	    }

	@Given("The user is on Graph Represenation Editor Page")
	public void the_user_is_on_graph_represenation_editor_page() {
		Boolean val1=graphpage.verifyRun();
		 Assert.assertEquals(true, val1);
	    
	}

	@When("The user enters valid code for Graph Respresentation from sheet {string} and {int}")
	public void the_user_enters_valid_code_for_graph_respresentation_from_sheet_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		graphpage.getExcelDataArray(code1);
	
	}
	@When("The user clicks run button on Graph Representation Editor Page")
	public void the_user_clicks_run_button_on_graph_representation_editor_page() {
		graphpage.clickRunGraph();
	}


	@Then("The user should be able to get the required doutput")
	public void the_user_should_be_able_to_get_the_required_doutput() {
		graphpage.readOutput();
	}

	@Given("The user is on Graph Represenation Editor Page with Run button")
	public void the_user_is_on_graph_represenation_editor_page_with_run_button() {
		Boolean val1=graphpage.verifyRun();
		Assert.assertEquals(true, val1);
		DriverFactory.getDriver().navigate().back();
		graphpage.clickTryhere();
	
	    
	}

	@When("The user enters invalid code for Graph Respresentation from sheet {string} and {int}")
	public void the_user_enters_invalid_code_for_graph_respresentation_from_sheet_and(String code, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("src/test/resources/exceldata/Graphcode.xlsx",code);
		String code1 = testData.get(RowNumber).get("Examples");
		graphpage.getExcelDataArray(code1);
	
	}

	@Then("The user should be alerted with Error Message")
	public void the_user_should_be_alerted_with_error_message() {
		 graphpage.alert();
	}



}

package testrunners;
import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

;

//@RunWith(Cucumber.class)
@io.cucumber.testng.CucumberOptions(
		features = {"src/test/resources/features"},
		glue = {"com.stepdefinitions","AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/","html:target/cucumber-reports.html"
				
		},
		monochrome=true
		)

public class MyTestRunner extends AbstractTestNGCucumberTests {
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
	

}

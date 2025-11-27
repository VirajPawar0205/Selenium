package mypackage;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/"},glue = "steps", tags="@overall",
plugin = {"pretty","html:target/CucumberReport.html"})
public class Runner extends AbstractTestNGCucumberTests {

	@Override 
	@DataProvider(parallel = true)
	public Object [][] scenarios()
	{
		return super.scenarios();
		
	}
}
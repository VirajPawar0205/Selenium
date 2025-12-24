
package mypackage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/FeatureFiles/BatchFunctionsUses.feature"},glue = "mainpackage",
plugin = {"pretty","html:target/CucumberReport.html"})
public class Runner extends AbstractTestNGCucumberTests {

}

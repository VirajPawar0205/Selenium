package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudentLoginProfile {
WebDriver driver;
@Given("Open st Login url={string}")
public void OpenBrowser(String url)
{
	driver=new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	}
@Given("Enter st Student Email={string}")
public void EnterEmail(String em)
{
	WebElement e=driver.findElement(By.id("email_address"));
	e.sendKeys(em);
	}

@Given("Enter st Student Password={string}")
public void EnterPass(String em)
{
	WebElement e=driver.findElement(By.id("password"));
	e.sendKeys(em);
	}

@When("Click st Login button")
public void clickbtn()
{
	WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
	e.click();
	}
@Then("Check st correct Login is={string}")
public void checkuser(String em)
{
	WebElement e=driver.findElement(By.xpath("//*[@style='font-weight:bold']"));
	String Actual=e.getText();
	String Expected="Yuvraj Gadadare";
	assertEquals(Actual, Expected);
			
	}
@Given("close the driver")
public void closeurl()
{
	
	driver.close();
	}
}

package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.cucumber.java.en.Given;

public class StudentSteps {
	WebDriver driver;

	@Given("Open Student url={string}")
	public void openBrowser(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Given("Student Email={string}")
	public void setEmail(String em)
	{
		WebElement e=driver.findElement(By.id("email_address"));
		e.sendKeys(em);
	}
	@Given("Student Password={string}")
	public void setPass(String em)
	{
		WebElement e=driver.findElement(By.id("password"));
		e.sendKeys(em);
	}
	@Given("Click on Student Login Button")
	public void buttonClick()
	{
		WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
		e.click();
	}
	

}

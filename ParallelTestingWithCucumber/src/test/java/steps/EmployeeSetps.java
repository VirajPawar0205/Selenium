package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class EmployeeSetps {
	WebDriver driver;

	@Given("Open Employee url={string}")
	public void openBrowser(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	@Given("Employee Email={string}")
	public void setEmail(String em)
	{
		WebElement e=driver.findElement(By.id("Email"));
		e.sendKeys(em);
	}
	@Given("Employee Password={string}")
	public void setPass(String em)
	{
		WebElement e=driver.findElement(By.id("Password"));
		e.sendKeys(em);
	}
	@Given("Click on Employee Login Button")
	public void buttonClick()
	{
		WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
		e.click();
	}
	

}

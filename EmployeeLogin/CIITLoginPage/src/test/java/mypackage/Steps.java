package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;

public class Steps {
	WebDriver driver=Hooks.driver;	
	
//	public void OpenBrowser()
//	{
//		driver.manage().window().maximize();
//	}
	@Given ("Open CIIT Student Login Page={string}")
	public void browser(String url)
	{
		driver.get(url);
	}
	@Given ("Enter Student Email Address={string}")
	public void EnterPass(String em)
	{
		WebElement e=driver.findElement(By.id("email_address"));
		e.sendKeys(em);
	}
	@Given ("Enter Student Email Password={string}")
	public void Enter(String em)
	{
		WebElement e=driver.findElement(By.id("password"));
		e.sendKeys(em);
	}
	@Given ("Enter the Login Btn")
	public void Enter()
	{
		WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
		e.click();
	}

}

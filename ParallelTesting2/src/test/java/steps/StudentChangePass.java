package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;

public class StudentChangePass {
	WebDriver driver;
	@Given("Open Login url={string}")
	public void OpenBrowser(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		}
	@Given("Enter Student Email={string}")
	public void setEmail(String em)
	{
		WebElement e=driver.findElement(By.id("email_address"));
		e.sendKeys(em);
		}

	@Given("Enter Student Password={string}")
	public void setPassword(String em)
	{
		WebElement e=driver.findElement(By.id("password"));
		e.sendKeys(em);
		}

	@Given("Click Login button")
	public void Loginbtn()
	{
		WebElement e=driver.findElement(By.xpath("//*[@type='submit']"));
		e.click();
		}
	
	@Given("Click on Change Password")
	public void clickbutton()
	{
		WebElement e=driver.findElement(By.xpath("//*[@onclick='OpenModalToChangePassword()']"));
		e.click();
	}
	@Given("Put Current Password={string}")
	public void clickbutton(String curpass)
	{
		WebElement e=driver.findElement(By.id("txtcurrent_password"));
		e.sendKeys(curpass);
	}
	
	@Given("Create New Password={string}")
	public void curentpass(String curpass)
	{
		WebElement e=driver.findElement(By.id("txtnew_password"));
		e.sendKeys(curpass);
	}
	
	@Given("Confirm New Password={string}")
	public void confirmnew(String curpass)
	{
		WebElement e=driver.findElement(By.id("txtconfirm_new_password"));
		e.sendKeys(curpass);
	}
	
	@Given("Click Confirm button")
	public void confirmbtn()
	{
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnchangepassword")));
		WebElement e=driver.findElement(By.id("btnchangepassword"));
		e.click();
		Wait();
	}
	
	@Given("Close Alert")
	public void alertclose()
	{
		driver.switchTo().alert().accept();
	}
	@Given("close the drivers")
	public void closeurl()
	{
		
		driver.close();
		}
	private void Wait()
	{
		try {
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}

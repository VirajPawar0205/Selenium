package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeLogin {
	@FindBy(xpath=("//*[@href='/Account/Login']"))
	WebElement btn1;
	@FindBy(xpath=("//*[@type='email']"))
	WebElement email;
	@FindBy(id="Password")
	WebElement pass;
	@FindBy(xpath="//*[@type='submit']")
	WebElement btn2;
	@FindBy(xpath="//*[@href='/BatchManagement/Batch/Index']")
	WebElement btn3;
	@FindBy(xpath="//*[@href='/BatchManagement/Batch/ViewBatchSchedule/1']")
	WebElement btn4;
	@FindBy(xpath="//*[@onclick='ViewAttendance(1,329)']")
	WebElement btn5;
	@FindBy(xpath = ("//*[@class='btn btn-secondary']"))
	WebElement btn6;
	
	WebDriver driver;
	public EmployeeLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnEmplogin()
	{
		btn1.click();
	}
	public void setEmail(String em)
	{
		email.sendKeys(em);
	}
	public void setPass(String ps)
	{
		pass.sendKeys(ps);
	}
	public void pressBtn()
	{
		btn2.click();
	}
	public void pressbatch()
	{
		btn3.click();
	}
	public void pressViewSchedule()
	{
		btn4.click();
	}
	public void pressviewattendance()
	{
		btn5.click();
	}
	public void pressclose()
	{
		btn6.click();
	}
	
}

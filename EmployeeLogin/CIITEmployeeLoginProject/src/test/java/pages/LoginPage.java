package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//*[@href='/Account/Login']")
	WebElement btn1;
	
	@FindBy(id = "Email")
	WebElement em;
	
	@FindBy(xpath = "//*[@id='Password']")
	WebElement ps;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement submit;
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickEmployee()
	{
		btn1.click();
	}
	
	public void EnterEmail(String email)
	{
		em.sendKeys(email);
	}
	
	public void EnterPass(String pass)
	{
		ps.sendKeys(pass);
	}
	
	public void LoginEmp()
	{
		submit.click();
	}

}

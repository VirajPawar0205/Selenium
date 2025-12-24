package Functionalities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addstudent {
	@FindBy(xpath = "(//*[@id='tblstudentdata']//*[@type='checkbox'])[1]")
	WebElement clk1;
	
	@FindBy(xpath = "(//*[@id='tblstudentdata']//*[@type='checkbox'])[2]")
	WebElement clk2;
	
	@FindBy(xpath = "(//*[@id='tblstudentdata']//*[@type='checkbox'])[3]")
	WebElement clk3;
	
	@FindBy(xpath = "//*[@onclick='AddBatchStudents()']")
	WebElement submit;
	
	WebDriver driver;
	public Addstudent(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	public void clickstudent1()
	{
		clk1.click();
	}
	public void clickstudent2()
	{
		clk2.click();
	}
	public void clickstudent3()
	{
		clk3.click();
	}
	
	public void submit()
	{
		submit.click();
	}
	
	public void alertaccept()
	{
		driver.switchTo().alert().accept();
	}
}

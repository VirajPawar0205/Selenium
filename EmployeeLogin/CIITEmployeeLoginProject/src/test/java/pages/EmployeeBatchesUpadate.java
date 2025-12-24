package pages;

import static org.assertj.core.api.Assertions.withMarginOf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployeeBatchesUpadate {
	
	
	@FindBy(xpath ="//*[@href='#myBatchModal']")
	WebElement clk2;
	
	@FindBy(id="topic_id")
	WebElement clk3;
	
	@FindBy(xpath = "//*[@value='4']")
	WebElement clk4;
	
	@FindBy(id="employee_id")
	WebElement clk5;
	
	@FindBy(xpath="//*[@id='employee_id']/option[2]")
	WebElement clk6;
	
	@FindBy(id="start_date")
	WebElement EnterStDate;
	
	@FindBy(id="end_date")
	WebElement EnterEdDate;
	
	@FindBy(id="batch_time")
	WebElement EnterTime;
	
	@FindBy(xpath = "//*[@value='Submit']")
	WebElement Submitbtn;
	
	WebDriver driver;
	public EmployeeBatchesUpadate(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	public void ClickOnNewBatch()
	{
		clk2.click();
	}
	
	public void ClickOnTopic()
	{
		clk3.click();
	}
	public void SelectTopics()
	{
		clk4.click();
	}
	public void ClickOntrainer()
	{
		clk5.click();
	}
	public void TrainerName()
	{
		clk6.click();
	}
	public void EnterStartDate(String stdate)
	{
		EnterStDate.sendKeys(stdate);
	}
	public void EnterEndDate(String eddate)
	{
		EnterEdDate.sendKeys(eddate);
	}
	public void setTime(String tim)
	{
		EnterTime.sendKeys(tim);
	}
	public void Submit()
	{
		Submitbtn.click();
		
	}
	public void Alert()
	{
		driver.switchTo().alert().accept();
	}


}

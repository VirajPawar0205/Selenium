package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickBatch {
	@FindBy(xpath = "//*[@href='/BatchManagement/Batch/Index']")
	WebElement clk1;
	
	WebDriver driver;
	public ClickBatch(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void clickonbatch()
	{
		clk1.click();
	}

}

package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	WebDriver driver;
	PageObjectManager page;
	
	public WebDriver SelectChromeDriver()
	{
		driver =new ChromeDriver(); 
		return driver;
	} 
	
	public WebDriver SelectEdgeDriver()
	{
		driver= new EdgeDriver();
		return driver;
	}
	
	public WebDriver SelectFireFoxDriver()
	{
		driver= new FirefoxDriver();
		return driver;
	}
	public PageObjectManager PageObjectManagerInstance()
	{
		page=new PageObjectManager(driver);
		return page;
	}
	
}

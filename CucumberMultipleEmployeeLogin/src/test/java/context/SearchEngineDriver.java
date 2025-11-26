package context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchEngineDriver {
	WebDriver driver;
	
	PageObjectManage manager;
	public void setChromeDreiver()
	{
		
		driver=new ChromeDriver();
	}
	public void setEdgeDreiver()
	{
		driver=new EdgeDriver();
	}
	
	public PageObjectManage getPageObjectManageInstance()
	{
		manager=new PageObjectManage(driver);
		return manager;
	}

}

package context;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class PlaceDriver {
	WebDriver driver;
	public PlaceDriver(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void Homedriver(String url)
	{
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	

}

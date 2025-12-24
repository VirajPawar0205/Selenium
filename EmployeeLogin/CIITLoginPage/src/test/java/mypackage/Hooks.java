package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	@Before("@Login")
	public void setup()
	{
		driver=new ChromeDriver();
		
	}

}

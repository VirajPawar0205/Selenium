package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

public class GettingLinks {
  @Test
  public void BreakingLinks() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ciitinstitute.com/");
	  driver.manage().window().maximize();
	  
  }
}

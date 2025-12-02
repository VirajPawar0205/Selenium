package mypackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabSwitching {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ciitinstitute.com/");
	  driver.manage().window().maximize();
	  String mainWindow=driver.getWindowHandle();
	  System.out.println(mainWindow);
	  String key=Keys.chord(Keys.CONTROL, Keys.ENTER);
	  WebElement e=driver.findElement(By.xpath("(//*[@href='/about-ciit'])[1]"));
	  e.sendKeys(key);
	  WebElement e1=driver.findElement(By.xpath("(//*[@href='/ciit-events'])[1]"));
	  e1.sendKeys(key);
	  WebElement e2=driver.findElement(By.xpath("(//*[@href='/out-students-placed-in-top-companies'])[1]"));
	  e2.sendKeys(key);
	  Set<String> s1=driver.getWindowHandles();
	  System.out.println("Total Windows ="+s1.size());
	  driver.switchTo().window(s1.toArray()[2].toString());
	  
  }
}

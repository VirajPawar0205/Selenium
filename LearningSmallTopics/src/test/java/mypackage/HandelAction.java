package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandelAction {
  @Test
  public void f() {
	  WebDriver driver =new ChromeDriver();
	  driver.get("http://127.0.0.1:5500/Idex.html");
	  driver.manage().window().maximize();
	  WebElement e1=driver.findElement(By.id("dv"));
	  String backcolor=e1.getCssValue("background-color");
	  System.out.println(backcolor);
	  Actions as=new Actions(driver);
	  as.click(e1).perform();
	  backcolor=e1.getCssValue("background-color");
	  System.out.println(backcolor);
	  
	  as.moveToElement(e1).perform();
	    backcolor=e1.getCssValue("background-color");
	  System.out.println(backcolor);

	  	  WebElement btn=driver.findElement(By.id("btndisplay"));
	  as.moveToElement(btn).perform();
	    backcolor=e1.getCssValue("background-color");
	  System.out.println(backcolor);
	  driver.close();

//	  as.click(btn).perform();
  }
}

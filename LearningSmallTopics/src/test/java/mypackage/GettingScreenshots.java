
package mypackage;

import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class GettingScreenshots {
	
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ciitstudent.com/");
	  driver.manage().window().maximize();
	  
	  WebElement e=driver.findElement(By.tagName("form"));
	  String Path="D:\\Sreenshots\\abc.jpg";
	 WebElement el=driver.findElement(By.id("email_address"));
	 el.sendKeys("yuvraj.gadadare@gmail.com");
	 WebElement el2=driver.findElement(By.id("password"));
	 el2.sendKeys("p");
	 
	 WebElement el3=driver.findElement(By.xpath("//*[@type='submit']"));	 
	 Wait();
	 el3.click();
	 

	 WebElement el4=driver.findElement(By.xpath("//*[@class='mt-3']/div[1]"));
	 String Actual,exp;
	Actual=el4.getText();
	exp="Yuvraj Gadadare";
	 if(Actual==exp)
	 {
		 System.out.println("Sussfully executed ");
		 
	 }
	 else
	 {
		 Wait();
		  takeshot2(e, Path);
	 }	 
  }
  public void takeshot(WebDriver d , WebElement e , String path)
  {
	  try {
		  Screenshot shot=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(d,e);
		ImageIO.write(shot.getImage(),"jpg", new File(path));
	} catch (Exception e2) {
		System.out.println(e2.getMessage());
		
	}
  }
  public void takeshot2(WebElement e,String Path)
  {
	  try {
		  TakesScreenshot shot1=(TakesScreenshot)e;
		  File f=shot1.getScreenshotAs(OutputType.FILE);
		  File d=new File(Path);
		  FileUtils.copyFile(f, d);
		
	} catch (Exception e2) {
		// TODO: handle exception
	}
  }
  private void Wait()
  {
	  try {
		  Thread.sleep(3000);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
  }
}

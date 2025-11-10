package myPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTestpart1 {
	WebDriver driver;
	String lg="https://ciitstudent.com/";
  @BeforeTest
  public void beforeTest() {
	  driver =new ChromeDriver();
  }
  @Test(priority = 1)
  public void OpenBrowser()
  {
	  driver.get(lg);
	  driver.manage().window().maximize();
  }
  @Test(priority = 2)
  public void LoginTest()
  {
	  WebElement e=driver.findElement(By.id("email_address"));
	  e.sendKeys("yuvraj.gadadare@gmail.com");
	  WebElement p=driver.findElement(By.id("password"));
	  p.sendKeys("11");
	  WebElement bt=driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/form/div[5]/button"));
	  bt.click();
	  Wait();
  }
 // @Test(priority = 3)
  @Test(enabled = false)
  public void Logout()
  {
	  WebElement lo=driver.findElement(By.xpath("//*[@id=\"navbarCollapse2\"]/div/a[2]"));
	  lo.click();
	  Wait();
  }

  @Test(priority = 4)
  public void changePass()
  
  {
	  
	  WebElement cp=driver.findElement(By.xpath("/html/body/main/div/div/div/div/div[1]/div[1]/div/div/div/button[1]"));
	  cp.click();
	  WebElement crp=driver.findElement(By.id("txtcurrent_password"));
	  crp.sendKeys("11");
	  WebElement np=driver.findElement(By.id("txtnew_password"));
	  np.sendKeys("11");
	  WebElement cnp=driver.findElement(By.id("txtconfirm_new_password"));
	  cnp.sendKeys("11");
	  WebElement cpbtn=driver.findElement(By.id("btnchangepassword"));
	  cpbtn.click();
	  Wait();
	  driver.switchTo().alert().accept(); // Handles the Alert tab after changing the Password; 
	  
  }
  @AfterTest
  public void afterTest() {
	 
	  Wait();
		  driver.close();
	 
	  
  }
  private void Wait() {
	  try {
		Thread.sleep(4000);
	} catch (InterruptedException e1) {
		e1.printStackTrace();
	
	}
  }


}

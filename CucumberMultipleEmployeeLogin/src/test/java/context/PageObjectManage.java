package context;

import org.openqa.selenium.WebDriver;

import pages.CheckEmployeeCourse;
import pages.EmployeeLogin;
import pages.HomePage;

public class PageObjectManage {
	WebDriver driver;
	HomePage home;
	EmployeeLogin login;
	SearchEngineDriver context;
	CheckEmployeeCourse coureses;
	public PageObjectManage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public HomePage getHomePageInstance()
	{
		this.home =new HomePage(driver);
		return home;		
	}	
	public EmployeeLogin getLoginPageInstance()
	{
		this.login=new EmployeeLogin(driver);
		return this.login;
	}
	public CheckEmployeeCourse getEmployeeCourseInstance()
	{
		this.coureses=new CheckEmployeeCourse(driver);
		return this.coureses;
	}

	
	

}

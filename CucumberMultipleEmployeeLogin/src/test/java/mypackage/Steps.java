package mypackage;

import context.PageObjectManage;
import context.SearchEngineDriver;
import io.cucumber.java.en.Given;
import pages.CheckEmployeeCourse;
import pages.EmployeeLogin;
import pages.HomePage;

public class Steps {
	EmployeeLogin login;
	SearchEngineDriver context;
	HomePage home;
	PageObjectManage page;
	CheckEmployeeCourse courses;
		
	@Given("Open url={string}")
	public void OpenBrowser(String url)
	{
		context=new SearchEngineDriver();
		context.setChromeDreiver();
		page=context.getPageObjectManageInstance();
		home=page.getHomePageInstance();
		home.OpenBrowser(url);
	}
	@Given("Employee Login click btn")
	public void Clickbtn()
	{
		login=page.getLoginPageInstance();
		login.clickOnEmplogin();
	}
	
	@Given("Employee Email={string}")
	public void Putemail(String em)
	{		
		login.setEmail(em);
	}
	
	@Given("Employee Password={string}")
	public void EmpPass(String ps)
	{
		login.setPass(ps);
	}
	@Given("Click on Login")
	public void clicklogin()
	{
		Wait();
		login.pressBtn();
	}
	@Given("click on batch")
	public void batch()
	{
		login.pressbatch();
	}
	@Given("click on view schedule")
	public void schedule()
	{
		login.pressViewSchedule();
	}
	@Given("click on view attendance")
	public void attendance()
	{
		login.pressviewattendance();
	}
	@Given("Close the Batch")
	public void closebatch()
	{
		Wait();
		Wait();
		login.pressclose();
	}
	@Given("Click on Course")
	public void clickcourse()
	{
		Wait();
		courses=page.getEmployeeCourseInstance();
		courses.ClickCourse();
	}
	@Given("Click on Drop down")
	public void clickdropdown()
	{
		courses.ClickDropDown();
	}
	@Given("Click on View Syllabus")
	public void clicksyllabus()
	{
		courses.ClickSyllabus();
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

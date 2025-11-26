package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckEmployeeCourse {
	@FindBy(xpath = ("//*[@href='/Developer/Course/Index']"))
	WebElement coursebtn;
	@FindBy(xpath = ("//*[@data-bs-target='#collapse_22']"))
	WebElement dropdownbtn;
	@FindBy(xpath = ("//*[@href='/Developer/Course/CourseSyllabus?course_id=22']"))
	WebElement syllabusbtn;
	
	WebDriver driver;
	public CheckEmployeeCourse(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void ClickCourse()
	{
		coursebtn.click();
	}
	public void ClickDropDown()
	{
		dropdownbtn.click();
	}
	public void ClickSyllabus()
	{
		syllabusbtn.click();
	}

}

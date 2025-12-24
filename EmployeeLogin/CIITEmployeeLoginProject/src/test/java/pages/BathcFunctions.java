package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BathcFunctions {
	Functionalities.Addstudent st;
	@FindBy(xpath = "//tr[30]//td[9]//*[1]")
	WebElement clickGenerateSchedule;
	
	@FindBy(xpath = "//tr[30]//td[9]//*[2]")
	WebElement AddStudent;
	
	@FindBy(xpath = "//tr[30]//td[9]//*[3]")
	WebElement GenerateExam;
	
	@FindBy(xpath = "//tr[30]//td[9]//*[4]")
	WebElement Remove;
	
	WebDriver driver;
	

	public BathcFunctions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickgerate()
	{
		clickGenerateSchedule.click();
	}
	public void Addstudent()
	{
		AddStudent.click();
		st=new Functionalities.Addstudent(driver); 
		st.clickstudent1();
		st.clickstudent2();
		st.clickstudent3();
		st.submit();
		st.alertaccept();
	}
	
	public void generatexam()
	{
		GenerateExam.click();
	}
	public void remove()
	{
		Remove.click();
	}

}

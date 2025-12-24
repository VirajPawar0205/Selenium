package mainpackage;

import context.PageObjectManager;
import context.PlaceDriver;
import context.SelectDriver;
import io.cucumber.java.en.Given;
import pages.BathcFunctions;
import pages.ClickBatch;
import pages.EmployeeBatchesUpadate;
import pages.LoginPage;

public class Steps1 {
	LoginPage login;
	PageObjectManager page;
	SelectDriver sd;
	PlaceDriver dr;
	EmployeeBatchesUpadate batch;
	ClickBatch clkbatch;
	BathcFunctions batchfun;

	@Given("Employee Login Url={string}")
	public void OpenBrowser(String url)
	{
		sd=new SelectDriver();
		sd.SelectChromeDriver();
		page=sd.PageObjectManagerInstance();
		dr=page.PlaceDriverPageInstance(); 
		dr.Homedriver(url);
	}
	@Given("Click Emp btn")
	public void empclick()
	{
		login=page.EmployeeLoginPageInstance();
		login.ClickEmployee();
	}
	@Given("Enter Email Address={string}")
	public void EnterEmail(String em)
	{
		login.EnterEmail(em); 
	}
	@Given("Entre Password ={string}")
	public void putpass(String pss)
	{
		
		login.EnterPass(pss);
		
	}
	@Given("Click the Login BUTTON")
	public void submitbtn()
	{
		login.LoginEmp();
	}
	
	@Given ("Click on Batch")
	public void clkbatch()
	{
		clkbatch=page.ClickBatchInstance();
		clkbatch.clickonbatch();
	}

	
	@Given ("Click on the Add Student")
	public void addstud()
	{
		
		batchfun.Addstudent();
	}
	@Given ("click on the Generate Exam")
	public void genexam()
	{
		batchfun=page.BatchfunctionInstance();
		batchfun.generatexam();
	}
	@Given ("Click on the Remove")
	public void remove()
	{
		batchfun.remove();
	}
}

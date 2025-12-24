package mainpackage;

import context.PageObjectManager;
import context.PlaceDriver;
import context.SelectDriver;
import io.cucumber.java.en.Given;
import pages.BathcFunctions;
import pages.ClickBatch;
import pages.EmployeeBatchesUpadate;
import pages.LoginPage;

public class Step2 { 
	LoginPage login;
	PageObjectManager page;
	SelectDriver sd;
	PlaceDriver dr;
	EmployeeBatchesUpadate batch;
	ClickBatch clkbatch;
	BathcFunctions batchfun;
	
	
	@Given ("Click on New Batch")
	public void clknewbatch()
	{
		batch=page.BatchInstance();
		batch.ClickOnNewBatch();
	}
	@Given("Click on Topic Name")
	public void clkontopic()
	{
		batch.ClickOnTopic();
	}
	@Given ("Select Topic Name")
	public void SelcetTopic()
	{
		batch.SelectTopics();
	}
	@Given("Click on Trainer Name")
	public void trainername()
	{
		batch.ClickOntrainer();
	}
	@Given ("Select Trainer Name")
	public void Trainername()
	{
		batch.TrainerName();
	}
	@Given ("Set a Start Date={string}")
	public void stdate(String ed)
	{
		batch.EnterStartDate(ed);
	}
	@Given ("Set a End Date={string}")
	public void eddate(String ed)
	{
		batch.EnterEndDate(ed);
	}
	@Given ("Set Batch Time={string}")
	public void tm(String ed)
	{
		batch.setTime(ed);
	}
	@Given ("Click on Submit Btn")
	public void submit()
	{
		batch.Submit();
	}
	public void alert()
	{
		batch.Alert();
	}
	
	
	@Given ("Click on the Generate schedule")
	public void genschedule()
	{
		
		batchfun.clickgerate();
	}

}

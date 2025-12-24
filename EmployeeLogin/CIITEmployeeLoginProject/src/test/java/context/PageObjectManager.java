package context;

import java.sql.BatchUpdateException;

import org.openqa.selenium.WebDriver;

import pages.BathcFunctions;
import pages.ClickBatch;
import pages.EmployeeBatchesUpadate;
import pages.LoginPage;

public class PageObjectManager {
	LoginPage login;
	WebDriver driver;
	PlaceDriver dr;
	EmployeeBatchesUpadate batch;
	ClickBatch clkbatch;
	BathcFunctions batchfun;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage EmployeeLoginPageInstance()
	{
		return login = new LoginPage(driver);
		
	}
	public PlaceDriver PlaceDriverPageInstance()
	{
		return dr=new PlaceDriver(driver);
	}
	
//	public EmployeeBatchesUpadate BatchInstance()
//	{
//		return batch=new EmployeeBatchesUpadate(driver);
//	}
	
	public ClickBatch ClickBatchInstance()
	{
		return clkbatch=new ClickBatch(driver);
		
	}
	public BathcFunctions BatchfunctionInstance()
	{
		return batchfun=new BathcFunctions(driver);
	}
}

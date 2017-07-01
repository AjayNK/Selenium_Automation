package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven2 {

	public static void main(String[] args) throws Exception 
	{
		
		ExcelRW x = new ExcelRW("D:\\EMICalc.xlsx");
					
		int rc = x.getRowcount("Sheet1");
		
		for(int i=1;i<=rc;i++)
		{
		String strLoanAmt = x.readCellValue("Sheet1", i, 0);
		String strRate = x.readCellValue("Sheet1", i, 1);
		String strMonths = x.readCellValue("Sheet1", i, 2);
		String ExpectedRes = x.readCellValue("Sheet1", i, 3);	
					
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loanamount")).sendKeys(strLoanAmt);	
		driver.findElement(By.id("rate")).sendKeys(strRate);	
		driver.findElement(By.id("pmonths")).sendKeys(strMonths);	
		driver.findElement(By.id("Button1")).click();
	
		Thread.sleep(2000);

		String ActualRes = driver.findElement(By.id("EMI")).getAttribute("value");	
		x.writeCellVCalue("Sheet1", i, 4, ActualRes);

		//Validation
		if(ExpectedRes.equals(ActualRes))
		{
			x.writeCellVCalue("Sheet1", i, 5, "Matched");
		}
		else
		{
			x.writeCellVCalue("Sheet1", i, 5, "Not Matched");
		}
		driver.close();
		}//end of for loop
		
		x.Saveandclose("D:\\EMICalc.xlsx");	
	}
}

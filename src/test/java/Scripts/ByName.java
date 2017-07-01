package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByName {

	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser & enter the url
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Inspect the loan amount text field & enter the value
		driver.findElement(By.name("loanamount")).sendKeys("100000");
		
		//Inspect the Rate text field & enter the value
		driver.findElement(By.name("rate")).sendKeys("13");
		
		//Inspect the Tenure text field & enter the value
		driver.findElement(By.name("pmonths")).sendKeys("60");
		
		//Inspect the Calculate button and perform click
		driver.findElement(By.name("Button1")).click();
		
		Thread.sleep(3000);
		
		//Inspect the EMI text field & get the value
		String ActualRes = driver.findElement(By.name("EMI")).getAttribute("value");
		
		String ExpectedRes = "2224.44";
		
		System.out.println("Expected Results: "+ExpectedRes);
		System.out.println("Actual Results: "+ActualRes);
		
		//Validate the results
		if(ExpectedRes.equals(ActualRes))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		//close the browser
		driver.close();

	}

}

package Scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ById {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loanamount")).sendKeys("100000");
		
		driver.findElement(By.id("rate")).sendKeys("12");
		
		driver.findElement(By.id("pmonths")).sendKeys("60");
			
		driver.findElement(By.id("Button1")).click();
		
		Thread.sleep(2000);

		String ActualRes = driver.findElement(By.id("EMI")).getAttribute("value");
		
		//System.out.println(output);
		
		String ExpectedRes = "2227.44";
		
		//Validation
		if(ExpectedRes.equals(ActualRes))
		{
			System.out.println("Passed.Correct Value displayed - "+ActualRes);
		}
		else
		{
			System.out.println("Failed. Expected: "+ExpectedRes+" Actual Result "+ActualRes);
			//to takescreenshot	
			
			TakesScreenshot screenshot= (TakesScreenshot) driver;
			File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("D:\\emi_Calc.png"));
		}
		
		driver.close();

	}

}

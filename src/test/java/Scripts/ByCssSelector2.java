package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByCssSelector2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		driver.manage().window().maximize();
		//CSS Cascading Style Sheet
		driver.findElement(By.cssSelector("#loanamount")).sendKeys("100000");
		
		driver.findElement(By.cssSelector("#rate")).sendKeys("12");
		
		driver.findElement(By.cssSelector("#pmonths")).sendKeys("60");
			
		driver.findElement(By.cssSelector("#Button1")).click();
		
		Thread.sleep(2000);

		String ActualRes = driver.findElement(By.cssSelector("#EMI")).getAttribute("value");
		
		//System.out.println(output);
		
		String ExpectedRes = "2224.44";
		
		//Validation
		if(ExpectedRes.equals(ActualRes))
		{
			System.out.println("Passed.Correct Value displayed - "+ActualRes);
		}
		else
		{
			System.out.println("Failed. Expected: "+ExpectedRes+" Actual Result "+ActualRes);
		}
		
		driver.close();

	}

}

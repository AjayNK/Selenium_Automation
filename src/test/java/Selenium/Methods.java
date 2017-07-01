package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	WebDriver driver;
	
	public void launchBrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void login(String uName, String Pwd) throws InterruptedException
	{
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("logid")).sendKeys(uName);	
		driver.findElement(By.name("pswd")).sendKeys(Pwd);
		driver.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td.sb2 table tbody tr td.sb1 input")).click();
		Thread.sleep(5000);
	}

	public void verifyWlcMsg(String ExpectedWlcMsg)
	{
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement element:allLinks)
		{
			//System.out.println(element.getText());
			if(element.getText().contains(ExpectedWlcMsg))
			{
				System.out.println("Welcome message displayed");
				break;
			}
		}
	}
	
	public void logOut() throws InterruptedException
	{
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(4000);
	}
	
	public void close()
	{
		driver.close();	
	}
}

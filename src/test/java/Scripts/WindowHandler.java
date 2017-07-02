package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WindowHandler
{
	WebDriver driver;
	
	@Test(priority=1)
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void maximizeApp()
	{
		driver.manage().window().maximize();
	}
	
	
	@Test(priority=3)
	public void validateFooter() throws InterruptedException
	{
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		String ParentWindow = driver.getWindowHandle();
		String ChildWindow = "";
		
		System.out.println("Parent window name is: "+ParentWindow);
		System.out.println("Child window name is: "+ChildWindow);
		System.out.println("--------------------------------------");
		
		Set<String> allWindows = driver.getWindowHandles();
		
		//for(datatype variable_name: collections
		for(String element:allWindows)
		{
			//System.out.println(element);
			if(element.equals(ParentWindow)==false)
			{
				ChildWindow = element;
			}
		}
		
		System.out.println("Parent window name is: "+ParentWindow);
		System.out.println("Child window name is: "+ChildWindow);
		System.out.println("--------------------------------------");
		
		driver.switchTo().window(ChildWindow);
		String strChildWndTitle = driver.getTitle();	
		System.out.println("Child window title is: "+strChildWndTitle);
		
		driver.switchTo().window(ParentWindow);
		String strParentWndTitle = driver.getTitle();
		System.out.println("Parent window title is: "+strParentWndTitle);
	}
	
	@Test(priority=4)
	public void closeBrowser()
	{
		driver.close();
	}

	
}

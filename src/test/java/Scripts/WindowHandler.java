package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandler {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://shop.rediff.com/login#login");
		
		driver.manage().window().maximize();
		
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
		
		driver.quit();
	}

}

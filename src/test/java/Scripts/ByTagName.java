package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByTagName {

	public static void main(String[] args) 
	{
		//open the browser and enter the url
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//get the collection of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//get the count of no of links
		int LinksCount = allLinks.size();
		System.out.println("Total no of links present in google page:"+LinksCount);
		
		int flag = 0;
		//for(datatype variable:collections)
		for(WebElement element:allLinks)	
		{
			//System.out.println(element.getText());
			if(element.getText().contains("Privacy"))
			{
				System.out.println("Required link found");
				flag = 1;
				break;
			}
		} //end loop statement
		
		if(flag==0)
		{
			System.out.println("Required link not found");
		}
				
		//close browser
		driver.close();
	}

}

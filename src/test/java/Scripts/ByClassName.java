package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser & enter the url
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bing.com/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Inspect the search text field and enter the search keyword
		driver.findElement(By.className("b_searchbox")).sendKeys("Selenium");
		
		//inspect search button and perform click
		driver.findElement(By.className("b_searchboxSubmit")).click();
		
		Thread.sleep(3000);
		
		//inspect the results and get the value
		String searchResults = driver.findElement(By.className("sb_count")).getText();
		System.out.println(searchResults);
		
		String[] output = searchResults.split(" ");
		
		System.out.println("Search Results found: "+output[0]);
		
		//close the browser
		driver.close();
		

	}

}

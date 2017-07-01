package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByPartialLinkText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://books.rediff.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Sign")).click();
		
		driver.findElement(By.name("logid")).sendKeys("honeydewz24@rediffmail.com");
		
		driver.findElement(By.name("pswd")).sendKeys("honeydewz123");
		
		driver.findElement(By.cssSelector("html body table tbody tr td table tbody tr td table tbody tr td.sb2 table tbody tr td.sb1 input")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int cnt = allLinks.size();
		
		//for(initialization; condition; increment)
		for(int i=0;i<cnt;i++)
		{
			System.out.println(allLinks.get(i).getText());
			if(allLinks.get(i).getText().contains("honeydewz"))
			{
				System.out.println("Welcome message displayed");
				break;
			}
		}
		
		driver.findElement(By.partialLinkText("Out")).click();
		Thread.sleep(4000);
		
		driver.close();

	}

}

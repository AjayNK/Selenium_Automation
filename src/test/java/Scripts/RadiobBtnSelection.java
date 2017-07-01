package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadiobBtnSelection {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.id("MultiCity")).click();
		
		List<WebElement> AllRadio = driver.findElements(By.tagName("input"));
		for(int i=0;i<AllRadio.size();i++)
		{
			if(AllRadio.get(i).getAttribute("type").equals("radio"))
			{
				AllRadio.get(i).click();
				Thread.sleep(2000);
			}

		}
		

	}

}

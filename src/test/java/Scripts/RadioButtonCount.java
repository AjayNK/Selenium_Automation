package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonCount {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		
		driver.manage().window().maximize();
		//List<WebElement> AllRadio = driver.findElements(By.xpath("//input[@type='radio']"));
		//System.out.println(AllRadio.size());
		
		List<WebElement> AllRadio = driver.findElements(By.tagName("input"));
		int nor = 0;
		for(int i=0;i<AllRadio.size();i++)
		{
			String x = AllRadio.get(i).getAttribute("type");
			if(x.equals("radio"))
			{
				nor = nor+1;
			}
		}
		
		System.out.println(nor);
		 
		driver.close();

	}

}

package Scripts;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtttt {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		driver.manage().window().maximize();
		
		WebElement Btn1 = driver.findElement(By.xpath("//*[@class='button']"));
		String strBtn1 = Btn1.getText();
		System.out.println(strBtn1);
		
		driver.close();

		

	}

}

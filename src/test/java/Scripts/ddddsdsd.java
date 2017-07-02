package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ddddsdsd {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		String strAll = driver.getPageSource();
		int Pos = strAll.indexOf("Answer");
		System.out.println(Pos);
		String RequiredTxt = strAll.substring(Pos);
		System.out.println(RequiredTxt);
		
		driver.close();

	}

}

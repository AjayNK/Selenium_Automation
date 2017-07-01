package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.mongodb.util.JSON;

public class canvas {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		
		driver.manage().window().maximize();
		
		//To read inner html
/*		WebElement element = driver.findElement(By.className("example"));
		 String contents = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML;", element);
		System.out.println(contents);*/
		
		//Creating the JavascriptExecutor interface object by Type casting		
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        //Fetching the Domain Name of the site. Tostring() change object to name.		
        String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);
       
       //Vertical scroll down by 600  pixels		
       js.executeScript("window.scrollBy(0,600)");
       
       Thread.sleep(2000);
       
        List<WebElement> scriptElement = driver.findElements(By.tagName("script"));
        System.out.println(scriptElement.size());
        for(WebElement ele:scriptElement)
        {
        	System.out.println(ele.getText());
        }
 

        System.out.println(js.executeScript("document.getElementsByTagName('script')[6].innerHTML"));


        
/*       String scriptText = (String) ((JavascriptExecutor)driver).executeScript("return arguments[0].innerHTML",scriptElement);
       System.out.println(scriptText);*/
		driver.close();

	}

}

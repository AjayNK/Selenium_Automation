package Scripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException 
	{
		WebDriver browser=new FirefoxDriver();
		browser.get("http://www.flipkart.com/");
		browser.manage().window().maximize();
		
		//to takescreenshot	
		TakesScreenshot screenshot= (TakesScreenshot) browser;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("D:\\FK_Screenshot.png"));

	}

}

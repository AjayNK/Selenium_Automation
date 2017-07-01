package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
			
		String Un_Alert = driver.switchTo().alert().getText();
		System.out.println(Un_Alert);
		
		//click on ok button
		driver.switchTo().alert().accept();
		
		//click on cancel button
		//driver.switchTo().alert().dismiss();
		
		driver.findElement(By.name("login")).sendKeys("ajay");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
		String Pwd_Alert = driver.switchTo().alert().getText();
		System.out.println(Pwd_Alert);
		
		//click on ok button
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}

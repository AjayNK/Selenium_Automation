package ShopKeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Layout_HeaderText {

	public static void main(String[] args) throws InterruptedException 
	{
		String strUserName = "supraja_g@shopkeep.com";
		String strPassWord = "sgpassword123";
		
		//open the browser & enter the url
		WebDriver driver = new FirefoxDriver();
		driver.get("https://test-sug-1.shopkeepapp.com/ipad-layout");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//Inspect Username field and enter the value
		WebElement UserNameTxt = driver.findElement(By.id("login"));
		UserNameTxt.sendKeys(strUserName);
		
		//Inspect Password field and enter the value
		WebElement PasswordTxt = driver.findElement(By.id("password"));
		PasswordTxt.sendKeys(strPassWord);
		
		//Inspect Login button and perform click
		WebElement LoginBtn = driver.findElement(By.id("submit"));
		LoginBtn.click();
		Thread.sleep(2000);
		
		//Inspect the header text and validate
		WebElement HeaderText = driver.findElement(By.xpath("//*[@id='content']/div[1]/h1"));
		String strHeaderTxt = HeaderText.getText();
		
		String ExpectedTxt = "iPad Button Layout";
		if(strHeaderTxt.equals(ExpectedTxt))
		{
			System.out.println("Header Text Found. Displayed - "+strHeaderTxt);
		}
		else
		{
			System.out.println("Header Text NOT Found");
		}
		
		//Perform Logout
		WebElement LogoutLst = driver.findElement(By.xpath("//*[@id='button_pages-index']/div[1]/div[1]/div[2]/div[2]/div/div/div[2]"));
		LogoutLst.click();
		Thread.sleep(1000);
		
		WebElement LogoutBtn = driver.findElement(By.linkText("Logout"));
		LogoutBtn.click();
		Thread.sleep(3000);
		
		//Close Browser
		driver.close();
	}

}

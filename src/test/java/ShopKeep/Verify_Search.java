package ShopKeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_Search {

	public static void main(String[] args) throws InterruptedException 
	{
		String strUserName = "supraja_g@shopkeep.com";
		String strPassWord = "sgpassword123";
		String strSearchKeyword = "Donut";
		
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
		
		WebElement SearchTxt = driver.findElement(By.xpath("//*[@id='item-search-input']"));
		SearchTxt.sendKeys(strSearchKeyword);
		
		WebElement ListItem = driver.findElement(By.xpath("//*[@id='results']/li[4]/span[1]"));
		String strActItem = ListItem.getText();
		
		if(strActItem.equals(strSearchKeyword))
		{
			System.out.println("Search Item found");
		}
		else
		{
			System.out.println("Search Item NOT found");
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

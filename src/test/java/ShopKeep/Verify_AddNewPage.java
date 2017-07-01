package ShopKeep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_AddNewPage {

	public static void main(String[] args) throws InterruptedException 
	{
		String strUserName = "supraja_g@shopkeep.com";
		String strPassWord = "sgpassword123";
		String strPageName = "NewlyCreatedPage";
		
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
		
		WebElement PageTitle = driver.findElement(By.xpath("//*[@id='button-page-name']"));
		PageTitle.clear();
		PageTitle.sendKeys(strPageName);	
		
		WebElement AddIcon = driver.findElement(By.xpath("//*[@id='add-button-page']"));
		AddIcon.click();
		Thread.sleep(2000);
		
		//get the collection of links
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
				
		//get the count of no of links
		int PageCount = allLinks.size();
		System.out.println("Total no of Pages present in iPad button layout:"+PageCount);
				
		int flag = 0;
		//for(datatype variable:collections)
		for(WebElement element:allLinks)	
		{
			//System.out.println(element.getText());
			if(element.getText().contains(strPageName))
			{
			    System.out.println("Newly added page is found in the footer");
				flag = 1;
				break;
			}
		} //end loop statement
				
		if(flag==0)
		{
			System.out.println("Newly added page is NOT found in the footer");
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

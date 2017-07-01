package ShopKeep;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Verify_DragDrop_Items {

	public static void main(String[] args) throws InterruptedException 
	{
		String strUserName = "supraja_g@shopkeep.com";
		String strPassWord = "sgpassword123";
		String strDragItem = "Donut";
		
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

		//get the collection of links
		List<WebElement> allListItems = driver.findElements(By.xpath("//*[@id='results']/li"));
				
		//get the count of items
		int itemCount = allListItems.size();
		System.out.println("Total no of Items present in iPad button layout:"+itemCount);
		
		WebElement DropArea = driver.findElement(By.xpath("//*[@id='button-page-630212']/div[4]"));
		
		int flag = 0;
		for(int icnt=1;icnt<=itemCount;icnt++)	
		{
			WebElement DragItem = driver.findElement(By.xpath("//*[@id='results']/li[icnt]/span[1]"));
			String strActItem = DragItem.getText();
			if(strActItem.equals(strDragItem))
			{
				//Perform Drag & Drop
				Actions a = new Actions(driver);
				a.dragAndDrop(DragItem, DropArea).build().perform();
				Thread.sleep(3000);
				flag = 1;
				break;
			}

		} //Loop End

		if(flag==0)
		{
			System.out.println("Drag Item is not found");
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

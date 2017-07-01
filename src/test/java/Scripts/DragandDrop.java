package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) 
	{

			WebDriver driver = new FirefoxDriver();
			driver.get("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
			
			WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
			
			Actions a = new Actions(driver);
			a.dragAndDrop(drag, drop).build().perform();
	}

}

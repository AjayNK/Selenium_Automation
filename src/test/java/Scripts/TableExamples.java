package Scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TableExamples {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/index.php");
		
		//count no of rows in table 1 
/*		List<WebElement> t= driver.findElements(By.tagName("table"));
		List<WebElement> r = t.get(0).findElements(By.tagName("tr"));
		System.out.println(r.size());*/
		
		//count no of columns in table 1 of 3rd row
/*		List<WebElement> t= driver.findElements(By.tagName("table"));
		List<WebElement> r = t.get(0).findElements(By.tagName("tr"));
		List<WebElement> c = r.get(2).findElements(By.tagName("td"));
		System.out.println(c.size());*/
		
		//find no of images in 3rd column of 4th row of 10th table
/*		List<WebElement> t= driver.findElements(By.tagName("table"));
		List<WebElement> r = t.get(9).findElements(By.tagName("tr"));
		List<WebElement> c = r.get(3).findElements(By.tagName("td"));
		List<WebElement> i = c.get(2).findElements(By.tagName("img"));
		System.out.println(i.size());*/
		
		//click on 4th link in 2nd column of 4th row in 1st table
/*		List<WebElement> t= driver.findElements(By.tagName("table"));
		List<WebElement> r = t.get(0).findElements(By.tagName("tr"));
		List<WebElement> c = r.get(3).findElements(By.tagName("td"));
		List<WebElement> l = c.get(1).findElements(By.tagName("a"));
		l.get(3).click();*/
		
		//Select India in 1st dropdown in 4th column in 3rd row in 2nd table
		List<WebElement> t= driver.findElements(By.tagName("table"));
		List<WebElement> r = t.get(1).findElements(By.tagName("tr"));
		List<WebElement> c = r.get(2).findElements(By.tagName("td"));
		List<WebElement> s = c.get(3).findElements(By.tagName("Select"));
		Select x = new Select(s.get(0));
		x.selectByValue("India");
		
		//4th dropdown select america
		//Select x = new Select(s.get(3));
		//x.selectByValue("America");
		
		//xpath method
		//(//table[@cellpadding='2'])[2]/tbody/tr[2]/td[2]
	}

}

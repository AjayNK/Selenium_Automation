package Scripts;

import java.io.IOException;
import java.util.List;













import org.jsoup.Jsoup;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CanV {

	public static void main(String[] args) throws IOException
	{
		 Document doc =Jsoup.connect("https://the-internet.herokuapp.com/challenging_dom").timeout(10000).get();
		 Elements scriptElements = doc.getElementsByTag("script");

		 for (Element element :scriptElements )
		 {                
		        for (DataNode node : element.dataNodes())
		        {		        	
		        	System.out.println(node.outerHtml());
		        }
		 }
	}
}

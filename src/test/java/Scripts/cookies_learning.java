package Scripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookies_learning {
	
	public static void main(String[] args) {
		
		WebDriver browser=new FirefoxDriver();
		browser.get("https://www.gmail.com/");
		browser.manage().window().maximize();
				
		Set<Cookie> cookies = browser.manage().getCookies();
		System.out.println(cookies.size());
		
		for(Cookie element:cookies)
		{
			
			System.out.println("Domain name "+element.getDomain()+"-----"+"Name of the cookie "+element.getName()+"-----" +"Value is "+element.getValue());
			
		}
		
		//Delete cookies
		browser.manage().deleteAllCookies();

		
		//size
		
		Set<Cookie> cookies2 = browser.manage().getCookies();
		System.out.println("Total cookies after delete "+cookies2.size());

	}

}

package Selenium;

import Scripts.driverstatic;

public class TestDriver {

	public static void main(String[] args) 
	{
		Methods y = new Methods();
		y.launchBrowser("http://www.honeydewz.com");
		y.close();
	}

}

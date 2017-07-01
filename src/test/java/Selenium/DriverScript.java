package Selenium;

public class DriverScript {

	public static void main(String[] args) throws InterruptedException
	{
		String strURL = "http://books.rediff.com/";
		String strUserName = "honeydewz24@rediffmail.com";
		String strPwd = "honeydewz123";
		String ExpectedMsg = "honeydewz";
		
		Methods x = new Methods();
		x.launchBrowser(strURL);
		x.login(strUserName, strPwd);
		x.verifyWlcMsg(ExpectedMsg);
		x.logOut();
		x.close();
	}

}

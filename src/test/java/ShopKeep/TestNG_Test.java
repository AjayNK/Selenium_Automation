package ShopKeep;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Test {
	@BeforeClass
	public void PreCondition()
	{
		System.out.println("Launch Browser");
	}
	
	@AfterClass
	public void PostCondition()
	{
		System.out.println("Close Browser");
	}
		
	@Test(priority=1)
	public void Login()
	{
		System.out.println("Login Sucessful");
		String Exp = "ajay nk";
		String Act = "ajay nk";
		Assert.assertEquals(Act, Exp);
	}
	
	@Test(priority=2,dependsOnMethods={"Login"})
	public void RegisterPayee()
	{
		System.out.println("Payee Registered Sucessfully");
	}

	@Test(priority=3,dependsOnMethods={"Login","RegisterPayee"})
	public void TransferFund()
	{
		System.out.println("Funds transferred Sucessfully");
	}
	
	@Test(priority=4)
	public void Logout()
	{
		System.out.println("Logout Sucessful");
	}
}

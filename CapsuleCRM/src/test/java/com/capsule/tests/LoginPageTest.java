package com.capsule.tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.capsule.base.TestBase;
import com.capsule.pages.HomePage;
import com.capsule.pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage loginPage;
	HomePage homePage;
	
	public static Logger log= Logger.getLogger(LoginPageTest.class.getName());

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		initilization();
		loginPage = new LoginPage();
		homePage= new HomePage();
		

	}

	@Test(priority=3)
	public void loginToCapsule() {
		homePage = loginPage.applicationLogin();

	}
	
	@Test(priority=2)
	public void checkLogo()
	{
		boolean flag =  loginPage.verifyLogoDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	@Test(priority=1)
	public void checkURL()
	{
		boolean link = loginPage.verifyURLDisplayed();
		Assert.assertTrue(link);
	}
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

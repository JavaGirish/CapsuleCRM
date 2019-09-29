package com.capsule.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.base.TestBase;
import com.capsule.pages.HomePage;
import com.capsule.pages.LoginPage;
import com.capsule.pages.OrganizationPage;
import com.capsule.util.TestUtil;

public class HomePageTest extends TestBase {
	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	OrganizationPage orgPage;
	

	public HomePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
		homePage= loginPage.applicationLogin();
		testUtil = new TestUtil();
		orgPage= new OrganizationPage();

	}

	@Test
	public void clickOrganizationLink() {
		
		orgPage= homePage.addOrganizationDetails();
		
		
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

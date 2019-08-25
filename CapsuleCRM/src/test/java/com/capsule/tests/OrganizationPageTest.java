package com.capsule.tests;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsule.base.TestBase;
import com.capsule.pages.HomePage;
import com.capsule.pages.LoginPage;
import com.capsule.pages.OrganizationPage;
import com.capsule.util.TestUtil;

public class OrganizationPageTest extends TestBase {

	TestUtil testUtil;
	LoginPage loginPage;
	HomePage homePage;
	OrganizationPage orgPage;
	
	String sheetName = "OR_DT";

	public OrganizationPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initilization();
		loginPage = new LoginPage();
		orgPage= new OrganizationPage();
		homePage= loginPage.applicationLogin();	
		orgPage= homePage.addOrganizationDetails();
		testUtil = new TestUtil();

	}
	
	
	@DataProvider
	public Object[][] getTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider="getTestData")
	public void enterOrgDetails(String organization, String tag,String phone)
	{
		orgPage.getOrganizationData(organization, tag, phone);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}

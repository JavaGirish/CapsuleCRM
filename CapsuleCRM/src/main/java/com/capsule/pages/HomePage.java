package com.capsule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.base.TestBase;
import com.capsule.util.TestUtil;

public class HomePage extends TestBase  {
	
	TestUtil testUtil = new TestUtil();
	
	
	@FindBy(css="div[class*='item-add']")
	WebElement addDetails;
	
	@FindBy(xpath="//a[text()='Organisation']")
	WebElement orgLink;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public OrganizationPage addOrganizationDetails() 	{
		addDetails.click();
		testUtil.waitForElementVisibility(orgLink);
		orgLink.click();
		return new OrganizationPage();
		
		
	}
	

}

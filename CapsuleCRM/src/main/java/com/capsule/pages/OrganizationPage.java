package com.capsule.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.base.TestBase;

public class OrganizationPage extends TestBase{
	
	@FindBy(id="party:orgNameDecorate:org")
	WebElement orgName;
	
	@FindBy(id="party:tagsDecorate:tagComboBox")
	WebElement tagDetails;
	
	@FindBy(id="party:tagsDecorate:j_id135")
	WebElement addTagBtn;
	
	@FindBy(id="party:j_id329:0:phnDecorate:number")
	WebElement phoneDetails;
	
	@FindBy(id="party:save")
	WebElement saveBtn;
	
	
	public OrganizationPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void getOrganizationData(String org, String tag, String phone) {
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		orgName.sendKeys(org);
		tagDetails.sendKeys(tag);
		addTagBtn.click();
		phoneDetails.sendKeys(phone);
		saveBtn.click();
		
		
		
		
	}
	
	

}

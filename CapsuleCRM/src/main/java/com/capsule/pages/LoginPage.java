package com.capsule.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "login:usernameDecorate:username")
	WebElement userNameTextBox;

	@FindBy(id = "login:passwordDecorate:password")
	WebElement passwordTextBox;

	@FindBy(id = "login:login")
	WebElement loginBtn;

	@FindBy(css = "a.logo")
	WebElement capsuleLogo;

	@FindBy(css = "a#cannot-access-account")
	WebElement forgotLink;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage applicationLogin() {
		userNameTextBox.sendKeys(prop.getProperty("username"));
		passwordTextBox.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		return new HomePage();

	}

	public boolean verifyLogoDisplayed() {
		return capsuleLogo.isDisplayed();
	}
	
	
	public boolean verifyURLDisplayed()
	{
		return forgotLink.isDisplayed();
		
	}

}

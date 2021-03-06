package com.capsule.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.capsule.util.BrowserSelection;


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	public static WebDriverEventListener eventListener;
	public static EventFiringWebDriver eventfiringdriver;

	public TestBase() {
		log = Logger.getLogger(this.getClass());
		FileInputStream propfile;
		prop = new Properties();
		try {

			propfile = new FileInputStream(".\\src\\main\\java\\com\\capsule\\config\\config.properties");
			prop.load(propfile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void initilization() {
		driver = BrowserSelection.selectBrowser(prop.getProperty("browser"));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		

		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		
		

	}

}

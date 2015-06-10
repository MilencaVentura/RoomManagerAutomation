package org.roommanager.tests;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.roommanager.appmodules.admin.RegisterEmailServer;
import org.roommanager.appmodules.admin.RemoveEmailServer;
import org.roommanager.appmodules.admin.SignInAdmin;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmailServerTests {
	private StringBuffer verificationErrors = new StringBuffer();
	private static WebDriver driver = null;
	String baseUrl;
	
	@BeforeTest
	public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://172.20.208.174:4044";
	    driver.manage().window().maximize();
	}

	@Test (priority = 0)
	public void registerEmailService() throws Exception {
		String hostname = "env01001.unit.com";
		String username = "Administrator";
		String password = "qadev02**";
		String expectedResult = hostname + "\nMicrosoft Exchange Server 2010 SP2";
		
		driver.get(baseUrl + "/admin/#/login");
		
		SignInAdmin.Execute(driver);
		RegisterEmailServer.Execute(driver,hostname,username,password);
		RegisterEmailServer.Assert(driver,expectedResult);
	}
	
	@Test (priority = 1)
	public void removeEmailService() throws Exception {
		driver.get(baseUrl + "/admin/#/login");
		
		SignInAdmin.Execute(driver);
		RemoveEmailServer.Execute(driver);
		RemoveEmailServer.Assert(driver);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
	   driver.quit();
	   String verificationErrorString = verificationErrors.toString();
	   if (!"".equals(verificationErrorString)) {
		   fail(verificationErrorString);
	   }
	}
}

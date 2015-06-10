package org.roommanager.appmodules.admin;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.roommanager.pageobjects.admin.EmailServerPage;
import org.roommanager.pageobjects.admin.HomePage;
import org.roommanager.pageobjects.admin.LoginPage;

public class RegisterEmailServer {
	
	public static void Execute(WebDriver driver, String hostname, String username, String password){
		HomePage.lnk_EmailServer(driver).click();
		EmailServerPage.btn_Add(driver).click();
		EmailServerPage.txtbx_Hostname(driver).clear();
		EmailServerPage.txtbx_Hostname(driver).sendKeys(hostname);;
		EmailServerPage.txtbx_Username(driver).clear();
		EmailServerPage.txtbx_Username(driver).sendKeys(username);
		EmailServerPage.txtbx_Password(driver).clear();
		EmailServerPage.txtbx_Password(driver).sendKeys(password);
		EmailServerPage.btn_Save(driver).click();
	}
	public static void Assert(WebDriver driver, String expectedResult){
		assertEquals("The email server was not registered",expectedResult, EmailServerPage.btn_Server(driver).getText());
	}
}
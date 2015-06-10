package org.roommanager.appmodules.admin;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.roommanager.pageobjects.admin.EmailServerPage;
import org.roommanager.pageobjects.admin.HomePage;

public class RemoveEmailServer {

	public static void Execute(WebDriver driver){
		HomePage.lnk_EmailServer(driver).click();
		EmailServerPage.btn_Remove(driver).click();
		EmailServerPage.btn_RemoveConfirmation(driver).click();
	}
	
	public static void Assert(WebDriver driver){
        assertEquals("The email server was not removed","Add", EmailServerPage.btn_Add(driver).getText());
	} 
}

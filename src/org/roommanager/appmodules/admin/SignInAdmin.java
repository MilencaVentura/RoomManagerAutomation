package org.roommanager.appmodules.admin;
import org.openqa.selenium.WebDriver;
import org.roommanager.pageobjects.admin.HomePage;
import org.roommanager.pageobjects.admin.LoginPage;

public class SignInAdmin {
	
	public static void Execute(WebDriver driver){
		LoginPage.btn_signIn(driver).click(); 
	}
}
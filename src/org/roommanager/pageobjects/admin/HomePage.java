package org.roommanager.pageobjects.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private static WebElement element = null;
	 
    public static WebElement lnk_EmailServer(WebDriver driver){
	    (new WebDriverWait(driver,20)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Email Servers")));
	    element = driver.findElement(By.linkText("Email Servers"));
	    return element;
    }
}

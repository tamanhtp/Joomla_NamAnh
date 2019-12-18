package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class LoginPage {
	
	public static By txt_username_id = By.id("mod-login-username");
	public static By txt_pasword_id = By.id("mod-login-password");
	public static By btn_buttonLogin= By.xpath("//button");
	
	
	public static void login(String username, String password) 
	{
		BrowserHelper.driver.findElement(txt_username_id).sendKeys(username);
		BrowserHelper.driver.findElement(txt_pasword_id).sendKeys(password);
		BrowserHelper.driver.findElement(btn_buttonLogin).click();
	}
}

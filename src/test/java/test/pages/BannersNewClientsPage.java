package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersNewClientsPage extends GeneralPage {
	private By _txtName = By.id("jform_name");
	private By _txtContact = By.id("jform_contact");
	private By _txtEmail = By.id("jform_email");

	public void fillNewClientForm(String name, String contactName,String contactEmail) {
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
	}
	
	public void updateNewClientForm(String name, String contactName,String contactEmail) {
		BrowserHelper.driver.findElement(_txtName).clear();
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).clear();
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).clear();
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
	}

	
}

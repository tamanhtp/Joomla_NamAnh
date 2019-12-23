package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersNewClientsPage extends GeneralPage {
	private By _txtName = By.id("jform_name");
	private By _txtContact = By.id("jform_contact");
	private By _txtEmail = By.id("jform_email");
	private By _linkStatus =  By.xpath("//label[contains(text(),'Status')]/../..//b");
	String published = "//li[text()='%s']";
	//private By _linkPublished = By.xpath(published);

	public void fillNewClientForm(String name, String contactName,String contactEmail) {
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
	}
	
	public void fillNewClientForm(String name, String contactName,String contactEmail,String Status) {
		
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
		BrowserHelper.driver.findElement(_linkStatus).click();
		BrowserHelper.driver.findElement(By.xpath(String.format(published, Status))).click();
	}

}

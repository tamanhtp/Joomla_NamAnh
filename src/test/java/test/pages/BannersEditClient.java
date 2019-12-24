package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersEditClient extends GeneralPage {
	private By _txtName = By.id("jform_name");
	private By _txtContact = By.id("jform_contact");
	private By _txtEmail = By.id("jform_email");
	private By _divMessage = By
			.xpath("//div[contains(@class,'alert-success')]//div[@class='alert-message']");
	private By _title = By
			.xpath("//h1//span[normalize-space(text()='Banners: Edit Client')]");

	public void updateNewClientForm(String name, String contactName,
			String contactEmail) {
		BrowserHelper.driver.findElement(_txtName).clear();
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).clear();
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).clear();
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
	}

	public String getMessageText() {
		return BrowserHelper.driver.findElement(_divMessage).getText();
	}

	public boolean chekEditPageDisplays() {
		boolean temp = BrowserHelper.driver.findElements(_title).size() == 1;
		return temp;
	}
}

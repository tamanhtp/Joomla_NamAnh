package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersNewClientsPage extends GeneralPage {
	private By _txtName = By.id("jform_name");
	private By _txtContact = By.id("jform_contact");
	private By _txtEmail = By.id("jform_email");
	private By _linkStatus = By
			.xpath("//label[contains(text(),'Status')]/../..//b");
	String published = "//li[text()='%s']";
	private By _btnSave = By.id("toolbar-apply");
	private By _btnSaveAndClose = By.id("toolbar-save");

	public void fillNewClientForm(String name, String contactName,
			String contactEmail) {
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
	}

	public void fillNewClientForm(String name, String contactName,
			String contactEmail, String Status) {
		BrowserHelper.driver.findElement(_txtName).sendKeys(name);
		BrowserHelper.driver.findElement(_txtContact).sendKeys(contactName);
		BrowserHelper.driver.findElement(_txtEmail).sendKeys(contactEmail);
		BrowserHelper.driver.findElement(_linkStatus).click();
		BrowserHelper.driver.findElement(
				By.xpath(String.format(published, Status))).click();
	}

	public void clickBtnSave() {
		BrowserHelper.driver.findElement(_btnSave).click();
	}

	public void clickBtnSaveAndClose() {
		BrowserHelper.driver.findElement(_btnSaveAndClose).click();
	}
}

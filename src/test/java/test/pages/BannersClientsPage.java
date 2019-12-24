package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersClientsPage extends GeneralPage {
	private String _inputCheck = "//td//a[normalize-space(text())='%s']//ancestor::tr//input";
	private String _clientName = "//td//a[normalize-space(text())='%s']";
	private String _boxName = "//td//a[normalize-space(text())='%s']//ancestor::tr//span[@class='icon-%s']";
	private By _divMessage = By
			.xpath("//div[contains(@class,'alert-success')]//div[@class='alert-message']");
	private By _btnSearchTools = By
			.xpath("//button[normalize-space(text())='Search Tools']");
	private By _divStatus = By.xpath("//select[@id='filter_state']/../div");
	private String _liStatus = "//div[contains(@id,'filter_state')]//li[text()='%s']";
	private By _btnClear = By
			.xpath("//button[normalize-space(text())='Clear']");
	private By _btnNew = By.id("toolbar-new");
	private By _btnPublish = By.id("toolbar-publish");

	public void clickBtnNew() {
		BrowserHelper.driver.findElement(_btnNew).click();
	}

	public void clickBtnPublish() {
		BrowserHelper.driver.findElement(_btnPublish).click();
	}

	public void checkClients(String title) {
		BrowserHelper.driver.findElement(
				By.xpath(String.format(_inputCheck, title))).click();
	}

	public void clickBtnSearchTools() throws InterruptedException {
		BrowserHelper.driver.findElement(_btnSearchTools).click();
		Thread.sleep(1000);
	}

	public void clickBtnClear() {
		BrowserHelper.driver.findElement(_btnClear).click();
	}

	public void selectStatus(String status) {
		BrowserHelper.driver.findElement(_divStatus).click();
		BrowserHelper.driver.findElement(
				By.xpath(String.format(_liStatus, status))).click();
	}

	public String getMessageText() {
		return BrowserHelper.driver.findElement(_divMessage).getText();
	}

	public boolean checkElelementExists(String title) {
		boolean temp = BrowserHelper.driver.findElements(
				By.xpath(String.format(_clientName, title))).size() == 1;
		return temp;
	}

	public boolean checkElementStatus(String title, String status) {
		boolean result = BrowserHelper.driver.findElements(
				By.xpath(String.format(_boxName, title, status))).size() == 1;
		return result;
	}
}

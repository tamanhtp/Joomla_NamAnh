package test.pages;

import org.openqa.selenium.By;

import test.utils.Constants;

public class BannersClientsPage extends GeneralPage {
	private String _inputCheck = "//td//a[normalize-space(text())='%s']//ancestor::tr//input";
	private String _inputCheclAll = "//th//a[normalize-space(text())='Status']/ancestor::tr/th/input";
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
	private By _btnTrash = By.id("toolbar-trash");
	private By _btnEmptyTrash = By.id("toolbar-delete");

	public void clickBtnNew() {
		Constants.DRIVER.findElement(_btnNew).click();
	}

	public void clickBtnPublish() {
		Constants.DRIVER.findElement(_btnPublish).click();
	}

	public void cleanData() throws InterruptedException {
		this.clickBtnClear();
		this.clickBtnSearchTools();
		this.selectStatus("All");
		if (Constants.DRIVER.findElements(By.xpath(_inputCheclAll)).size() == 1) {
			Constants.DRIVER.findElement(By.xpath(_inputCheclAll)).click();
			Constants.DRIVER.findElement(_btnTrash).click();
			this.clickBtnClear();
			this.clickBtnSearchTools();
			this.selectStatus("Trashed");
			Constants.DRIVER.findElement(By.xpath(_inputCheclAll)).click();
			Constants.DRIVER.findElement(_btnEmptyTrash).click();
			Constants.DRIVER.switchTo().alert().accept();
		}
	}

	public void selectCheckbox(String title) {
		if (Constants.DRIVER.findElements(
				By.xpath(String.format(_inputCheck, title))).size() == 1) {
			Constants.DRIVER.findElement(
					By.xpath(String.format(_inputCheck, title))).click();
		}
	}

	public void clickBtnSearchTools() throws InterruptedException {
		Constants.DRIVER.findElement(_btnSearchTools).click();
		Thread.sleep(1000);
	}

	public void clickBtnClear() {
		Constants.DRIVER.findElement(_btnClear).click();
	}

	public void selectStatus(String status) {
		Constants.DRIVER.findElement(_divStatus).click();
		Constants.DRIVER
				.findElement(By.xpath(String.format(_liStatus, status)))
				.click();
	}

	public String getMessageText() {
		return Constants.DRIVER.findElement(_divMessage).getText();
	}

	public boolean checkElelementExists(String title) {
		boolean temp = Constants.DRIVER.findElements(
				By.xpath(String.format(_clientName, title))).size() == 1;
		return temp;
	}

	public boolean checkElementStatus(String title, String status) {
		boolean result = Constants.DRIVER.findElements(
				By.xpath(String.format(_boxName, title, status))).size() == 1;
		return result;
	}
}

package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class WebLinksPage extends GeneralPage{

	// leftmenu Weblink
	private static By leftmenu_WebLinks = By.xpath("//ul[@id='submenu']//a[contains(text(),'Web Links')]");
	private static By leftmenu_WebLinks_Categories = By.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By leftmenu_WebLinks_Fields = By.xpath("//ul[@id='submenu']//a[contains(text(),'Fields')]");
	private static By leftmenu_WebLinks_FieldGroup = By.xpath("//ul[@id='submenu']//a[contains(text(),'Field Groups')]");
	private By _divStatus_Weblinks = By.xpath("//select[@id='filter_published']/../div");
	private String _liStatus = "//div[contains(@id,'filter_published')]//li[text()='%s']";
	private By _btnSearchTools = By.xpath("//button[normalize-space(text())='Search Tools']");
	// create new weblinks with title, alias, url, content, status
	

	// left menu of Weblinks
	public static void gotoWeblinks() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks).click();
	}

	public static void gotoWeblinksCategories() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks_Categories).click();
	}

	public static void gotoWeblinksFields() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks_Fields).click();
	}

	public static void gotoWeblinksFieldGroups() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks_FieldGroup).click();
	}
	public void selectStatus(String status){
		BrowserHelper.driver.findElement(_divStatus_Weblinks).click();
		BrowserHelper.driver.findElement(By.xpath(String.format(_liStatus, status))).click();
	}
	public void clickBtnSearchTools() throws InterruptedException{
		BrowserHelper.driver.findElement(_btnSearchTools).click();
		Thread.sleep(1000);
	}
	
	
}

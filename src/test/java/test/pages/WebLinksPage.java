package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;
import test.utils.Utilities;

public class WebLinksPage {

	// leftmenu Weblink
	private static By leftmenu_WebLinks = By.xpath("//ul[@id='submenu']//a[contains(text(),'Web Links')]");
	private static By leftmenu_WebLinks_Categories = By.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By leftmenu_WebLinks_Fields = By.xpath("//ul[@id='submenu']//a[contains(text(),'Fields')]");
	private static By leftmenu_WebLinks_FieldGroup = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Field Groups')]");

	// create new weblinks with title, alias, url, content, status
	public static void createNew(String title, String alias, String url, String content, By status)
			throws InterruptedException {

		Utilities.sendkeys(GeneralPage.txt_title, title);
		Utilities.sendkeys(GeneralPage.txt_alias, alias);
		Utilities.sendkeys(GeneralPage.txt_url, url);
		Utilities.findElementInIframe(GeneralPage.txtarea_iframe, GeneralPage.txtarea_content, content);
		Utilities.click(GeneralPage.dropdownlist_Status);
		Utilities.click(status);
	}

	public static void goto_createNew() {
		GeneralPage.createnew();
	}

	// left menu of Weblinks
	public static void goto_weblinks_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks).click();
	}

	public static void goto_weblinks_categories_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks_Categories).click();
	}

	public static void goto_weblinks_fields_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks_Fields).click();
	}

	public static void goto_weblinks_fieldGroups_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_WebLinks_FieldGroup).click();
	}
}

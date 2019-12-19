package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;
import test.utils.Utilities;

public class BannersPage extends GeneralPage{
	
	private static By leftmenu_Banners = By.xpath("//ul[@id='submenu']//a[contains(text(),'Banners')]");
	private static By leftmenu_Banners_Categories = By.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By leftmenu_Banners_Clients = By.xpath("//ul[@id='submenu']//a[contains(text(),'Clients')]");
	private static By leftmenu_Banners_Tracks = By.xpath("//ul[@id='submenu']//a[contains(text(),'Tracks')]");
	private static By txt_name = By.id("jform_name");
	private static By txt_contact = By.id("jform_contact");
	
	private static By client_saved = By.xpath("//div[@class='alert-message' and contains(text(),'Client saved.')]");
	
	// create new Banners Clients with title, alias, status
		public static void createNew(String name, String contact, By status) {
			Utilities.sendkeys(BannersPage.txt_name, name);
			Utilities.sendkeys(BannersPage.txt_contact, contact);
			Utilities.click(BannersPage.dropdownlist_Status);
			Utilities.click(status);
		}
	
	public static void goto_createNew() {
		BannersPage.createnew();
	}
	
	public static void goto_banners_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_Banners).click();
	}

	public static void goto_banners_Categories_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_Banners_Categories).click();
	}

	public static void goto_banners_Clients_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_Banners_Clients).click();
	}

	public static void goto_banners_Tracks_leftmenu() {
		BrowserHelper.driver.findElement(leftmenu_Banners_Tracks).click();
	}

	public static boolean checkSavedSuccessfully() {
		return BrowserHelper.driver.findElement(client_saved).isDisplayed();
	}
	
	
	
}

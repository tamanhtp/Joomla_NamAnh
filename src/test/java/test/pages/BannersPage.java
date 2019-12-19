package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;
import test.utils.Utilities;

public class BannersPage {
	
	private static By leftmenu_Banners = By.xpath("//ul[@id='submenu']//a[contains(text(),'Banners')]");
	private static By leftmenu_Banners_Categories = By.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By leftmenu_Banners_Clients = By.xpath("//ul[@id='submenu']//a[contains(text(),'Clients')]");
	private static By leftmenu_Banners_Tracks = By.xpath("//ul[@id='submenu']//a[contains(text(),'Tracks')]");
	
	
	// create new Banners Clients with title, alias, url, content, status
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

}

package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersPage extends GeneralPage {

	private static By leftmenu_Banners = By.xpath("//ul[@id='submenu']//a[contains(text(),'Banners')]");
	private static By leftmenu_Banners_Categories = By.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By leftmenu_Banners_Clients = By.xpath("//ul[@id='submenu']//a[contains(text(),'Clients')]");
	private static By leftmenu_Banners_Tracks = By.xpath("//ul[@id='submenu']//a[contains(text(),'Tracks')]");

	private static By client_saved = By.xpath("//div[@class='alert-message' and contains(text(),'Client saved.')]");

	public void goToBanners() {

		BrowserHelper.driver.findElement(leftmenu_Banners).click();
	}

	public static void goToBannersCategories() {
		BrowserHelper.driver.findElement(leftmenu_Banners_Categories).click();
	}

	public void goToBannersClientsPage() {
		BrowserHelper.driver.findElement(leftmenu_Banners_Clients).click();
	}

	public static void goToBannersTracks() {
		BrowserHelper.driver.findElement(leftmenu_Banners_Tracks).click();
	}

	public static boolean checkSavedSuccessfully() {
		return BrowserHelper.driver.findElement(client_saved).isDisplayed();
	}

}

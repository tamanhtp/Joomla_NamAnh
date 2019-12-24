package test.pages;

import org.openqa.selenium.By;

import test.utils.BrowserHelper;

public class BannersPage extends GeneralPage {
	private static By _linkBanners = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Banners')]");
	private static By _linkBannersCategories = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Categories')]");
	private static By _linkBannersClients = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Clients')]");
	private static By _linkBannersTracks = By
			.xpath("//ul[@id='submenu']//a[contains(text(),'Tracks')]");

	public void goToBanners() {
		BrowserHelper.driver.findElement(_linkBanners).click();
	}

	public static void goToBannersCategories() {
		BrowserHelper.driver.findElement(_linkBannersCategories).click();
	}

	public void goToBannersClientsPage() {
		BrowserHelper.driver.findElement(_linkBannersClients).click();
	}

	public static void goToBannersTracks() {
		BrowserHelper.driver.findElement(_linkBannersTracks).click();
	}
}

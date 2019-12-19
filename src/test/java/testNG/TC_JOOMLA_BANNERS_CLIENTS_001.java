package testNG;

import org.testng.annotations.Test;

import test.pages.BannersPage;
import test.pages.GeneralPage;
import test.pages.LoginPage;
import test.pages.WebLinksPage;
import test.utils.Utilities;
import test.utils.Constants;
import test.utils.Log4j;

import static org.testng.Assert.assertEquals;

public class TC_JOOMLA_BANNERS_CLIENTS_001 extends Default_TestNG_method {

	public TC_JOOMLA_BANNERS_CLIENTS_001() {
//		Constants.setFirefoxBrowser();
		Constants.setChromeBrowser();
//		Constants.setIEBrowser();
//		Constants.setEDGEBrowser();
	}
	@Test(description = "TC_JOOMLA_BANNERS_CLIENTS_002 - Verify that user can edit a client")
	public void TC_JOOMLA_BANNERS_CLIENTS_002() throws InterruptedException {

		String title = Utilities.faker_title();
		
		Log4j.info("Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step1: Goto Banners page");
		BannersPage.goto_components();
		BannersPage.goto_submenu_Banner();
		BannersPage.goto_banners_Clients_leftmenu();
		
		Log4j.info("Step2: Goto create new");
		BannersPage.goto_createNew();
		
		Log4j.info("Step3: create new Banner Clients");
		BannersPage.createNew(title,Utilities.faker_title(),GeneralPage.status_Unpublished);
		
		Log4j.info("Step4: save and close");
		BannersPage.saveAndClose();

		///need edit
		
		
		Log4j.info("VP: check creation");
		assertEquals(BannersPage.checkSavedSuccessfully(), true);
		assertEquals(BannersPage.checkCreationByTitle(title), true);

		Log4j.info("Step 5: Logout");
		BannersPage.logout();
	}
	
	public void loop() throws InterruptedException {
				
		Log4j.info("Step2: Goto create new");
		WebLinksPage.goto_createNew();
		
		Log4j.info("Step3: create new weblinks");
		WebLinksPage.createNew(Utilities.faker_title(),Utilities.faker_title(),Utilities.faker_title(),Utilities.faker_content(),GeneralPage.status_Unpublished);
		
		Log4j.info("Step4: save and close");
		GeneralPage.saveAndClose();
	}




}

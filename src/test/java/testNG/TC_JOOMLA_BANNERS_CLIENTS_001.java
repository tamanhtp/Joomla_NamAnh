package testNG;

import org.testng.annotations.Test;

import test.pages.BannersPage;
import test.pages.GeneralPage;
import test.pages.LoginPage;
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
	public void f() throws InterruptedException {

		String title = Utilities.faker_title();
		
		Log4j.info("Step4: Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step2: CreateNew");
		BannersPage.createNew(title,Utilities.faker_title(),GeneralPage.status_Unpublished);
		
		Log4j.info("Step1: Goto BannersClients page");
		GeneralPage.clickComponents();
		GeneralPage.clickBanner();
		
//		Log4j.info("Step2: Select BannersClients to edit");
//		
//		
//		Log4j.info("Step4: save and close");
//		GeneralPage.saveAndClose();

		///need edit
		
		Log4j.info("VP: Values after Edit is right");
		assertEquals(BannersPage.checkSavedSuccessfully(), true);
//		assertEquals(BannersPage.checkCreationByTitle(title), true);

		Log4j.info("Step 5: Logout");
		BannersPage.logout();
	}
	





}

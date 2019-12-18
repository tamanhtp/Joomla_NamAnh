package testNG;

import org.testng.annotations.Test;

import test.pages.GeneralPage;
import test.pages.LoginPage;
import test.pages.WebLinksPage;
import test.utils.Utilities;
import test.utils.Constants;
import test.utils.Log4j;

import static org.testng.Assert.assertEquals;

public class TC02 extends Default_TestNG_method {

	public TC02() {
//		Constants.setFirefoxBrowser();
		Constants.setChromeBrowser();
//		Constants.setIEBrowser();
//		Constants.setEDGEBrowser();
	}
	@Test(description = "TC_JOOMLA_WEBLINKS_001 - Verify user can create new web link with valid information")
	public void TC_JOOMLA_WEBLINKS_001() throws InterruptedException {

		String title = Utilities.faker_title();
		
		Log4j.info("Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step1: Goto weblinks page");
		GeneralPage.goto_components();
		GeneralPage.goto_submenu_weblinks();
		
		Log4j.info("Step2: Goto create new");
		WebLinksPage.goto_createNew();
		
		Log4j.info("Step3: create new weblinks");
		WebLinksPage.createNew(title,Utilities.faker_title(),Utilities.faker_title(),Utilities.faker_content(),GeneralPage.status_Unpublished);
		
		Log4j.info("Step4: save and close");
		GeneralPage.saveAndClose();

		Log4j.info("VP: check creation");
		assertEquals(GeneralPage.checkSavedSuccessfully(), true);
		assertEquals(GeneralPage.checkCreationByTitle(title), true);

		Log4j.info("Step 5: Logout");
		GeneralPage.logout();
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

package testNG;

import org.testng.annotations.Test;

import test.pages.GeneralPage;
import test.pages.LoginPage;
import test.pages.WebLinksPage;
import test.utils.Utilities;
import test.utils.Constants;
import test.utils.Log4j;

import static org.testng.Assert.assertEquals;

public class TC_JOOMLA_WEBLINKS_001 extends Default_TestNG_method {

	String title = "Test Weblink 1";
	String url = "http://www.joomla.org";
	String title_new = "Test Weblink 2";
	String url_new = "http://www.google.com";
	
	public TC_JOOMLA_WEBLINKS_001() {
		Constants.setFirefoxBrowser();
//		Constants.setChromeBrowser();
//		Constants.setIEBrowser();
//		Constants.setEDGEBrowser();

	}
	@Test(description = "TC_JOOMLA_WEBLINKS_001 - Verify user can create new web link with valid information")
	public void f() throws InterruptedException {

		System.out.println(Constants.BROWSER);
//		String title = Utilities.faker_title();
		
		Log4j.info("Step4: Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step5: Select Components > Weblinks");
		GeneralPage.clickComponents();
		GeneralPage.clickWeblinks();
		
		Log4j.info("Step6: Create new");
		WebLinksPage.goto_createNew();
		
		Log4j.info("Step7,8: create new weblinks");
		WebLinksPage.createNew(title,Utilities.faker_title(),url,Utilities.faker_content(),GeneralPage.status_Unpublished);
		
		Log4j.info("Step9: save and close");
		GeneralPage.saveAndClose();
				
		Log4j.info("Step10: Verify the web link is saved successfully");
		assertEquals(GeneralPage.checkSaved(), true);
		assertEquals(GeneralPage.checkCreationByTitle(title), true);

		Log4j.info("Step11: Check on the recently added article's checkbox");
		GeneralPage.selectCheckboxWithTitle(title);
		
		Log4j.info("Step 12: Click on 'Edit' icon of the top right toolbar");
		GeneralPage.click_button(GeneralPage.btn_edit);
		
		Log4j.info("Step 13: Enter a new title on 'Title' field");
		Utilities.clear(GeneralPage.txt_title);
		Utilities.sendkeys(GeneralPage.txt_title, title_new);
		
		Log4j.info("Step 14: Enter new valid URL into 'URL' text field");
		Utilities.clear(GeneralPage.txt_url);
		Utilities.sendkeys(GeneralPage.txt_url, url_new);
		
		Log4j.info("Step 15: Save");
		GeneralPage.click_button(GeneralPage.btn_save);
		
		Log4j.info("Step16: Verify the web link is saved successfully");
		assertEquals(GeneralPage.checkSaved(), true);
		assertEquals(GeneralPage.checkCreationByTitle(title), true);
		
		Log4j.info("Logout");
		GeneralPage.logout();
	}
	




}

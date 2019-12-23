package testNG;

import org.testng.annotations.Test;

import test.pages.GeneralPage;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.pages.WebLinksNewPage;
import test.pages.WebLinksPage;
import test.utils.Utilities;
import test.utils.Constants;
import test.utils.Log4j;
import static org.testng.Assert.assertEquals;

public class TC_JOOMLA_WEBLINKS_002 extends TestHelper {

	HomePage homePage = new HomePage();
	WebLinksPage webLinksPage = new WebLinksPage();
	WebLinksNewPage webLinksNewPage = new WebLinksNewPage();
		
	String title = "Test Weblink 1";
	String url = "http://www.joomla.org";
	String title_new = "Test Weblink 2";
	String url_new = "http://www.google.com";
	
	public TC_JOOMLA_WEBLINKS_002() {
		Constants.setFirefoxBrowser();
//		Constants.setChromeBrowser();
//		Constants.setIEBrowser();
//		Constants.setEDGEBrowser();

	}
	@Test(description = "TC_JOOMLA_WEBLINKS_001 - Verify user can create new web link with valid information")
	public void f() throws InterruptedException {
		System.out.println(Constants.BROWSER);
//		String title = Utilities.faker_title();
		
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step 2. Go to Weblinks page");
		homePage.goToWebLinksPage();
		
		Log4j.info("Step 3. Click button new redirect new WebLinks page");
		webLinksPage.clickBtnNew();
		
		Log4j.info("Step 4. Create new");
		webLinksNewPage.createNew(title,Utilities.faker_title(),url,Utilities.faker_content(),GeneralPage.status_Unpublished);
		
		Log4j.info("Step 5. save and close");
		webLinksNewPage.clickBtnSaveAndClose();
				
		Log4j.info("Step 6. Verify the web link is saved successfully");
		assertEquals(GeneralPage.checkSaved(), true);
		assertEquals(GeneralPage.checkCreationByTitle(title), true);

		Log4j.info("Step 7. Check on the recently added article's checkbox");
		webLinksPage.selectCheckboxWithTitle(title);
		
		Log4j.info("Step 8. Click on 'Edit' icon of the top right toolbar");
		webLinksPage.click_button(GeneralPage._btnEdit);
		
		Log4j.info("Step 9. Enter a new title on 'Title' field");
		Utilities.clear(GeneralPage._txtTitle);
		Utilities.sendkeys(GeneralPage._txtTitle, title_new);
		
		Log4j.info("Step 10. Enter new valid URL into 'URL' text field");
		Utilities.clear(GeneralPage._txtUrl);
		Utilities.sendkeys(GeneralPage._txtUrl, url_new);
		
		Log4j.info("Step 11. Save");
		webLinksNewPage.click_button(GeneralPage._btnSaveAndClose);
		
		Log4j.info("Step 12. Verify the web link is saved successfully");
		assertEquals(GeneralPage.checkSaved(), true);
		assertEquals(GeneralPage.checkCreationByTitle(title), true);
		
		Log4j.info("Logout");
		GeneralPage.logout();
	}
}

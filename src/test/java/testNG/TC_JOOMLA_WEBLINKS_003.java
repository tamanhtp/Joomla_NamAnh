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

public class TC_JOOMLA_WEBLINKS_003 extends TestHelper {

	HomePage homePage = new HomePage();
	WebLinksPage webLinksPage = new WebLinksPage();
	WebLinksNewPage webLinksNewPage = new WebLinksNewPage();
		
	String title = "Test WEBLINKS_003"+Utilities.timer_hhmmss();
	String url = "http://www.joomla.org";
	
	public TC_JOOMLA_WEBLINKS_003() {

	}
	@Test(description = "TC_JOOMLA_WEBLINKS_002 - Verify that user can edit a client")
	public void f() throws InterruptedException {
		
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
				
		Log4j.info("Step 2. Go to Weblinks page");
		homePage.goToWebLinksPage();
		
		Log4j.info("Step 3. Click button new redirect New WebLinks page");
		webLinksPage.clickBtnNew();
		
		Log4j.info("Step 4. Create new");
		webLinksNewPage.createNew(title,Utilities.faker_title(),url,Utilities.getContent(),webLinksNewPage.status_Unpublished);
		
		Log4j.info("Step 5. save and close");
		webLinksNewPage.clickBtnSaveAndClose();
				
		Log4j.info("Step 6. Verify the web link is saved successfully");
		assertEquals(webLinksPage.checkSaved(), true);
		assertEquals(webLinksPage.checkCreationByTitle(title), true);

		Log4j.info("Step 7. Check on the recently added article's checkbox");
		webLinksPage.selectCheckboxWithTitle(title);
		
		Log4j.info("Step 8. Click on 'Publich' icon of the top right toolbar");
		webLinksPage.click_button(webLinksPage._btnPublish);
				
		Log4j.info("Step 9. Verify the web link is published successfully");
		assertEquals(webLinksPage.checkIconPublishDisplayed(title), true);
		assertEquals(webLinksPage.checkPublished(), true);
		
		Log4j.info("Logout");
		GeneralPage.logout();
	}
}
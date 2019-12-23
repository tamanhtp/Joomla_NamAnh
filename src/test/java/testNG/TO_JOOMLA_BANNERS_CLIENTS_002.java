package testNG;

import org.testng.annotations.Test;

import test.pages.BannersClientsPage;
import test.pages.BannersNewClientsPage;
import test.pages.BannersPage;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.utils.Constants;
import test.utils.Log4j;
import test.utils.Utilities;

public class TO_JOOMLA_BANNERS_CLIENTS_002 extends TestHelper {
	HomePage homePage = new HomePage();
	BannersPage bannersPage = new BannersPage();
	BannersClientsPage bannersClientsPage = new BannersClientsPage();
	BannersNewClientsPage bannersNewClientsPage = new BannersNewClientsPage();
	

	@Test
	public void f() {
		Log4j.info("Step 1. Login");
		LoginPage.login(Constants.LOGIN_USERNAME, Constants.LOGIN_PASSWORD);
		
		Log4j.info("Step 2. Go to banner page ");
		homePage.goToBannerPage();
		
		Log4j.info("Step 3. Go to banner client page ");
	    bannersPage.goToBannersClientsPage();
		
		Log4j.info("Step 4. Go to new client page");
		bannersClientsPage.clickBtnNew();
		
		Log4j.info("Step 5. Fill new client form");
		bannersNewClientsPage.fillNewClientForm(Utilities.getName(),
				Utilities.getContactName(), Utilities.getContactEmail());
		
		Log4j.info("Step 6. Click button save");
		bannersNewClientsPage.clickBtnSave();
		
		Log4j.info("Step 7. Update new client form");
		bannersNewClientsPage.updateNewClientForm(Utilities.getName(),
				Utilities.getContactName(), Utilities.getContactEmail());
		
		Log4j.info("Step 8. Click button save and close");
		bannersNewClientsPage.clickBtnSaveAndClose();
	}
}

package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import test.pages.BannersClientsPage;
import test.pages.BannersEditClient;
import test.pages.BannersNewClientsPage;
import test.pages.BannersPage;
import test.pages.HomePage;
import test.pages.LoginPage;
import test.utils.Constants;
import test.utils.Log4j;
import test.utils.Utilities;

public class TC_JOOMLA_BANNERS_CLIENTS_002 extends TestHelper {
	HomePage homePage = new HomePage();
	BannersPage bannersPage = new BannersPage();
	BannersClientsPage bannersClientsPage = new BannersClientsPage();
	BannersNewClientsPage bannersNewClientsPage = new BannersNewClientsPage();
	BannersEditClient bannersEditClient = new BannersEditClient();
	String titleName = Utilities.getName();
	String titleName1 = Utilities.getName();

	@Test(description = "TC_JOOMLA_BANNERS_CLIENTS_002-Verify that user can edit a client")
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
		bannersNewClientsPage.fillNewClientForm(titleName,
				Utilities.getContactName(), Utilities.getContactEmail());

		Log4j.info("Step 6. Click button save");
		bannersNewClientsPage.clickBtnSave();

		// VP1. A message : "Client successfully saved" shows and edit client page displays
		String messageActual = bannersEditClient.getMessageText();
		String messageExpected = "Client saved.";
		assertEquals(messageActual, messageExpected,
				"Message Client saved should be displayed");
		boolean result = bannersEditClient.chekEditPageDisplays();
		assertTrue(result, "Edit page should be displayed");

		Log4j.info("Step 7. Update new client form");
		bannersEditClient.updateNewClientForm(titleName1,
				Utilities.getContactName(), Utilities.getContactEmail());

		Log4j.info("Step 8. Click button save and close");
		bannersNewClientsPage.clickBtnSaveAndClose();

		// VP2. A message : "Client successfully saved" shows and Client is edited
		String messageActual1 = bannersClientsPage.getMessageText();
		String messageExpected1 = "Client saved.";
		assertEquals(messageActual1, messageExpected1,
				"Message client saved should be displayed");
		boolean temp = bannersClientsPage.checkElelementExists(titleName1);
		assertTrue(temp, "Element is not exist");
	}
}

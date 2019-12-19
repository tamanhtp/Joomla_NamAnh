package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import test.utils.BrowserHelper;
import test.utils.Log4j;

public class Default_TestNG_method {

	@SuppressWarnings("unused")
	@BeforeMethod(description = "Launch latest Chrome >> goto Administrator page")
	public void beforeMethod() {
		
//		switch (browser) {
//		case "chrome":
//			BrowserHelper.usingChrome();
//			break;
//		case "firefox":
//			BrowserHelper.usingFirefox();
//			break;
//		case "ie":
//			BrowserHelper.usingIE();
//			break;
//		case "edge":
//			BrowserHelper.usingEDGE();
//			break;
//		default:
//			BrowserHelper.usingChrome();
//			break;
//		}

		BrowserHelper dc = new BrowserHelper();
//		BrowserHelper.usingFirefox();
		Log4j.info("Launch Browser and open Administrator page");
		BrowserHelper.openAdministrator();

	}

	@AfterMethod(description = "Close Browser")
	public void afterMethod() {
		Log4j.info("Close Browser");
		BrowserHelper.quitDriver();
	}
}

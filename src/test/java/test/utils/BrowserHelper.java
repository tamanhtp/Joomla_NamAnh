package test.utils;

import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserHelper {

//	private static ChromeDriverService service;
	public static WebDriver driver;
	public static String browser = Constants.BROWSER;

	public static ChromeOptions options_Chrome;
	public static FirefoxOptions options_Firefox;
	public static InternetExplorerOptions options_IE;
	public static EdgeOptions options_Edge;

	public BrowserHelper() {

		options_Chrome = new ChromeOptions();
		options_Firefox = new FirefoxOptions();
		options_IE = new InternetExplorerOptions();
		options_Edge = new EdgeOptions();
		options_Chrome.addArguments("start-maximized");
		options_Firefox.addArguments("start-maximized");
		//BrowserHelper.usingChrome();
		switch (browser) {
		case "chrome":
			BrowserHelper.usingChrome();
			break;
		case "firefox":
			BrowserHelper.usingFirefox();
			break;
		case "ie":
			BrowserHelper.usingIE();
			break;
		case "edge":
			BrowserHelper.usingEDGE();
			break;
		default:
			BrowserHelper.usingChrome();
			break;
		}
	}
	//////////////
	public static void usingChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options_Chrome);
	}

	public static void usingFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(options_Firefox);
	}

	public static void usingIE() {
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver(options_IE);
	}

	public static void usingEDGE() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver(options_Edge);
	}
	//////////////
	public static void openURL(String url) {
		driver.get(url);
	}

	public static void openAdministrator() {
		driver.get(Constants.URL_ADMINISTRATOR);
	}

	public static void openUserInterface() {
		driver.get(Constants.URL_USERINTERFACE);
	}

	public WebDriver set() {
		return driver;
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}
//	options.addArguments("enable-automation"); 
//	options.addArguments("--no-sandbox"); 
//	options.addArguments("--disable-infobars");
//	options.addArguments("--disable-dev-shm-usage");
//	options.addArguments("--disable-browser-side-navigation"); 
//	options.addArguments("--disable-gpu"); 

	// BeforeClass
//	public static void createAndStartService() throws IOException {
//		service = new ChromeDriverService.Builder().usingDriverExecutable(new File("/path/to/chromedriver"))
//				.usingAnyFreePort().build();
//		service.start();
//	}

	// AfterClass
//	public static void stopService() {
//		service.stop();
//	}

	// Before
//	public static void createDriver() {
//		driver = new RemoteWebDriver(service.getUrl(), new ChromeOptions());
//	}

	// After
	public static void quitDriver() {
		driver.quit();
	}
}

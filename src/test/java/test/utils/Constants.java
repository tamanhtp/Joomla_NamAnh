package test.utils;

import com.github.javafaker.Faker;

public class Constants {

	public static Faker FAKER = new Faker();
	public static String LOGIN_USERNAME = "admin";
	public static String LOGIN_PASSWORD = "admin";
	public static String URL_ADMINISTRATOR = "http://192.168.190.227/joomla/administrator/index.php";
	public static String URL_USERINTERFACE = "http://192.168.190.227";
	public static String BROWSER = "chrome";
	

	public static void setChromeBrowser() 	{		BROWSER = "chrome";		}
	public static void setFirefoxBrowser() 	{		BROWSER = "firefox";	}
	public static void setIEBrowser() 		{		BROWSER = "ie";			}
	public static void setEDGEBrowser()		{		BROWSER = "edge";		}
}

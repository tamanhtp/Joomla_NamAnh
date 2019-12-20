package test.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities {

	public static void findElementInIframe(By iframe, By childen, String text)
			throws InterruptedException {
		WebElement Element5 = BrowserHelper.driver.findElement(iframe);
		BrowserHelper.driver.switchTo().frame(Element5);
		Thread.sleep(300);
		BrowserHelper.driver.findElement(childen).sendKeys(text);
		BrowserHelper.driver.switchTo().defaultContent();
	}

	// WebDriver.findElement.Sendkeys
	public static void sendkeys(By by, String text) {
			BrowserHelper.driver.findElement(by).sendKeys(text);
	}
	// WebDriver.findElement.click
	public static void click(By by) {
		BrowserHelper.driver.findElement(by).click();
	}	
	// WebDriver.findElement.clear
	public static void clear(By by) {
		BrowserHelper.driver.findElement(by).clear();
	}
	// FAKER
	public static String faker_title() {
		return Constants.FAKER.book().title()+" - "+timer_hhmmss();
	}

	public static String faker_content() {
		return Constants.FAKER.address().fullAddress();
	}

	public static String timer_hhmmss() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmss");
		LocalDateTime now = LocalDateTime.now();
		String result = dtf.format(now);
		return result;
	}
	public static String string_format(String xpath, String variable) {

		return String.format(xpath, variable);
	}
}

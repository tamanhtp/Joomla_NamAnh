package test.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utilities {

	public static void findElementInIframe(By iframe, By childen, String text)
			throws InterruptedException {
		WebElement Element5 = Constants.DRIVER.findElement(iframe);
		Constants.DRIVER.switchTo().frame(Element5);
		Thread.sleep(300);
		Constants.DRIVER.findElement(childen).sendKeys(text);
		Constants.DRIVER.switchTo().defaultContent();
	}

	// WebDriver.findElement.Sendkeys
	public static void sendkeys(By by, String text) {
		Constants.DRIVER.findElement(by).sendKeys(text);
	}

	// WebDriver.findElement.click
	public static void click(By by) {
		Constants.DRIVER.findElement(by).click();
	}

	// WebDriver.findElement.clear
	public static void clear(By by) {
		Constants.DRIVER.findElement(by).clear();
	}

	// FAKER
	public static String faker_title() {
		return Constants.FAKER.book().title() + " - " + timer_hhmmss();
	}

	public static String getName() {
		return Constants.FAKER.address().firstName();
	}

	public static String getContactName() {
		return Constants.FAKER.address().lastName();
	}

	public static String getContactEmail() {
		return Constants.FAKER.internet().emailAddress();
	}

	public static String getContent() {
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

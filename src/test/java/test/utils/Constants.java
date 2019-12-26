package test.utils;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class Constants {

	public static WebDriver DRIVER;

	public static Faker FAKER = new Faker();

	public static final String LOGIN_USERNAME = "satt";

	public static final String LOGIN_PASSWORD = "123456";

	public static final String URL_ADMINISTRATOR = "http://192.168.189.152:8080/administrator/";

}

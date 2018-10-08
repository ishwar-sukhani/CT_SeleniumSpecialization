package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtil {

	private static WebDriver driver;
	
	// This method will set driver instance
	public static void setDriver() {

		switch (Constant.BROWSER) {
		case "chrome":
			System.out.println("Launching CHROME ...");
			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-notifications");
//			options.addArguments("--ignore-certificate-errors");
			options.addArguments("--disable-extensions");
			System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
			driver = new ChromeDriver(options);
			break;

		case "ie":
			System.out.println("Launching IE ...");
			System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_PATH);
			driver = new InternetExplorerDriver();
			break;
		
		case "firefox":
			System.out.println("Launching FIREFOX ...");
			break;
		default:
			break;
		}
		
	}

	// This method will return browser instance
	public static WebDriver getDriver() {
		return driver;
	}
	
	// This method will close all open browser windows
	public static void closeDriver() {
		getDriver().quit();
	}
	
	// This method will open URL in browser
	public static void navigateTo(String URL) {
		getDriver().get(URL);
	}
	
	// This method will return a unique webelement based on input locator
	public static WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	/**
	 * @description this method returns list of webelements based on locator input 
	 * @param locator
	 * @return list of webelements
	 */
	public static List<WebElement> getElements(By locator) {
		return getDriver().findElements(locator);
	}
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {

	private static WebElement element = null;

	public static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='login-form-email']"));
		return element;
	}

	public static void setEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}

	public static WebElement getPassword(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='login-pass']"));
		return element;
	}

	public static void setPassword(WebDriver driver, String password) {
		getPassword(driver).sendKeys(password);
	}

	public static WebElement getLogIn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return element;
	}

	public static void setLogIn(WebDriver driver) {
		getLogIn(driver).click();
	}

	

}
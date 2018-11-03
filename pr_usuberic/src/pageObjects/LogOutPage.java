package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutPage {
	private static WebElement element = null;

	public static WebElement getLogOutArrow(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='navbar-logout']")));
	}

	public static void setLogOutArrow(WebDriver driver) {
		getLogOutArrow(driver).click();
	}

	public static WebElement getLogOut(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class='v-btn__content'][contains(text(),'Logout')]")));
	}

	public static void setLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}

	public static WebElement getLogOutYes(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Yes')]")));
	}

	public static void setLogOutYes(WebDriver driver) {
		getLogOutYes(driver).click();
	}

}
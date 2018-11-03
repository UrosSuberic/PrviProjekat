package pageObjects;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DateTimeUtils;

public class ClientsPage {
	private static WebElement element = null;

	public static WebElement getClientsBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'library_add')]")));
	}

	public static void setClientsBtn(WebDriver driver) {
		getClientName(driver).click();
	}

	public static WebElement getAddNewClientBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[contains(text(),'library_add')]")));

	}

	public static void setAddNewClientBtn(WebDriver driver) {
		getAddNewClientBtn(driver).click();
	}

	public static WebElement getClientName(WebDriver driver) {
		element = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return element;
	}

	public static void setClientName(WebDriver driver, String clientName) {
		getClientName(driver).sendKeys(clientName);
	}

	public static WebElement getContactName(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;
	}

	public static void setContactName(WebDriver driver, String contactName) {
		getContactName(driver).sendKeys(contactName);
	}

	public static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return element;
	}

	public static void setEmail(WebDriver driver, String email) {
		getEmail(driver).sendKeys(email);
	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;
	}

	public static void setRegistryNumber(WebDriver driver, Integer registryNumber) {
		getRegistryNumber(driver).sendKeys(String.valueOf(registryNumber));
	}

	public static WebElement getCountry(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return element;
	}

	public static void setCountry(WebDriver driver, String countryName) throws InterruptedException {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountry(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		country.perform();
	}

	public static WebElement getCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@class='ma-2 pa-3 text-xs-center']//div[3]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;
	}

	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	public static WebElement getStreet(WebDriver driver) {
		element = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return element;
	}

	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	public static WebElement getZip(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;
	}

	public static void setZip(WebDriver driver, Integer zip) {
		getZip(driver).sendKeys(String.valueOf(zip));
	}

	public static WebElement getCode(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-input code-field v-text-field']//input[@type='text']"));
		return element;
	}

	public static void setCode(WebDriver driver, String code) {
		getCode(driver).sendKeys(code);
	}


	public static WebElement getStatus(WebDriver driver) {
        element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
        return element;
        }
    public static WebElement getStatusLabel(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
        return element;
    }

    public static void setStatus(WebDriver driver, String status) throws InterruptedException {
        String currentStatus = getStatus(driver).getText();
        String cs = currentStatus.split(":")[1].trim();
        if(!status.equals(cs))
        {
            getStatus(driver).click();
        }
    }

	public static WebElement getSaveBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Save')]")));
	}

	public static void setSaveBtnCl(WebDriver driver) {
		getSaveBtn(driver).click();
	}
}

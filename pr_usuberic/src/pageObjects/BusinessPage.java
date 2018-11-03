package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessPage {

	private static WebElement element = null;

	public static WebElement getBusinessBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']")));
	}

	public static void setBusinessBtn(WebDriver driver) {
		getBusinessBtn(driver).click();
	}

	public static WebElement getAddNewBusinessBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[@id='add-new-business']//div[@class='v-btn__content']")));
	}

	public static void setAddNewBusinessBtn(WebDriver driver) {
		getAddNewBusinessBtn(driver).click();
	}

	public static WebElement getBusinessName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-name']"));
		return element;
	}

	public static void setBusinessName(WebDriver driver, String businessName) {
		getBusinessName(driver).sendKeys(businessName);
	}

	public static WebElement getCountries(WebDriver driver) {
		return element = driver.findElement(By.xpath("//input[@id='business-form-country']"));
	}

	public static void setCountries(WebDriver driver, String countryName) throws InterruptedException {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		country.perform();
	}

	public static WebElement getCity(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-city']"));
		return element;
	}

	public static void setCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}

	public static WebElement getStreet(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-street']"));
		return element;
	}

	public static void setStreet(WebDriver driver, String street) {
		getStreet(driver).sendKeys(street);
	}

	public static WebElement getZip(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-zip']"));
		return element;
	}

	public static void setZip(WebDriver driver, Integer zip) {
		getZip(driver).sendKeys(String.valueOf(zip));
	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='business-form-reg-num']"));
		return element;
	}

	public static void setRegistryNumber(WebDriver driver, Integer registryNumber) {
		getRegistryNumber(driver).sendKeys(String.valueOf(registryNumber));
	}

	public static WebElement getAddBankAccount(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//button[@id='business-form-add-bank-btn']//div[@class='v-btn__content']")));
	}

	public static void setAddBankAccount(WebDriver driver) {
		getAddBankAccount(driver).click();
	}

	public static WebElement getBankName(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-name']"));
		return element;
	}

	public static void setBankName(WebDriver driver, String bankName) {
		getBankName(driver).sendKeys(bankName);
	}

	public static WebElement getAccountNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-num']"));
		return element;
	}

	public static void setAccountNumber(WebDriver driver, Integer accountNumber) {
		getAccountNumber(driver).sendKeys(String.valueOf(accountNumber));
	}

	public static WebElement getSwiftNumber(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@id='bank-dialog-swf-num']"));
		return element;
	}

	public static void setSwiftNumber(WebDriver driver, Integer swiftNumber) {
		getSwiftNumber(driver).sendKeys(String.valueOf(swiftNumber));
	}

	public static WebElement getPaymentInstructions(WebDriver driver) {
		element = driver.findElement(By.xpath("//textarea[@id='bank-dialog-pay-inst']"));
		return element;
	}

	public static void setPaymentInstructions(WebDriver driver, String paymentInstructions) {
		getPaymentInstructions(driver).sendKeys(paymentInstructions);
	}
	
	public static WebElement getCurrency(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        element = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='v-select__selections']")));
        return element;
    }

    public static List<WebElement> getCurrencyLabel(WebDriver driver) {
        List<WebElement> currencyList = new ArrayList();
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Dinar')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'Euro')]")));
        currencyList.add(driver.findElement(By.xpath("//div[contains(text(),'US Dollar')]")));
        return currencyList;
    }

    public static void setCurrency(WebDriver driver, String currencyval) {
        Actions builder = new Actions(driver);
        WebElement currencyList = getCurrency(driver);
        Actions currency = builder.moveToElement(currencyList).click();
        currency.perform();
        List<WebElement> CurrencyLabel = getCurrencyLabel(driver);
        for (WebElement e : CurrencyLabel) {
            if (e.getText().equals(currencyval)) {
                e.click();
            }
        }
    }

	public static WebElement getAddBankAccountBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Add bank account')]")));
	}

	public static void setAddBankAccountBtn(WebDriver driver) {
		getAddBankAccountBtn(driver).click();
	}

	public static WebElement getSaveBtn(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		return element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Save')]")));
	}

	public static void setSaveBtn(WebDriver driver) {
		getSaveBtn(driver).click();
	}

}

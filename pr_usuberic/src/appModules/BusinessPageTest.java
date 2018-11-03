package appModules;

import utility.ExcelUtils;
import utility.Constant;

import org.openqa.selenium.WebDriver;
import pageObjects.BusinessPage;

public class BusinessPageTest {

	public static void setExcelFile1() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");

	}

	public static String AddNewBusinessTest(WebDriver driver) throws Exception {

		String businessName = ExcelUtils.getCellData(1, 1);
		String countryName = ExcelUtils.getCellData(1, 2);
		String city = ExcelUtils.getCellData(1, 3);
		String street = ExcelUtils.getCellData(1, 4);
		Integer zip = ExcelUtils.getCellDataInt(1, 5);
		Integer registryNumber = ExcelUtils.getCellDataInt(1, 6);

		BusinessPage.setAddNewBusinessBtn(driver);
		Thread.sleep(3000);
		BusinessPage.setBusinessName(driver, businessName);
		Thread.sleep(3000);
		BusinessPage.setCountries(driver, countryName);
		Thread.sleep(3000);
		BusinessPage.setCity(driver, city);
		Thread.sleep(3000);
		BusinessPage.setStreet(driver, street);
		Thread.sleep(3000);
		BusinessPage.setZip(driver, zip);
		Thread.sleep(3000);
		BusinessPage.setRegistryNumber(driver, registryNumber);
		Thread.sleep(3000);

		return "Pass";
	}

	public static void setExcelFile2() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet3");

	}

	public static String AddNewBankAccountTest(WebDriver driver) throws Exception {

		String bankName = ExcelUtils.getCellData(1, 1);
		Integer accountNumber = ExcelUtils.getCellDataInt(1, 2);
		Integer swiftNumber = ExcelUtils.getCellDataInt(1, 3);
		String paymentInstructions = ExcelUtils.getCellData(1, 4);
		String currencyval = ExcelUtils.getCellData(1, 5);

		BusinessPage.setAddBankAccount(driver);
		BusinessPage.setBankName(driver, bankName);
		BusinessPage.setAccountNumber(driver, accountNumber);
		BusinessPage.setSwiftNumber(driver, swiftNumber);
		BusinessPage.setPaymentInstructions(driver, paymentInstructions);
		BusinessPage.setCurrency(driver, currencyval);
		BusinessPage.setAddBankAccountBtn(driver);
		BusinessPage.setSaveBtn(driver);

		return "Pass";
	}

}


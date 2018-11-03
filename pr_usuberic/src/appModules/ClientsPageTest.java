package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class ClientsPageTest {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet4");
	}

	public static String AddNewClientTest(WebDriver driver) throws Exception {

		String clientName = ExcelUtils.getCellData(1, 1);
		String contactName = ExcelUtils.getCellData(1, 2);
		String email = ExcelUtils.getCellData(1, 3);
		Integer registryNumber = ExcelUtils.getCellDataInt(1, 4);
		String countryName = ExcelUtils.getCellData(1, 5);
		String city = ExcelUtils.getCellData(1, 6);
		String street = ExcelUtils.getCellData(1, 7);
		Integer zip = ExcelUtils.getCellDataInt(1, 8);
		// String dateAdded = ExcelUtils.getCellData(1, 9);
		String code = ExcelUtils.getCellData(1, 10);
		// String agreementDate = ExcelUtils.getCellData(1, 11);
		String status = ExcelUtils.getCellData(1, 12);

		ClientsPage.setAddNewClientBtn(driver);
		ClientsPage.setClientName(driver, clientName);
		ClientsPage.setContactName(driver, contactName);
		ClientsPage.setEmail(driver, email);
		ClientsPage.setRegistryNumber(driver, registryNumber);
		ClientsPage.setCountry(driver, countryName);
		ClientsPage.setCity(driver, city);
		ClientsPage.setStreet(driver, street);
		ClientsPage.setZip(driver, zip);
		// ClientsPage.setDateAdded(driver, dateAdded);
		ClientsPage.setCode(driver, code);
		// ClientsPage.setAgreementDate(driver, agreementDate);
		ClientsPage.setStatus(driver, status);
		ClientsPage.setSaveBtnCl(driver);

		return "Pass";

	}

}

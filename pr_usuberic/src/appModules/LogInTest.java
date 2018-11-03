package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.LogInPage;
import utility.Constant;
import utility.ExcelUtils;

public class LogInTest {

	public static void Execute(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

	}

	public static void GetlogInTest(WebDriver driver) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");

		String email = ExcelUtils.getCellData(1, 1);
		String password = ExcelUtils.getCellData(1, 2);

		LogInPage.setEmail(driver, email);
		LogInPage.setPassword(driver, password);
		LogInPage.setLogIn(driver);

	}

}

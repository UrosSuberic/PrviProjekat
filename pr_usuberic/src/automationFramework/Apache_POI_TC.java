package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import utility.Constant;
import utility.ExcelUtils;
import appModules.BusinessPageTest;
import appModules.ClientsPageTest;
import appModules.LogInTest;
import appModules.LogOutTest;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URL);
		LogInTest.GetlogInTest(driver);
		System.out.println("Login Successfully.");
		ExcelUtils.setCellData("Pass", 1, 3);
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URLB);
	    Thread.sleep(3000);
		BusinessPageTest.AddNewBusinessTest(driver);
		ExcelUtils.setCellData("Pass", 1, 8);
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet3");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BusinessPageTest.AddNewBankAccountTest(driver);
		ExcelUtils.setCellData("Pass", 1, 6);
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet4");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant.URLC);
		ClientsPageTest.AddNewClientTest(driver);	
		ExcelUtils.setCellData("Pass", 1, 13);
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet5");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LogOutTest.addNewLogOutTest(driver);
		ExcelUtils.setCellData("Pass", 1, 1);
		
		driver.close();

	}

}
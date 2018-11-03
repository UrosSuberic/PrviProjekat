package appModules;

import org.openqa.selenium.WebDriver;
import pageObjects.LogOutPage;

public class LogOutTest {

	public static String addNewLogOutTest(WebDriver driver) throws Exception {

		LogOutPage.setLogOutArrow(driver);
		LogOutPage.setLogOut(driver);
		LogOutPage.setLogOutYes(driver);

		return "Pass";
	}

}
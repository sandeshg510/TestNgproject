package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class LoginTestCase extends baseClass {

	@Test
	public void method1() throws IOException, InterruptedException {

		LoginPageObjects LPO = new LoginPageObjects(driver);

		LPO.enterUsername().sendKeys(constant.username);
		LPO.enterPassword().sendKeys(constant.password);
		Thread.sleep(2000);
		LPO.ClickOnLogin().click();
		commonMethods.handleAssertions(LPO.ErrorMessage(), constant.ExpectedErrorText);

	}

}
	
	
	
	
	
	
	
	
	
	
	
	
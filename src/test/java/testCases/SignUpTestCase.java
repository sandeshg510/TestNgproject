package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.SignUpPageObjects;
import Resources.baseClass;
import Resources.commonMethods;
import Resources.constant;

public class SignUpTestCase extends baseClass{

	@Test
	public void Method1() throws IOException, InterruptedException {

		SignUpPageObjects SPO = new SignUpPageObjects(driver);

		SPO.ClickOnSignUp().click();
		Thread.sleep(8000);
		SPO.enterFistname().sendKeys(constant.firstname);
		SPO.enterLastname().sendKeys(constant.lastname);
		SPO.enterEmail().sendKeys(constant.email);
		SPO.enterJobTitle().sendKeys(constant.jobTitle);
		SPO.enterCompanyName().sendKeys(constant.companyname);
		SPO.enterPhoneNo().sendKeys(constant.contact);
		SPO.enterCountry().sendKeys(constant.country);
		SPO.clickOnAgreement().click();
		commonMethods.selectdropdown(SPO.enterNoofEmployees(), 3);

	}
}

package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;

public class commonMethods extends LoginPageObjects {

	public commonMethods(WebDriver driver2) {
		super(driver2);
		// TODO Auto-generated constructor stub
	}

	public static void handleAssertions(String actualString, String expectedString) {

		String actual = actualString;

		String expected = expectedString;

		SoftAssert assertion = new SoftAssert();

		assertion.assertEquals(actual, expected);

		assertion.assertAll();
	}

	public static void selectdropdown(WebElement dropdown, int index) {

		dropdown.click();

		Select e = new Select(dropdown);

		e.selectByIndex(index);

	}

}

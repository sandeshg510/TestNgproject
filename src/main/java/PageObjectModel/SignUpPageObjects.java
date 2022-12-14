package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignUpPageObjects {

	public WebDriver driver;

	private By Tryforfree = By.xpath("//a[@class='button secondary']");

	private By Firstname = By.xpath("//input[@name='UserFirstName']");

	private By Lastname = By.xpath("//input[@name='UserLastName']");

	private By UserEmail = By.xpath("//input[@name='UserEmail']");

	private By JobTitle = By.xpath("//input[@name='UserTitle']");

	private By Contact = By.xpath("//input[@name='UserPhone']");

	private By Employees = By.xpath("//select[@name='CompanyEmployees']");

	private By CompanyName = By.xpath("//input[@name='CompanyName']");

	private By Country = By.xpath("//select[@name='CompanyCountry']");

	private By Checkbox = By.xpath("(//div[@class='checkbox-ui'])[1]");

	public SignUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement ClickOnSignUp() {

		return driver.findElement(Tryforfree);
	}

	public WebElement enterFistname() {

		return driver.findElement(Firstname);
	}

	public WebElement enterLastname() {

		return driver.findElement(Lastname);
	}

	public WebElement enterEmail() {

		return driver.findElement(UserEmail);
	}

	public WebElement enterJobTitle() {

		return driver.findElement(JobTitle);
	}

	public WebElement enterPhoneNo() {

		return driver.findElement(Contact);
	}

	public WebElement enterNoofEmployees() {

		return driver.findElement(Employees);
	}

	public WebElement enterCompanyName() {

		return driver.findElement(CompanyName);
	}

	public WebElement enterCountry() {

		return driver.findElement(Country);
	}

	public WebElement clickOnAgreement() {

		return driver.findElement(Checkbox);
	}

}
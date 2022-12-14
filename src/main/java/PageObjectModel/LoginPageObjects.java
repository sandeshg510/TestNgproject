package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {

	public WebDriver driver;

	private By username = By.xpath("//input[@id='username']");

	private By password = By.xpath("//input[@id='password']");

	private By Login = By.xpath("//input[@id='Login']");

	private By Error = By.xpath("(//div[@class='loginError'])[2]");

	private By Tryforfree = By.xpath("//a[@class='button secondary']");

	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;
	}

	public WebElement enterUsername() {

		return driver.findElement(username);
	}

	public WebElement enterPassword() {

		return driver.findElement(password);
	}

	public WebElement ClickOnLogin() {

		return driver.findElement(Login);
	}

	public String ErrorMessage() {

		return driver.findElement(Error).getText();
	}

	public WebElement ClickOnTryforfree() {

		return driver.findElement(Tryforfree);
	}

}

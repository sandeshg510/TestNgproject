package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class baseClass extends constant {

	public WebDriver driver;

	public void browserInitialization() throws IOException {

		// To read the properties file-
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\ASUS\\eclipse-workspace\\TestNgProject\\src\\main\\java\\Resources\\data.properties");

		// To access the properties file
		Properties prop = new Properties();
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			// fire fox code

		} else {

			System.out.println("please enter valid browser name");
		}

	}

	@BeforeMethod
	public void launch() throws IOException {

		browserInitialization();

		driver.get("https://login.salesforce.com/");

	}

}
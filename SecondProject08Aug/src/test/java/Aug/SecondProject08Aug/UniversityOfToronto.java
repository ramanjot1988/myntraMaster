package Aug.SecondProject08Aug;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class UniversityOfToronto {
	@Test
	public void universityOfToronto() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// It will open URL in Browser
		driver.get("https://www.utoronto.ca/");

	}

	@BeforeMethod
	public void beforeMethod() {
	}

}

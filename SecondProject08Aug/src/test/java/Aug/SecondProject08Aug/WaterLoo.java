package Aug.SecondProject08Aug;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class WaterLoo {
	@Test
	public void waterLoo() {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// It will open URL in Browser
		driver.get("https://uwaterloo.ca");
		//I am a description of something
		System.out.println(driver.findElement(By.xpath("(//span[@class='teaser'])[3]")).getText());

	}

	@BeforeMethod
	public void beforeMethod() {
	}

}

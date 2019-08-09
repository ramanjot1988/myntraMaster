package Aug.SecondProject08Aug;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class Myntra {

	@Test
	public void myntraTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// It will open URL in Browser
		driver.get("https://www.myntra.com/");
		// Actions action = new Actions(driver);
		driver.findElement(By.xpath("(//*[@data-index='1'])[1]")).click();
		driver.findElement(By.xpath("//*[@class='image-image undefined ']")).click();
		Thread.sleep(5000);
		// driver.switchTo().frame(0);
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[10]")));

		driver.findElement(By.linkText("Women")).click();
		driver.get("https://www.myntra.com/roadster?f=Gender%3Amen%20women%2Cwomen&rf=Discount%20Range%3A40.0_100.0_40.0%20TO%20100.0");
		Thread.sleep(3000);

	}

	@BeforeMethod
	public void beforeMethod() {

	}

}

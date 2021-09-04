package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			//Thread.sleep(2000);
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
			//Thread.sleep(2000);
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.linkText("See more")).click();
			driver.findElement(By.linkText("Lava")).click();
			driver.navigate().to("https://www.youtube.com/");
			driver.navigate().back();
			driver.close();
			//driver.quit();
		
	}
}

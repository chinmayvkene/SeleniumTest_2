package test_3;

import java.awt.Window;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		FileInputStream load = new FileInputStream("G:\\Eclipse Projects\\SeleniumTest_2\\config.properties");
		Properties prop = new Properties();
		prop.load(load);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		js.executeScript("window.scrollBy(0,-800)");
		
	}
}

package test_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		FileInputStream load = new FileInputStream("G:\\Eclipse Projects\\SeleniumTest_2\\config.properties");
		Properties prop = new Properties();
		prop.load(load);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		boolean check = driver.findElements(By.xpath("//input[@name='sex']")).get(1).isDisplayed();
		driver.findElements(By.xpath("//input[@name='sex']")).get(1).click();
		boolean check1 = driver.findElements(By.xpath("//input[@name='sex']")).get(1).isDisplayed();
		System.out.println(check);
		System.out.println(check1);
	}
}

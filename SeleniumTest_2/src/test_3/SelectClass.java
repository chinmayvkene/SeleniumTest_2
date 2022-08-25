package test_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

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
		
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select selday = new Select(day);
		selday.selectByValue("5");
		
		Select selmonth = new Select(month);
		selmonth.selectByIndex(8);
		
		Select selyear = new Select(year);
		selyear.selectByValue("1996");
	}
}

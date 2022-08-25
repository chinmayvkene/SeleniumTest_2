package test_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectClassWithout {

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
		
		List<WebElement> daylist = driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
		for(WebElement day:daylist) {
			if(day.getText().equals("5"))
				day.click();
		}
		List<WebElement> monthlist = driver.findElements(By.xpath("//select[@name='birthday_month']//option"));
		for(WebElement month:monthlist) {
			if(month.getText().equals("Aug"))
				month.click();
		}
		List<WebElement> yearlist = driver.findElements(By.xpath("//select[@name='birthday_year']//option"));
		for(WebElement year:yearlist) {
			if(year.getText().equals("1996"))
				year.click();
		}
	}
}

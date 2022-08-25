package test_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		FileInputStream load = new FileInputStream("G:\\Eclipse Projects\\SeleniumTest_2\\config.properties");
		Properties prop = new Properties();
		prop.load(load);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url2"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement box = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']"));
		box.click();
		WebElement box1 = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-open']"));
		String attvalue = box1.getAttribute("class");
		if(attvalue.contains("open"))
			System.out.println("checkbox is selected");
		else
			System.out.println("checkbox is not selected");
	}
}

package Test_2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreeenshot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scrn = (TakesScreenshot)driver;
		File source = scrn.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\Selenium Screenshot\\orange.png");
	    FileHandler.copy(source, destination);
	}
}

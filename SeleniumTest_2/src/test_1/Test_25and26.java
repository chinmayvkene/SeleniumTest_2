package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_25and26 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement rtclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rtclick).perform();
		driver.findElement(By.xpath("//*[text()='Quit']")).click();
		driver.switchTo().alert().accept();
		
		WebElement dblclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dblclick).perform();
		driver.switchTo().alert().accept();
	}
}

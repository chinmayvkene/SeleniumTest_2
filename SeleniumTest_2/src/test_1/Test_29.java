package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_29 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		WebElement target = driver.findElement(By.xpath("//input[@id='double-click']"));
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
}

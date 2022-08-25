package test_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_23 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> allwinid = driver.getWindowHandles();
		for(String eachid:allwinid) {
			driver.switchTo().window(eachid);
			if(driver.getTitle().contains("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {
				driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
				WebElement name = driver.findElement(By.xpath("//input[@name='FullName']"));
				name.sendKeys("Chinmay");
				Actions act = new Actions(driver);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				act.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
				driver.findElement(By.xpath("//input[@name='CompanyName']")).click();
				act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			}
				
		}
		for(String eachid:allwinid) {
			driver.switchTo().window(eachid);
			if(driver.getTitle().contains("OrangeHRM")) {
                driver.findElement(By.xpath("//input[@name='txtUsername']")).click();
				Thread.sleep(1000);
				driver.close();
		}
		
	}
}
}

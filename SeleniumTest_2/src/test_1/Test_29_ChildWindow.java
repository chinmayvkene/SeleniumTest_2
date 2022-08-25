package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_29_ChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//span[text()='Login/Register']"));
		login.click();
		String loginwinid = driver.getWindowHandle();
		driver.switchTo().window(loginwinid);
		driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("mno@gmail.com");	
	}
}

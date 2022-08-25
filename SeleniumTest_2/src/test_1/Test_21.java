package test_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_21 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String winid1 = driver.getWindowHandle();
		System.out.println(winid1);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> allids = driver.getWindowHandles();
		for(String eachid:allids) {
			driver.switchTo().window(eachid);
			if(driver.getTitle().contains("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) {
				System.out.println(eachid);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//a[text()='Contact Sales']")).click();
			}
		}
		
	}
}

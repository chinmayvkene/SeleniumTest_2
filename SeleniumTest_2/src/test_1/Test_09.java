package test_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_09 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_time_viewTimeModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_attendance_Attendance']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='menu_attendance_punchIn']")).click();
		
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		
		
		
		List<WebElement> yearlist = driver.findElements(By.cssSelector(".ui-datepicker-year option"));
		Thread.sleep(1000);
		for(WebElement year:yearlist) {
			if(year.getText().equals("1996"))
				year.click();
		}
		
		List<WebElement> monthlist = driver.findElements(By.xpath(".ui-datepicker-month option"));
		for(WebElement month:monthlist) {
			if(month.getText().equals("Aug"))
				month.click();
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//a[text()='5']")).click();
		
	}
}

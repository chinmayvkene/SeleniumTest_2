package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@title='Change the year']//option[contains(text(),'▲')]")).click();
		WebElement year = driver.findElement(By.xpath("//select[@title='Change the year']"));
		Select selyear = new Select(year);
		selyear.selectByValue("8/1996");
		
		WebElement month = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select selmonth = new Select(month);
		selmonth.selectByValue("8/1996");
		
		driver.findElement(By.xpath("//a[@title='Select Monday, Aug 5, 1996']")).click();
	}
}

package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//img[@class='imgdp']")).click();
		int i = 0;
		while(i == 0) {
			String date = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			if(!(date.equals("August 1996"))) 
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			else
				break;
		}
		driver.findElement(By.xpath("//a[text()='5']")).click();
	}
}

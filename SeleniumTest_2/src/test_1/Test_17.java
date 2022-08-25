package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='rct-text']//button")).click();
		driver.findElement(By.xpath("//span[text()='Desktop']//parent::span//parent::label//span[@class='rct-checkbox']")).click();
		String attval1 = driver.findElement(By.xpath("//span[text()='Desktop']//parent::span//parent::label//span[@class='rct-checkbox']")).getAttribute("class");
		if(attval1.equals("check"))
			System.out.println("Chechbox is selected");
		else 
			System.out.println("Checkbox is not selected");
	}
}

package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_14_To_16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='sign_up']")).click();
		boolean checkbox = driver.findElement(By.xpath("//span[text()='Female']//parent::label//input")).isSelected();
		System.out.println(checkbox);
		driver.findElement(By.xpath("//span[text()='Female']//parent::label//input")).click();
		boolean checkbox1 = driver.findElement(By.xpath("//span[text()='Female']//parent::label//input")).isSelected();
		System.out.println(checkbox1);
		boolean textverify = driver.findElement(By.xpath("//*[text()='Female']")).isDisplayed();
		System.out.println(textverify);
	}
}

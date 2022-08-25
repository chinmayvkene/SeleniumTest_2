package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_32 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#default");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Colorpicker']")).click();
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		String red = driver.findElement(By.xpath("//div[@id='red']//div")).getCssValue("background-color");
		System.out.println(red);
		String green = driver.findElement(By.xpath("//div[@id='green']//div")).getCssValue("background-color");
		System.out.println(green);
		String blue = driver.findElement(By.xpath("//div[@id='blue']//div")).getCssValue("background-color");
		System.out.println(blue);
	}
}

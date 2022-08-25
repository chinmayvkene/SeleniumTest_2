package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_31_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#default");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement source = driver.findElement(By.xpath("//div[@id='slider']"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).moveToElement(source, 600, 0).release(source).build().perform();
	}
}

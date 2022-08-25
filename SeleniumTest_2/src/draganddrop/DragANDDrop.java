package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElements(By.xpath("//a[@class='button button-orange']")).get(1);
		WebElement source1 = driver.findElements(By.xpath("//a[@class='button button-orange']")).get(3);
		WebElement target = driver.findElements(By.xpath("//li[@class='placeholder']")).get(1);
		WebElement target1 = driver.findElements(By.xpath("//li[@class='placeholder']")).get(3);
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		act.clickAndHold(source1).moveToElement(target1).release().build().perform();
	}
}

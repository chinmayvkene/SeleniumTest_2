package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/");
		driver.manage().window().maximize();
		
		String winid1 = driver.getWindowHandle();
		driver.findElements(By.xpath("//div[@class='absolute-center btn51ParentDimension']")).get(0).click();
		Set<String> winid2 = driver.getWindowHandles();
		for(String winid:winid2) {
			if(!(winid==winid1)) {
				driver.switchTo().window(winid);
				driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("Chinmay");
			}
		}
	}
}

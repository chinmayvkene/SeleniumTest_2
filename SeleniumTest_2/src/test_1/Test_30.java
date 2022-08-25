package test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_30 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Testing Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframe);
		String text = driver.findElements(By.xpath("//h1[@id='sampleHeading']")).get(0).getText();
		if(text.equals("This is a sample page"))
			System.out.println("output is correct");
		else
			System.out.println("output is not correct");
	}
}

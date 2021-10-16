import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suneel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());

	}

}

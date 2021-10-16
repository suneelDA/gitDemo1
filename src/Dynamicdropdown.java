import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suneel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("[class='mapbg'] [value='VTZ']")).click();
		driver.findElement(By.cssSelector("[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] [value='GOI']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

	}

}

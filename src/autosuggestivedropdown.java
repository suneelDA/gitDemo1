import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suneel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> options=driver.findElements(By.cssSelector("[class='ui-menu-item'] a"));
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("india"))
			{
				option.click();
				break;
			}
			
		}
		
		
	}

}

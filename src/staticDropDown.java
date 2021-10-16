import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suneel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.xpath("//*[@id='btnclosepaxoption']")).click();
		
		WebElement staticDp=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown=new Select(staticDp);
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		
		
		

	}

}

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class radiobuttonswithcalenders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suneel\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//CALENDERS
		
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
		List<WebElement>days=driver.findElements(By.cssSelector("[data-handler='selectDay']"));
		int count=driver.findElements(By.cssSelector("[data-handler='selectDay']")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(i).getText();
			if(text.equalsIgnoreCase("26"))
			{
				driver.findElements(By.cssSelector("[data-handler='selectDay']")).get(i).click();
				break;
			}

	}

}
}

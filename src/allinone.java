import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class allinone {

	public static void main(String[] args) throws InterruptedException {
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
		
		
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("[class='mapbg'] [value='VTZ']")).click();
		driver.findElement(By.cssSelector("[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] [value='GOI']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		
		
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
		
		
		
		
		System.out.println(driver.findElements(By.cssSelector("[type='checkbox']")).size());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());


		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
	}

}

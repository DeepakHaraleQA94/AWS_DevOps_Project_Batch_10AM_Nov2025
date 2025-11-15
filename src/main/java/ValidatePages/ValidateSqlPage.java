package ValidatePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateSqlPage {
	
	@Test
	
public void test1() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.linkText("SQL")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("SQL Tutorial")) {
		System.out.println("TC passed");	
		}else 
		{
			System.out.println("TC failed");
		}
		Thread.sleep(3000);
		driver.close();
		
	}
}

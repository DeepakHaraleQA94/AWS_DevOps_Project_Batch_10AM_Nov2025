package ValidatePages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VlidateYessInfotechWeb {

	@Test
	public void Test3() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yessinfotech.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("About Us")).click();
		 @Nullable
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("CSS Tutorial")) {
			System.out.println("TC passed");	
			}else 
			{
				System.out.println("TC failed");
			}
		
		Thread.sleep(3000);
		driver.close();
	}
}

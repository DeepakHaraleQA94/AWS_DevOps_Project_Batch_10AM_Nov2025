package ValidatePages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ValidateCssPage {

//	class = collection of data member and member functions
//	data member = collection variables
//	member functions = collection methods
	int a=20;
	String name ="aws";
	public void test() {
		
	}
	
	@Test
	public  void Test2() throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.findElement(By.linkText("CSS")).click();
	
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("Hellooooo");
		
		if(title.equals("CSS Tutorial")) {
		System.out.println("TC passed");	
		}else 
		{
			System.out.println("TC failed");
		}
		

		System.out.println("saurabh");
		Thread.sleep(3000);
		driver.close();
	}
}

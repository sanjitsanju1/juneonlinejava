package sahadev;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class Son {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
			WebDriver driver=new FirefoxDriver();
				driver.get("http://www.flipkart.com");
				driver.manage().window().maximize();
				Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7008545228");
	driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Sanju@12");
   driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
   Thread.sleep(5000);
   Actions src =new Actions(driver);
 src.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Home & Furniture')]"))).perform();
		
		
		//driver.findElement(By.partialLinkText("Floor Coverin")).click();
		 
		   
		  TakesScreenshot sr =(TakesScreenshot)driver;
				  
           File ssn= sr.getScreenshotAs(OutputType.FILE);

		FileHandler.copy(ssn,new File("./Svalue/files.png "));   
		driver.close();   
		   
		   
		   
		   
		   
		 //  TakesScreenshot=(TakesScreenshot)driver
	}

}

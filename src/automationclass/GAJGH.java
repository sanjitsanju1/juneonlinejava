package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class GAJGH {
	WebDriver driver;
@BeforeTest
public void verifylogoin() throws Exception {

	WebDriver driver=new FirefoxDriver();  
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7008545228");
	driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Sanju@12");
   driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
   Thread.sleep(5000);
	
}
@AfterTest
public void logouttest() {
	driver.quit();
}
}




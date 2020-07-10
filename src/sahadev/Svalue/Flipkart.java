package sahadev.Svalue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;

public class Flipkart {
	public void helper(WebDriver driver,WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid red;')", element);
	}
	public static void main(String[] args) throws Exception {
	


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
	
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com");
driver.manage().window().maximize();
WebElement d=driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
Flipkart hs = new Flipkart();
hs.helper(driver, d);
d.sendKeys("7008545228");
Thread.sleep(3000);
WebElement gt=driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
Flipkart e = new Flipkart();
e.helper(driver, gt);
gt.sendKeys("Sanju@12");

driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
Thread.sleep(5000);


	Actions ac = new Actions(driver);
	ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"))).perform();
	driver.navigate().refresh();
	  driver.findElement(By.className("LM6RPg")).sendKeys("shirt"+Keys.ENTER);
	
	driver.findElement(By.className("_2tnqd0 _3ZJShS"));
	
	
	}
	
	
	
}

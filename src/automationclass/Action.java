package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7008545228");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Sanju@12");
	   driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	   Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		Actions act =new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'TVs & Appliances')]"))).perform();
  

act.moveToElement(driver.findElement(By.partialLinkText("Split A"))).click();
		
		Thread.sleep(5000);
        driver.quit();
	}

}

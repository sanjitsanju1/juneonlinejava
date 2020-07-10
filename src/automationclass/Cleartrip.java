package automationclass;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//FirefoxDriver driver =new FirefoxDriver();
	//	driver.get("https://www.cleartrip.com");
	//	driver.manage().window().maximize();
	//	Thread.sleep(5000);	
	//
		//Select sell=new Select(driver.findElement(By.name("origin")));
		//ell.selectByVisibleText("banalore");
		//Select sell2= new Select(driver.findElement(By.id("destination")));
		//sell2.selectByVisibleText("bhubaneswar");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		//get collection of iframes
		List<WebElement>Olist=driver.findElements(By.tagName("iframe"));
		System.out.println("no of frames are::"+Olist.size());
		
		String pagetitle=driver.switchTo().frame(0).getTitle();
		System.out.println(pagetitle);
		
		
		//driver.quit();
		
		
		
	}

}

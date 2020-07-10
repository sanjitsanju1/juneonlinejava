package sahadev;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ls2 {
	public static void main (String args[]) throws Exception{
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7008545228");
	driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Sanju@12");
   driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
   Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);	
	List<WebElement>src=driver.findElements(By.tagName("a"));
	System.out.println("no of links are:"+src.size());
	for(int i=0;i<=src.size();i++)
	{
		String linkname=src.get(i).getText();
		String linkurl=src.get(i).getAttribute("href");
		System.out.println(linkurl+" "+linkname);
	}
	Thread.sleep(5000);
	TakesScreenshot srt=(TakesScreenshot)driver;
	File source=srt.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(source,new File("./screenshot/mcl.png"));
	System.out.println("screenshot is passed");
	driver.quit();

}
}
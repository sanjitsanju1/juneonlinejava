package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testngbasics {
	WebDriver driver;
	@BeforeMethod
	public void setup(){
	 driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	@Test//(priority=1)
	public void verifypagetittletest() {	
		driver.findElement(By.name("firstname")).sendKeys("sanjit");
	driver.findElement(By.name("lastname")).sendKeys("sahoo");
	driver.findElement(By.name("reg_email__")).sendKeys("sanjitsanju1996@gmail.com");
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sanjitsanju1996@gmail.com");
	driver.findElement(By.name("reg_passwd__")).sendKeys("sanju@1234");
}
	@Test//(priority=2)
	public void setupverify() {
		Select sc=new Select(driver.findElement(By.name("birthday_day")));
		sc.selectByIndex(6);
		Select scr=new Select(driver.findElement(By.name("birthday_month")));
		scr.selectByValue("4");
	Select scre=new Select(driver.findElement(By.name("birthday_year")));
	scre.selectByIndex(20);
	}
	@Test//(priority=3)
	public void setout() throws Throwable {
		driver.findElement(By.id("u_0_6")).click();
		Thread.sleep(3000);
	driver.findElement(By.id("u_0_17")).click();
	Thread.sleep(6000);
	}
//	
//	
//	String title=driver.getTitle();
//	System.out.println("the page title is:"+title);
//	Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
//

	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
}

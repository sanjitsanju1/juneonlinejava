package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
WebDriver driver;
@BeforeMethod
public void setup()throws Throwable
{
	driver=new FirefoxDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.name("txtuId")).sendKeys("Admin");
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.name("login")).click();
	Reporter.log("running setup",true);
}
@Test(description="Valiadate Branches",priority=0,enabled=true)
public void branches()throws Throwable
{
	driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();
	Reporter.log("Executing Branches Test",true);
	Thread.sleep(5000);
}
@Test(description="Valiadate Roles",priority=2,enabled=true)
public void Roles()throws Throwable
{
	driver.findElement(By.xpath("//tr//tr//tr[4]//td[1]//a[1]//img[1]")).click();
	Reporter.log("Executing Roles Test",true);
	Thread.sleep(5000);
}
@Test(description="Valiadate Users",priority=1,enabled=false)
public void users()throws Throwable
{
	driver.findElement(By.xpath("//tr[6]//td[1]//a[1]//img[1]")).click();
	Reporter.log("Executing Users Test",true);
	Thread.sleep(5000);
}
@AfterMethod
public void tearDown()
{
	driver.close();
	Reporter.log("Running TearDown",true);
}
}

package copy;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PropertyFile {
WebDriver driver;
Properties p;
FileInputStream fi;
@BeforeTest
public void setUp()throws Throwable
{
p=new Properties();
fi=new FileInputStream("C:\\Selenium11oclock\\Primus_Bank\\OR.properties");
p.load(fi);
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");

driver=new ChromeDriver();
driver.get(p.getProperty("Url"));
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath(p.getProperty("Objuser"))).sendKeys(p.getProperty("enter_username"));
driver.findElement(By.xpath(p.getProperty("Objpass"))).sendKeys(p.getProperty("enter_password"));
driver.findElement(By.xpath(p.getProperty("Objlogin"))).click();
Thread.sleep(5000);
}
@Test
public void verify_Branchcreation()throws Throwable
{
driver.findElement(By.xpath(p.getProperty("ObjBranches"))).click();
Thread.sleep(5000);
driver.findElement(By.xpath(p.getProperty("ObjNewBranch"))).click();
Thread.sleep(5000);
driver.findElement(By.xpath(p.getProperty("Objbname"))).sendKeys(p.getProperty("enter_bname"));
driver.findElement(By.xpath(p.getProperty("Objadd1"))).sendKeys(p.getProperty("enter_add1"));
driver.findElement(By.xpath(p.getProperty("Objadd2"))).sendKeys(p.getProperty("enter_add2"));
driver.findElement(By.xpath(p.getProperty("Objadd3"))).sendKeys(p.getProperty("enter_add3"));
driver.findElement(By.xpath(p.getProperty("Objarea"))).sendKeys(p.getProperty("enter_area"));
driver.findElement(By.xpath(p.getProperty("Objzcode"))).sendKeys(p.getProperty("enter_zcode"));
new Select(driver.findElement(By.xpath(p.getProperty("Objcountry")))).selectByVisibleText(p.getProperty("select_country"));
Thread.sleep(3000);
new Select(driver.findElement(By.xpath(p.getProperty("Objstate")))).selectByVisibleText(p.getProperty("select_state"));
Thread.sleep(3000);
new Select(driver.findElement(By.xpath(p.getProperty("Objcity")))).selectByVisibleText(p.getProperty("select_city"));
Thread.sleep(3000);
driver.findElement(By.xpath(p.getProperty("Objsubmit"))).click();
Thread.sleep(5000);
//get alert text
String alertmessage=driver.switchTo().alert().getText();
System.out.println(alertmessage);
Thread.sleep(5000);
driver.switchTo().alert().accept();
}
@AfterTest
public void tearDown()throws Throwable
{
	driver.findElement(By.xpath(p.getProperty("Objlogout"))).click();
	Thread.sleep(5000);
	driver.close();
}
}











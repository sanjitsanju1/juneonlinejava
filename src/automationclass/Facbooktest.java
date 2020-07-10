

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import og.testng.annotations.Test;

		
	
	
		
	//@Test
	//public void verifydropdowntest() throws InterruptedException {
	//WebElement element =	driver.findElement(By.id("day"));
	//Select  selectelement=new Select(element);
	
		//selectelement.selectByIndex(2);
	//	WebElement element1=driver.findElement(By.id("month"));

		//Thread.sleep(5000);	
	//}
		
	//@AfterMethod
	//public void setout() {
	//	driver.quit();	


package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facbooktest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);	

		driver.findElement(By.name("firstname")).sendKeys("sanjit");
		driver.findElement(By.name("lastname")).sendKeys("sahoo");
		driver.findElement(By.name("reg_email__")).sendKeys("samalragini02@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("samalragini02@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("sanju@1234");

	//	driver.findElement(By.name("reg_passwd__")).sendKeys("sanju@1234");
	//WebElement element=	driver.findElementByName("birthday_day");
	Select selectelement=new Select(driver.findElementByName("birthday_day"));
	selectelement.selectByIndex(10);

	Select sell2= new Select(driver.findElementByName("birthday_month"));
	sell2.selectByValue("7");
	Select sell3= new Select(driver.findElementByName("birthday_year"));
    sell3.selectByIndex(10);
   // driver.findElementByXPath("//button[@id='u_0_17']").click();
   // driver.findElementByLinkText("Create a Page");
   driver.findElement(By.id("u_0_6")).click();
   driver.findElement(By.name("websubmit")).click();
   
   // driver.navigate().back();
	Thread.sleep(5000);
	driver.quit()	;
	
	
	}
}


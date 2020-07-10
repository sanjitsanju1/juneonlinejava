package sahadev;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
 @Test
public void verifylogoin() throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
WebDriver driver=new ChromeDriver();  
driver.get("https://www.cleartrip.com");
driver.manage().window().maximize();
Thread.sleep(3000);
//Alert al=driver.switchTo().alert();
//	System.out.println(al.getText());
//	al.accept();
	}
@Test
public  void test1(){
driver.findElement(By.linkText("Flights")).click();
driver.findElement(By.id("RoundTrip")).click();
}

@Test
public void Test4() {
	
Select st=new Select(driver.findElement(By.xpath("//input[@id='FromTag']")));
st.selectByVisibleText("Bhubaneswar");
Select st2=new Select(driver.findElement(By.xpath("//input[@id='ToTag']")));
st2.selectByVisibleText("Hyderbad,IN");
}
 @Test
public void logouttest() {
	driver.close();
}
}




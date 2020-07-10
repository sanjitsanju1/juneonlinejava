package automationclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testmotion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		  driver.get("http://www.facebook.com"); driver.manage().window().maximize();
		  Thread.sleep(2000);
			
			  driver.findElement(By.id("email")).sendKeys("sanjitsanju1996@gmail.com");
			  driver.findElement(By.name("pass")).sendKeys("bkmprs@12");
			  driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
			  //driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
			 
		
		
		String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);

	}

	
	}



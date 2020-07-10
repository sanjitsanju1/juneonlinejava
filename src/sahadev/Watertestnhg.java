package sahadev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Watertestnhg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Alert al=driver.switchTo().alert();
//			System.out.println(al.getText());
//			al.accept();
			
	
		driver.findElement(By.linkText("Flights")).click();
		driver.findElement(By.id("RoundTrip")).click();
		
//		Select st=new Select(driver.findElement(By.xpath("//input[@id='FromTag']")));
//		st.selectByVisibleText("Bhubaneswar");
//		Select st2=new Select(driver.findElement(By.xpath("//input[@id='ToTag']")));
//		st2.selectByVisibleText("Hyderbad,IN");
//		
		
			driver.close();
	



	}
	}


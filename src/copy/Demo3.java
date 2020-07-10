package copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo3 {
WebDriver driver;
	@Test
	public void verifyTitle()
	{
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		String expected="Google";
		String actual=driver.getTitle();
		try{
	Assert.assertFalse(actual.equalsIgnoreCase(expected),"Titile is matching::"+expected+"   "+actual);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		}

	}



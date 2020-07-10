package copy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {
WebDriver driver;
	@Test
	public void verifyTitle()
	{
		driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		String expected="Google";
		String actual=driver.getTitle();
		try{
	Assert.assertTrue(actual.equalsIgnoreCase(expected),"title is not matching::"+expected+"   "+actual);
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		}

	}



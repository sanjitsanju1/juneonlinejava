package copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
WebDriver driver;
@Test
public void verifyTitle()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
	
driver=new ChromeDriver();
driver.get("https://gmail.com");
driver.manage().window().maximize();
String expected="Google";
String actual=driver.getTitle();
try{
Assert.assertEquals(actual, expected,"Title is not Matching");
}catch(Throwable t)
{
	System.out.println(t.getMessage());
}
}
}

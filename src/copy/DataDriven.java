package copy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DataDriven {
WebDriver driver;
FileInputStream fi;
FileOutputStream fo;
Workbook wb;
Sheet ws;
File screen;
Row row;
Cell cell;
ExtentReports report;
ExtentTest test;
@BeforeTest
public void setUp()
{
	report=new ExtentReports("./ExtentReports/DataDriven.html");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjit sahoo\\Downloads\\chromedriver.exe");
	

	driver=new ChromeDriver();
}
@Test
public void verifyLogin()throws Throwable
{
	fi=new FileInputStream("C:\\Users\\sanjit sahoo\\Documents\\logindata.xlsx");
	wb=WorkbookFactory.create(fi);
	ws=wb.getSheet("Login");
	row=ws.getRow(0);
	int rc=ws.getLastRowNum();
	int cc=row.getLastCellNum();
	Reporter.log("No of rows are::"+rc+"  "+"No of columns are::"+cc,true);
	for(int i=1;i<=rc;i++)
	{
		test=report.startTest("Data Driven Testing");
		test.assignAuthor("Ranga Senior Lead");
		driver.get("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		String username=ws.getRow(i).getCell(0).getStringCellValue();
		String password=ws.getRow(i).getCell(1).getStringCellValue();
	driver.findElement(By.name("txtUsername")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(4000);
	if(driver.getCurrentUrl().contains("dash"))
	{
		Reporter.log("Login SUccess",true);
		//write into results column
		ws.getRow(i).createCell(2).setCellValue("Login Success");
		//write into status column
		ws.getRow(i).createCell(3).setCellValue("Pass");
		test.log(LogStatus.PASS, "Login Success");
	}
	else
	{
screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(screen, new File("./Screens//Iterations//"+i+"Loginpage.png"));
	//get error message
	String errormessage=driver.findElement(By.id("spanMessage")).getText();	
	Reporter.log(errormessage,true);
	//write into results column
	ws.getRow(i).createCell(2).setCellValue(errormessage);
	//write into status column
	ws.getRow(i).createCell(3).setCellValue("Fail");
	test.log(LogStatus.FAIL, errormessage);
	}
	report.endTest(test);
	report.flush();
	}
	fi.close();
	fo=new FileOutputStream("C:\\Users\\sanjit sahoo\\Documents\\Datadiven.xlsx");
	wb.write(fo);
	fo.close();
	wb.close();
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}














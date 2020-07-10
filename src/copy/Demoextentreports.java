package copy;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demoextentreports {
ExtentReports report;
ExtentTest test;
@BeforeTest
public void generateReport()
{
	//define path to generate html reports
	report=new ExtentReports("./ExtentRepots/Report.html");
}
@Test
public void testPass()
{
	test=report.startTest("Test Case Pass");
	test.assignAuthor("Ranga Senior Manager");
	test.assignCategory("Functional");
	test.log(LogStatus.PASS, "Test Case is Passed");
	Assert.assertFalse(true);
}
@Test
public void testFail()
{
	test=report.startTest("Test CAse Fail");
	test.assignAuthor("Ranga Senior Manager");
	test.assignCategory("Functional");
	test.log(LogStatus.FAIL, "Test Case is Failed");
	Assert.assertTrue(false);
}
@Test
public void skipTest()
{
	test=report.startTest("Test Case Skip");

	test.assignAuthor("Ranga Senior Manager");
	test.assignCategory("Functional");
	test.log(LogStatus.SKIP, "Test Case Is Skipped");
	throw new SkipException("Test Case Is skipping");
}
@AfterMethod
public void closereports()
{
	report.endTest(test);
	report.flush();
}
}












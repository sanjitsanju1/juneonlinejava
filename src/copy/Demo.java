package copy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test(invocationCount=5)//invocationCount is executing test method for 5 times
public void verifycalculation()
{
	double x,y,z;
	x=345;
	y=7;
	z=x/y;
	Reporter.log("division floating value::"+z);
}
}

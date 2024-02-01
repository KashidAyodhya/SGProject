package AssgnmentTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentTest1 extends assignment1 {

@BeforeMethod
    public void browserLaunch() throws InterruptedException
    {
		launchBrowser();
    }
@Test(priority = 1)
public void logIN() throws InterruptedException
{
	login();
	}
@AfterMethod
public void closeBrowser()
{
	closingBrowser();
    
}
}
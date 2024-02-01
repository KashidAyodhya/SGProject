package AssgnmentTest;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assignment1 {

	public static EdgeOptions options;
    public static WebDriver driver ;


public void launchBrowser()
     {
        options = new EdgeOptions();
       
       options.setHeadless(true);
       options.addArguments("--disable-gpu");
       
         driver = new EdgeDriver(options);

        driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();

       public void searchproduct() throws InterruptedException {
	       
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

		searchBox.sendKeys("laptop", Keys.RETURN);

		System.out.println(driver.getTitle());
		
           }

      public void closingBrowser()
      {
          driver.quit();
      }
      }

	
	
	
	

package AssgnmentTest;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class assignment1 {

	public static EdgeOptions options;
    public static WebDriver driver ;


public void launchBrowser()
     {
        options = new EdgeOptions();
       
       options.setHeadless(true);
       options.addArguments("--disable-gpu");
       
         driver = new EdgeDriver(options);

         driver.get("https://www.flipkart.com/");
         driver.manage().window().maximize();


     
     }
    
       public void searchproduct() throws InterruptedException {


          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone"+ Keys.ENTER);
          Thread.sleep(4000);

          System.out.println(driver.getTitle());

          }


      public void closingBrowser()
      {
          driver.quit();
      }
      }

	
	
	
	

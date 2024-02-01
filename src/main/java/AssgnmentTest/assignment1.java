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

         driver.get("https://staging01.dtc.levi.com/US/en_US/");
         driver.manage().window().maximize();

         //--CLOSING MODAL
      
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
         try {
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-label='Close Modal']")));
             driver.findElement(By.xpath("//button[@aria-label='Close Modal']")).click();

         } catch (Exception e) {
             e.printStackTrace();
             System.out.println("Modal not closed");
         }
     }
        
      public void login() throws InterruptedException {

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
          driver.findElement(By.linkText("Log In")).click();
          Thread.sleep(4000);
          WebElement email = driver.findElement(By.xpath("(//input[@aria-label='Email'])[1]"));
          WebElement password =driver.findElement(By.xpath("//input[@aria-label='Password']"));
          WebElement login = driver.findElement(By.xpath("(//button[text()='Log In'])"));

        //  email.sendKeys("Ayodhya1234567@gmail.com");
         // password.sendKeys("Password123");
        //  login.click();
          Thread.sleep(4000);

          System.out.println("Succesfully logged in.");
          
        // String headline=driver.findElement(By.xpath("//h3[@class='strip__headline lsco-col-xs-21 lsco-col-md-17'][1]")).getText();
        // System.out.println(headline);
      }

      public void closingBrowser()
      {
          driver.quit();
      }
      }

	
	
	
	

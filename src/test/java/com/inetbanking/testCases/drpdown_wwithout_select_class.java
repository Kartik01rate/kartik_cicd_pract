package com.inetbanking.testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
public class drpdown_wwithout_select_class {
	

   public static void main(String[] args) throws Exception {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      String url = "https://www.tutorialspoint.com/tutor_connect/index.php";
      driver.get(url);
      Thread.sleep(5000);
      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
      // getting the list of elements with the xpath
      driver.findElement (By.xpath("//*[@name='selType']")).click();
      List<WebElement> opt = driver.findElements(By.xpath("//*[@name='selType']//option"));
      int s = opt.size();
      System.out.println("size is="+s);
      // Iterating through the list selecting the desired option
      for( int j = 1; j<= opt.size();j++){
         // if the option is By Subject click that option
         if( opt.get(j).getText().equals("By Name")){
            opt.get(j).click();
            System.out.println("option selected");
            break;
         }
         Thread.sleep(5000);
      }
      driver.quit();
   }
}
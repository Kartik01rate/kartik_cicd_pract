import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
public class Scroll_page 
{	
@Test
public void scrollDown()
         {
          System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\KARTIK'S\\\\git\\\\kartik_cicd_pract\\\\Drivers\\\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.navigate().to("Website URL");

            //to perform Scroll on application using Selenium
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,350)", "");
         }
}
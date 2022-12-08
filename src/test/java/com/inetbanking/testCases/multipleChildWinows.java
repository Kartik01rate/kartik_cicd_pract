package com.inetbanking.testCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

/*public class childWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
            }
        }
    }
}*/



public class multipleChildWinows {				
  public static void main(String[] args) throws InterruptedException {									
    System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/browser-windows");

    // Opening all the child window
    driver.findElement(By.id("windowButton")).click();
    
    driver.findElement(By.id("messageWindowButton")).click();
    
    String MainWindow = driver.getWindowHandle();
    System.out.println("Main window handle is " + MainWindow);

    // To handle all new opened window
    Set<String> s1 = driver.getWindowHandles();
    System.out.println("Child window handle is" + s1);
    Iterator<String> i1 = s1.iterator();

    // Here we will check if child window has other child windows and when child window
    //is the main window it will come out of loop.
      while (i1.hasNext()) {
          String ChildWindow = i1.next();
          if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
              driver.switchTo().window(ChildWindow);
              Thread.sleep(3000);
              driver.close();
              System.out.println("Child window closed");
           }
       }
    }
}
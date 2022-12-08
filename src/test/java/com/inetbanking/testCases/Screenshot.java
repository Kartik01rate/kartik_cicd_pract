package com.inetbanking.testCases;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Screenshot {
@Test
public void testBStackTakeScreenShot() throws Exception
{

System.setProperty("webdriver.chrome.driver","C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
//goto url
driver.get("https://www.browserstack.com");
//Call take screenshot function
this.takeSnapShot(driver, "C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\screenshot") ; 
driver.close();
}
/**
* This function will take screenshot
* @param webdriver
* @param fileWithPath
* @throws Exception
*/
public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
//Convert web driver object to TakeScreenshot
File scrShot =((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
//Call getScreenshotAs method to create image file
//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
//Move image file to new destination
File DestFile=new File(fileWithPath);
//Copy file at destination
FileUtils.copyFile(scrShot, DestFile);
}
}
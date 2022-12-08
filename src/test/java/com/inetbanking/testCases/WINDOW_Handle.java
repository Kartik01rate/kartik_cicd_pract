package com.inetbanking.testCases;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOW_Handle {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://omayo.blogspot.com/");
String firtswindow=driver.getWindowHandle();
driver.findElement(By.linkText("popup")).click();
Set<String> windows = driver.getWindowHandles();
Iterator<String> itr = windows.iterator();
while (itr.hasNext()) 
{
	String Window = itr.next();
	driver.switchTo().window(Window);
	if(driver.getTitle().equals("Title"))
	{
		driver.close();// closed new open window
	}
	
}
driver.switchTo().window(firtswindow);
}

}

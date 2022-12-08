package com.inetbanking.testCases;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_ID {

	

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); //navigates to the Browser
		driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       int size = driver.findElements(By.tagName("iframe")).size();//finds total num of frame on pagr
	       System.out.println(size);
	       
	    /*   for(int i=0; i<=size; i++){
	    		driver.switchTo().frame(i);
	    		int total=driver.findElements(By.xpath("html/body/a/img")).size();//to find the index of desired frame 
	    		System.out.println(total);
	    		    driver.switchTo().defaultContent();}*/
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
      }
}	

package com.inetbanking.testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class login {
public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARTIK'S\\git\\kartik_cicd_pract\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.browserstack.com/users/sign_in");
Thread.sleep(5000);
WebElement username=driver.findElement(By.xpath("//*[@id='user_email_login']"));
WebElement password=driver.findElement(By.id("user_password"));
WebElement login=driver.findElement(By.name("commit"));
username.sendKeys("abc@gmail.com");
password.sendKeys("your_password");
login.click();
String actualUrl="https://live.browserstack.com/dashboard";
String expectedUrl= driver.getCurrentUrl();
Assert.assertEquals(expectedUrl,actualUrl);
System.out.println("login success");
}

}
public class login2{
// public static void main(String args[])
 {
	 System.setProperty("webDriver.chrome.driver"," driver path");
	 
	 WebDriver driver =new  ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("www.xyx.xom");
	 Thread.sleep(3000);
	 WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
	 username.sendKeys("kkartik");
	 WebElement pass=driver.findElement(By.xpath("//*[@id='pass']"));
	 pass.sendKeys("qwerty");
	 WebElement loginbutton=driver.findElement(By.xpath("//*[@id='login']"));
	 loginbutton.click();
	 
	 
	 
	 
 }
}
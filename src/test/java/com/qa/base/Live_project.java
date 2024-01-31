package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Live_project {

	 public static WebDriver driver;
	
	 @BeforeTest
	 public void setup() {
		 WebDriverManager.chromedriver().setup();
		 
		 driver = new ChromeDriver();
		 
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 driver.manage().window().maximize();
		 
	 }
	
	 @Test(priority=5)
	 public void Login_with_Valid_credentials() throws InterruptedException {
		 
		 
		Thread.sleep(3000);
		 
		WebElement User_Name= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		 
		 	User_Name.sendKeys("Admin");
		
		 	
		 WebElement Password =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	
	      Password.sendKeys("admin123");
	      
	      
	    WebElement Login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	     
	     Login.click();
	     
	     String Expected = "Dashboard";
	 
	     String Actual = driver.findElement(By.xpath("Dashboard")).getText();
	     
	     System.out.println(Actual);
	 }
	 
	 @Test(priority=1)
	 public void Login_with_Valid_username_Invalid_Password() throws InterruptedException {
		 
		 
		
		 Thread.sleep(3000);
		 
		WebElement User_Name= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		 
		 	User_Name.sendKeys("Admin");
		
		 	
		 WebElement Password =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	
	      Password.sendKeys("InvalidPassword");
	      
	      
	    WebElement Login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	     
	     Login.click();
	
	  
	 }
	     
	     
	     
	     
	     
	     
	     @Test(priority=2)
		 public void Login_with_Invalid_username_Valid_Password() throws InterruptedException {
			 
			 
			
	    	 Thread.sleep(3000);
			 
			WebElement User_Name= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
			 
			 	User_Name.sendKeys("InvalidUserName");
			
			 	
			 WebElement Password =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		
		      Password.sendKeys("admin123");
		      
		      
		    WebElement Login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		     
		     Login.click();
		     
		     
	     }
	     
	     
		     @Test(priority=3)
			 public void Login_with_Invalid_Credentials() throws InterruptedException  {
				 
				 
				
		    	 Thread.sleep(3000);
				 
				WebElement User_Name= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
				 
				 	User_Name.sendKeys("InvalidUserName");
				
				 	
				 WebElement Password =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
			
			      Password.sendKeys("InvalidPassword");
			      
			      
			    WebElement Login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			     
			     Login.click();
			
	     
		     }
	     
	     
		     @Test(priority=4)
			 public void Login_with_Blank_Values() throws InterruptedException  {
				 
				 
		    	 Thread.sleep(3000);
				
				 
				WebElement User_Name= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
				 
				 	User_Name.sendKeys("");
				
				 	
				 WebElement Password =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
			
			      Password.sendKeys("");
			      
			      
			    WebElement Login= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
			     
			     Login.click();
			
	     
		     }
	     
	 
	//@AfterTest
	public void teardown() {
		
		driver.close();
		
		driver.quit();
		
	}
	
	// How to create Testng.xml file :
	
	// Right click on Project > TestNg > Convert to TestNg
	

		

}

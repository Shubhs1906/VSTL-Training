package com.TestNGAnnotations;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AmazonEx {



	
	
	@BeforeSuite
	public void openApplication (){
		System.out.println("Application open : runs before execution of all test methods");
	}
	
	
	@BeforeTest
	public void openOptions (){
		System.out.println("Options Open : executes before the execution of all test methods");
	}
	
	@BeforeClass
	public void openSettings (){
		System.out.println("Settings open : executes before the first method of current class is invoked ");
	}
	
	@BeforeMethod
	public void openProfile (){
		System.out.println("Profile open : executed before each test method execution");
	}
	
	
	
	
	@Test (priority=1)
	public void changeProfilePictureTest (){
		System.out.println("Profile Picture Changed : ");
	}
	
	@Test (priority = 2)
	public void changeUserIdTest (){
		System.out.println("User ID changed : ");
	}
	
	
	
	
	@AfterMethod
	public void closeProfile (){
		System.out.println("Profile Closed :  executed after each method execution ");
		
	}
	
	@AfterClass void closeSettings (){
		
		System.out.println("Settings Closed : executed after the execution of all the test methods of the current class");
	}
	
	@AfterTest
	public void closeOptions (){
		System.out.println("Options closed : will be executed after the execution of all the test methods of availabe classes belonging that folder");
		
		
	}
	
	@AfterSuite
	public void closeApplication (){
		System.out.println("Application closed : runs after execution of all the test methods in the suit");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * 
 	WebDriver driver;

	@AfterClass
	public void closeAmazonPage() {
		driver.close();
	}
	
		@BeforeClass
	public void openAmazonWebPage() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\git\\VSTL-Training\\VSTL-Assessment\\externalResources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
	}

	@BeforeTest 
	public void chooseCatagoriesTest() {

		WebElement catagories = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
		Select dropDown = new Select(catagories);
		dropDown.selectByVisibleText("Computers & Accessories");
	}

	@Test (priority=1)
	public void typeLaptopTest() {

		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Laptop");

	}

	@Test (priority=2)
	public void searchTest() {
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
	
	@AfterMethod 
	public void aOpenTest() {
		driver.findElement(By.xpath("//input[@aria-label='Search']")).click();
	}
	
	//@BeforeMethod
	public void bCloseTest() {
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}
	
	*/
	

	

}

package test_DEVOPS.test;

//import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
//import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;
/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver dr;
@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver", "C:\\install\\Chromedriver\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("headless");
	dr=new ChromeDriver(options);	
	dr.get("http://www.intellipaat.com/");
	dr.manage().window().maximize();
	dr.findElement(By.xpath("//input[@placeholder='Search from 150+ experts-made courses']")).click();
	dr.findElement(By.xpath("//input[@placeholder='Search from 150+ experts-made courses']")).sendKeys("DevOps");
	dr.findElement(By.xpath("//button[@type='submit']")).click();
	dr.findElement(By.xpath("//a[contains(text(),'Azure Devops Training')]")).click();
	
	String ActualTitle = "Azure Devops Training";
	String ActualValue = dr.findElement(By.xpath("//h1[contains(text(),'Azure Devops Training')]")).getText();
	Assert.assertEquals(ActualValue, ActualTitle);
	
    System.out.println( "test1 exec" );
    //dr.quit();
}
@AfterTest
public void test2(){
	System.out.println( "test1 ready to quit" );
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


	dr.quit();
	
}
//@Test
//public void test1()
//{
//    System.out.println( "test 2 is exec" );
//}
//@BeforeTest
//public void beforeTest()
//{
//	System.out.println( "before test" );
//}
//@BeforeSuite
//public void beforeSuite()
//{
//	System.out.println( "before suite" );
//}
//@BeforeClass
//public void beforeClass()
//{
//	System.out.println( "before class" );
//}
//@BeforeMethod
//public void beforeMethod()
//{
//	System.out.println( "before Method" );
//}
//@AfterMethod
//public void AfterMethod()
//{
//	System.out.println( "After Method" );
//}

}


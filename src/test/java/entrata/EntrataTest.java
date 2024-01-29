package entrata;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EntrataTest extends BaseTest
{
	
	   @BeforeClass
	    public void setup() 
	   {
	        initializeDriver();
	    }

	    @Test(priority = 1)
	    public void entrataLoginTest() throws InterruptedException
	    {
	    	//Open URL
	    driver.get("https://www.entrata.com");
	        
     WebElement ele = driver.findElement(By.xpath("//div[@class='header-desktop-nav hide-on-mobile']/div[@class='header-nav-item'][1]"));
     
	 //Using Actions class performing on action (product)on home Screen
	   Actions act = new Actions(driver);
	    
	    act.moveToElement(ele).perform();
	    
	    // Insted of implicitlytWait we use Thread.sleep(); to Wait for certain time period
	    Thread.sleep(10000);
	 
	      //click on Residentpay
	   
	    driver.findElement(By.xpath("//div[@class=\"fat-nav\"]//a[text()='ResidentPay']")).click(); 
	    
	    Thread.sleep(4000);
	   
	    driver.findElement(By.xpath("//button[@aria-label=\"Accept cookies\"]")).click();
	    
	   Thread.sleep(6000);
	   
	   driver.findElement(By.xpath("//a[@class=\"cta-link-default dark-cta-link banner-link\"]")).click();//click on learnmore link
	   
	   driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Maruti");
	   driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Bangar");
	   
	   driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("maruti@567");
	   
	   driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("Entrata");
	   
	   driver.findElement(By.xpath("//input[@id=\"Phone\"]")).sendKeys("9226828004");
	   
	   Thread.sleep(4000);
	   
	   
	WebElement ele3 =   driver.findElement(By.xpath("//select[@name=\"Unit_Count__c\"]"));
	
	// Using Select class to handle liatbox contains present in webpage
	Select s= new Select(ele3);
	
    s.selectByValue("1 - 10");
    
	driver.findElement(By.xpath("//input[@name='Title']")).sendKeys("Testing");
	
	driver.navigate().back();
	
	  WebElement loginButton = driver.findElement(By.xpath("//div[@class='header-desktop-buttons hide-on-mobile']//a[text()='Sign In']"));
	    loginButton.click();
	        
	     Thread.sleep(4000);
	        
	      driver.findElement(By.xpath("//a[@title=\"Resident Portal Login Button\"]")).click();
	        
	       Thread.sleep(5000);
	      }
	    
	       //Using Assertion Verify Element is Displayed or not on webpage
          @Test(priority=2)
          public void verifyelementispresentornot()
            {
         boolean VerifyElement =   driver.findElement(By.xpath("//div[text()='View the Website']")).isDisplayed();
            
        
        Assert.assertTrue(VerifyElement);

	        driver.navigate().back();
	        
	    }
          
         // Verify Actual and Expected Result by using Assertion
        @Test(priority=3)
	    public void propertymanagerlogin()
	    {
	   
	   WebElement propertymanagerlogin =  driver.findElement(By.xpath("//a[@class='button-default solid-dark-button']"));
	   String actresult=  propertymanagerlogin.getText();
	    String expresult = "Property Manager Login";
	        
	       Assert.assertEquals(actresult,  expresult);
	    }
	    // close Browser
	     @AfterClass
	    public void tear()
	    {
	       tearDown();
	       
	      
	    }
	}



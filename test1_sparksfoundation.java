package task_6;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1_sparksfoundation {
	
	private static final WebElement NULL = null;

	public static void main(String[] args) throws InterruptedException {
	//setting up web driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\browserdriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
	//opening google search page
		driver.get("http://www.google.com");
		driver.manage().window().setSize(new Dimension(1536, 824));
		driver.findElement(By.name("q")).sendKeys(Keys.DOWN);
    
    //searching for the sparks foundation 
		driver.findElement(By.name("q")).sendKeys("the sparks foundation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);	
    
    //checking for the logo
		driver.findElement(By.cssSelector(".g:nth-child(1) > div:nth-child(2) .LC20lb")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("img")).click();
			{
					List<WebElement> elements = driver.findElements(By.cssSelector("img"));
					assert(elements.size() > 0);
					if(elements.size()>0) {
							System.out.println("the sparks foundationlogo found"); 
					}
					else {
							System.out.println("the sparks foundation logo not found");
					}
			}
			
	//checking for about us
		
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(1000);
	    driver.findElement(By.linkText("Vision, Mission and Values")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".w3l_inner_section")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".blog-w3ls")).click();
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".blog-w3ls"));
		      assert(elements.size() > 0);
		      if(elements.size()>0) {
					System.out.println("about us content found"); 
		      }
		      else {
					System.out.println("about us content not found");
		      }
		    }
	//checking for Polices and Code
		    
		    driver.findElement(By.linkText("Policies and Code")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Policies")).click();
		    Thread.sleep(1000);
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".tittle-agileits-w3layouts"));
		      assert(elements.size() > 0);
		      if(elements.size()>0) {
					System.out.println("Polices and Code content found"); 
		      }
		      else {
					System.out.println("Polices and Code content not found");
		      }
		    } 
		    
     //checking for Programs
		    
		    driver.findElement(By.linkText("Programs")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Student Scholarship Program")).click();
		    Thread.sleep(1000);
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".para-w3-agile"));
		      assert(elements.size() > 0);
		      if(elements.size()>0) {
					System.out.println("Programs content found"); 
		      }
		      else {
					System.out.println("Programs content not found");
		      }
		    }
		    
		  //checking for LINKS
		    
		    driver.findElement(By.linkText("LINKS")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Join Us")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.linkText("Why Join Us")).click();
		    Thread.sleep(1000);
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".col-md-12"));
		      assert(elements.size() > 0);
		      if(elements.size()>0) {
					System.out.println("LINKS content found"); 
		      }
		      else {
					System.out.println("LINKS content not found");
		      }
		    }
		    
		  //checking for Contact Us
		    driver.findElement(By.linkText("Contact Us")).click();
		    Thread.sleep(1000);
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".agileits_w3layouts_right:nth-child(2) > h4"));
		      assert(elements.size() > 0);
		      if(elements.size()>0) {
					System.out.println("Contact Us content found"); 
		      }
		      else {
					System.out.println("Contact Us content not found");
		      }
		    }
		    
		    //verified
		    System.out.println("the Sparks foudation website is verified successfully using automation testing-Selenium");
		    driver.close();	    
}	
}
	
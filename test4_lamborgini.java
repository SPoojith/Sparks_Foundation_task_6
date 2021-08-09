package task_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test4_lamborgini {
	private static final WebElement NULL = null;

	public static void main(String[] args) throws InterruptedException {
	//setting up web driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\browserdriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
	//opening google search page
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(1552, 840));
		Thread.sleep(1000);
		
	//search for lamborgini
		driver.findElement(By.name("q")).sendKeys("lamborghini");
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    
	    {
	        WebElement element = driver.findElement(By.cssSelector(".eKjLze .LC20lb"));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).perform();
	      }
	    driver.findElement(By.cssSelector(".eKjLze .LC20lb")).click();
	    {
	      WebElement element = driver.findElement(By.tagName("body"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element, 0, 0).perform();
	    }
	    
	//check for logo
	    {
	        List<WebElement> elements = driver.findElements(By.cssSelector(".logo > .css-1ux6sy9"));
	        Thread.sleep(5000);
	        assert(elements.size() > 0);
	        if(elements.size()>0) {
				System.out.println("lamborghini logo found"); 
	      }
	      else {
				System.out.println("lamborghini logo not found");
	      }
	    }
	    
	    
	    
	    //checking model content
	    
	    
	    driver.findElement(By.cssSelector("#lev-1-0 span")).click();
	    Thread.sleep(2000);
	    {
	    	Thread.sleep(1000);
	      List<WebElement> elements = driver.findElements(By.cssSelector(".px-md-0"));
	      Thread.sleep(1000);
	      assert(elements.size() > 0);
	      if(elements.size()>0) {
				System.out.println("Models content found"); 
	      }
	      else {
				System.out.println("Models content not found");
	      }
	    }
	    System.out.println("the lamborghini webpage is verified successfully using automation testing-Selenium");
	        driver.close();
	        
	      
	    
	}
	}


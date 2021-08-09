package task_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test5_iphone {
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
		
	//search for iphone/apple
		    driver.findElement(By.name("q")).sendKeys("apple");
		    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		    driver.findElement(By.cssSelector(".cfxYMc > span")).click();
		    
		    //check for logo
		    {
		      List<WebElement> elements = driver.findElements(By.id("ac-gn-firstfocus"));
		      assert(elements.size() > 0);
		      if(elements.size()>0) {
					System.out.println("the apple logo found"); 
			}
			else {
					System.out.println("the apple logo not found");
			}
		    }
		    
		    //check for compare content
		    driver.findElement(By.linkText("iPhone")).click();
		    driver.findElement(By.cssSelector(".chapternav-item-compare .chapternav-label")).click();
		    {
		      List<WebElement> elements = driver.findElements(By.cssSelector(".ac-gf-buystrip"));
		      assert(elements.size() > 0); if(elements.size()>0) {
					System.out.println("iphone compare content found"); 
		      }
		      else {
					System.out.println("iphone compare content not found");
		      }
		    }

	        System.out.println("the apple/iphone webpage is verified successfully using automation testing-Selenium");
	        driver.close();
		
		
		
		
		
		
	}
}

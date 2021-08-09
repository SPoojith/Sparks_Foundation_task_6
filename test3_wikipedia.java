package task_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3_wikipedia {
	private static final WebElement NULL = null;

	public static void main(String[] args) throws InterruptedException {
	//setting up web driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\browserdriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
	//opening google search page
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		driver.manage().window().setSize(new Dimension(1552, 840));
		
	// search for wikipedia
	    driver.findElement(By.name("q")).sendKeys("wikipedia");
	    Thread.sleep(1000);
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	 
	//checking for logo    
	    driver.findElement(By.cssSelector(".g:nth-child(1) > div:nth-child(2) .LC20lb")).click();
	    {
	      List<WebElement> elements = driver.findElements(By.cssSelector(".mw-wiki-logo"));
	      Thread.sleep(1000);
	      assert(elements.size() > 0);
	      if(elements.size()>0) {
				System.out.println("wikipedia logo found"); 
	      }
	      else {
				System.out.println("wikipedia logo not found");
	      }
	    	  
	    }
	//checking for the title wikipedia
	    {
	        List<WebElement> elements = driver.findElements(By.id("mp-welcome"));
	        Thread.sleep(1000);
	        assert(elements.size() > 0);
	        if(elements.size()>0) {
				System.out.println("wikipedia title matched"); 
	      }
	      else {
				System.out.println("wikipedia title not matched");
	      }
	      }
	
	//verifing search box
	    driver.findElement(By.id("searchInput")).click();
	    Thread.sleep(1000);
	    {
	    	Thread.sleep(1000);
	      WebElement element = driver.findElement(By.id("searchInput"));
	      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
	      assert(isEditable);
	      if(isEditable) {
	    	  System.out.println("The wikipedia search box is editable");
	      }else {
	    	  System.out.println("the wikipedia search box is in editable");
	      }
	    }
	    System.out.println("the wikipedia search webpage is verified successfully using automation testing-Selenium");
	    driver.close();
	
	
	}   
	
}

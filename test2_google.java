package task_6;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2_google {
	private static final WebElement NULL = null;

	public static void main(String[] args) throws InterruptedException {
	//setting up web driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sharath\\browserdriver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
	//opening google search page
		driver.get("http://www.google.com");
		driver.manage().window().setSize(new Dimension(1536, 824));
	    Thread.sleep(1000);
	//checking for the google logo	
		{
	      List<WebElement> elements = driver.findElements(By.cssSelector(".lnXdpd"));
	      Thread.sleep(1000);
	      assert(elements.size() > 0);
	      if(elements.size()>0) {
				System.out.println("google logo found"); 
		}
		else {
				System.out.println("google logo not found");
		}
	    }
	    
	    //checking if the search box is editable
	    driver.findElement(By.name("q")).click();
	    {
	      WebElement element = driver.findElement(By.name("q"));
	      Thread.sleep(1000);
	      Boolean isEditable = element.isEnabled() && element.getAttribute("readonly") == null;
	      assert(isEditable);
	      if(isEditable) {
	    	  System.out.println("The google search box is editable");
	      }else {
	    	  System.out.println("the google search box is in editable");
	      }
	    }
	    System.out.println("the google search webpage is verified successfully using automation testing-Selenium");
	driver.close();
	}

}

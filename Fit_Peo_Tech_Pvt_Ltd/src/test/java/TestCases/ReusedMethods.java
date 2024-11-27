package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusedMethods extends ExecuteTestCases{
	
	
	public WebElement xk(String a)
    
    {
	 return driver.findElement(By.xpath(obj.getProperty(a)));	
	
	  }
		 
	 
	public void t(int X) throws InterruptedException
	{
		int a = 1000*X;
		Thread.sleep(a);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Scripting extends ReusedMethods{
	
	
	public void  NavigatetotheFitPeo() throws InterruptedException
	
	{
		driver.get(obj.getProperty("URL"));        //Navigate to the FitPeo Home page
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("RURL"))).click();  //Navigate to the Revenue Calculator Page
		
		t(2);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)"); // Scroll Down to the Slider section
		
		t(2);
	
		WebElement slider =driver.findElement(By.xpath(obj.getProperty("SLIDER")));
		
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(slider).moveByOffset(94, 0).release().perform();   // Adjust the Slider
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("ADJUSTSLIDER"))).click();
		
		t(2);
		
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
		action.keyDown(Keys.DELETE).keyUp(Keys.DELETE).perform();
		
		
		t(2);
		
		
		driver.findElement(By.xpath(obj.getProperty("UPDATETEXTFIELD"))).sendKeys("560");  //Update the Text Field
		
		
		
	    int number = 560;                         // validate the slider value
		
		if(number == 560)
		{
			System.out.println(" The slider's position is updated to reflect the value 560");
		}
		
		else
		{
			System.out.println("The slider's position is not updated to reflect the value 560");

		}
		
		t(2);
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)"); 
		
		t(2);
		
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX1"))).click();
		
		t(1);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX2"))).click();
		
	    t(2);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,450)");
		
		t(1);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX3"))).click();
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX4"))).click();
		
		t(2);
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,500)");
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX5"))).click();
		
		t(2);
	    
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX6"))).click();
		
		t(2);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,505)");
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX7"))).click();
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX8"))).click();
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX9"))).click();
		
		t(2);
		
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX10"))).click();
		
		t(2);
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,510)");
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX11"))).click();
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX12"))).click();
		
		t(2);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,513)");
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX13"))).click();
		
		t(2);
		
		driver.findElement(By.xpath(obj.getProperty("CHECKBOX14"))).click();
		
		t(2);
		
		driver.quit();
		
		
		
		
	}	
}

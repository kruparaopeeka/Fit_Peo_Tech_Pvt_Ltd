package Basepack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	
	public static WebDriver driver;
	public static Properties obj;
	
	
  @BeforeMethod
  public void OpenBrowser() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO L490\\eclipse-workspace\\Fit_Peo_Tech_Pvt_Ltd\\Browser\\chromedriver.exe");
	  driver = new ChromeDriver();  
	  driver.manage().window().maximize();
	
	  
	  FileInputStream f = new FileInputStream("C:\\Users\\LENOVO L490\\eclipse-workspace\\Fit_Peo_Tech_Pvt_Ltd\\src\\data\\java\\DATA\\My DATA");
	 
	  
	  
	  
	  obj = new Properties();
	  obj.load(f);
	  
	  
	  
	
	  
	  
}
  
 
  @AfterClass
  public void CloseBrowser() {
	  
	  
	  
	  
	  	  
  }

}

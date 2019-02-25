package tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("http://apps.qa2qe.cognizant.e-box.co.in/Agent_Registration/");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	 System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
	  //System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
	  //driver = new ChromeDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
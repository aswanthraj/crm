package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest {
	WebDriver driver;
  @Test(priority=0)
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.freecrm.com/index.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("wexos");
		driver.findElement(By.xpath("//input[@class='form-control'][1]")).sendKeys("aswanthraj");
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/form/div/input[2]")).sendKeys("wexos123");
		driver.findElement(By.xpath("html/body/div[2]/div/div[3]/form/div/div/input")).click();
  }
}

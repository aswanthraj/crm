package start;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContactsTest extends loginTest {
  @Test(priority=1)
  public void fa()  throws InterruptedException{
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	  Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='cs_name']")).sendKeys("aswanth a");
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
      driver.navigate().back();
  }
}

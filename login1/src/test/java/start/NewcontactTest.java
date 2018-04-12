package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NewcontactTest extends ContactsTest {
  @Test(priority=2)
  public void fab() throws InterruptedException{
	  Thread.sleep(5000);
	  driver.switchTo().frame("mainpanel");
	  WebElement w1=driver.findElement(By.xpath("//a[text()='Contacts']"));
	  Actions a=new Actions(driver);
		a.moveToElement(w1).build().perform();
		a.click();
		//Thread.sleep(5000);
		WebElement w2=driver.findElement(By.xpath("//a[text()='New Contact']"));
		w2.click();
		Thread.sleep(3000);
		WebElement w3=driver.findElement(By.xpath("//select[@name='title']"));
		w3.click();
		Select ash=new Select(w3);
		ash.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("asw");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("raj");
		driver.findElement(By.xpath("//input[@name='country']")).sendKeys("india");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	  
  }
}

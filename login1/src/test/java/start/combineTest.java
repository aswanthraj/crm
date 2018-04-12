package start;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class combineTest extends NewcontactTest {
  @Test(priority=3)
  public void fabc() throws InterruptedException {
	  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	  driver.findElement(By.xpath("html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[2]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("wexos");
	  driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("asw");
	  driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("ra");
	  driver.findElement(By.xpath("(//input[@value='Lookup'])[2]")).click();
	  
	  Set<String> as=driver.getWindowHandles();
	  Iterator<String> bs=as.iterator();
	  String parentId=bs.next();
	  String childId=bs.next();
	  driver.switchTo().window(childId);
	  Thread.sleep(3000);
	  driver.close();
	 driver.switchTo().window(parentId);
	  //Thread.sleep(5000);
	  driver.switchTo().frame("mainpanel");
	  driver.findElement(By.xpath("html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/form/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[10]/td[2]/input[3]")).sendKeys("asd");
	  
  }
}

package login.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectHotel extends Payment{

	public void Select(WebDriver driver) throws InterruptedException {
		Actions a= new Actions(driver);
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		a.moveToElement(radio).click().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
}

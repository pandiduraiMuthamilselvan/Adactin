package login.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage extends SelectHotel{

	public void SearchHotel(WebDriver driver) throws AWTException, InterruptedException {
		Robot r= new Robot();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement location = driver.findElement(By.id("location"));
		Select s= new Select(location);
		s.selectByVisibleText("New York");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s1= new Select(hotels);
		s1.selectByIndex(2);
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s2= new Select(roomType);
		s2.selectByValue("Double");
		driver.findElement(By.id("room_nos")).click();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		WebElement in = driver.findElement(By.id("datepick_in"));
		js.executeScript("arguments[0].setAttribute('Value','01/01/2024')",in);
		WebElement out = driver.findElement(By.id("datepick_out"));
		js.executeScript("arguments[0].setAttribute('Value','03/01/2024')", out);
		WebElement adult = driver.findElement(By.name("adult_room"));
		Select s3= new Select(adult);
		s3.selectByValue("2");		
		WebElement child = driver.findElement(By.id("child_room"));
		Select s4= new Select(child);
		s4.selectByVisibleText("1 - One");
		Thread.sleep(2000);
//		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
//		a.moveToElement(submit).click().perform();
		
	}
	

}

package login.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Payment {
	public void pay(WebDriver driver) throws InterruptedException, AWTException {
		driver.findElement(By.id("first_name")).sendKeys("Pandidurai");
		driver.findElement(By.id("last_name")).sendKeys("Muthamilselvan");
		driver.findElement(By.name("address")).sendKeys("Trichy");
		driver.findElement(By.xpath("(//input[@class='reg_input'])[3]")).sendKeys("6758934590127456");
		WebElement type = driver.findElement(By.id("cc_type"));
		Select s= new Select(type);
		s.selectByValue("VISA");
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select s1= new Select(expMonth);
		s1.selectByVisibleText("February");
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select s2= new Select(expYear);
		s2.selectByValue("2024");
		driver.findElement(By.name("cc_cvv")).sendKeys("657");
		driver.findElement(By.name("book_now")).click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(6000);
		WebElement end = driver.findElement(By.id("search_hotel"));
		js.executeScript("arguments[0].scrollIntoView(true)", end);
		WebElement orderNo = driver.findElement(By.id("order_no"));	
		//WebElement val = driver.findElement(By.tagName("value"));
		String number = orderNo.getAttribute("value");
		//String number = orderNo.toString();
		//String number = orderNo.getText();
		System.out.println("Your Confirmation number is "+number);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		for(int i=1;i<=4;i++) {
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_MINUS);
		}
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
	}
	
	
	
}

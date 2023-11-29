package login.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage extends SearchHotelPage{

		public void Login(WebDriver driver) throws InterruptedException {
			driver.get("https://adactinhotelapp.com/");
			driver.findElement(By.id("username")).sendKeys("pandiduraiMuthamil");
			driver.findElement(By.id("password")).sendKeys("MagizhanSaai0421");
			Thread.sleep(2000);
			
			//driver.findElement(By.name("login")).click();
		}
		
}

package login.com;
import screenshot.com.*;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoomBooking extends LoginPage{

	public static void main(String[] args) throws InterruptedException, AWTException,IOException {
		RoomBooking book= new RoomBooking();
		Robot rob=new Robot();
		ScreensShot sc=new ScreensShot();
		System.setProperty("Webdriver.chrome.driver","D:\\eclipse new version dont crash\\Adactin Hotel App\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		book.Login(driver);
		Thread.sleep(2000);
		sc.ScreenShot(driver, 1);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		book.SearchHotel(driver);
		sc.ScreenShot(driver, 2);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		book.Select(driver);
		sc.ScreenShot(driver, 3);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		book.pay(driver);
		sc.ScreenShot(driver, 4);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Process completed");
		driver.quit();
	}

}

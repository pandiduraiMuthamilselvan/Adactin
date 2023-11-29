package login.com;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinLogin {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("Webdriver.chrome.driver","D:\\eclipse new version dont crash\\Adactin Hotel App\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Robot r= new Robot();
		/*Actions a= new Actions(driver);*/
		driver.findElement(By.xpath("//td[@class='login_register']")).click();
		driver.findElement(By.id("username")).sendKeys("pandiduraiMuthamil");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("MagizhanSaai21");
		String passvalue = password.getAttribute("value");
		driver.findElement(By.id("re_password")).sendKeys(passvalue);
		driver.findElement(By.id("full_name")).sendKeys("Pandidurai");
		driver.findElement(By.id("email_add")).sendKeys("duraishivakarthi@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.id("Submit")).click();
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Rectangle rec= new Rectangle(screenSize);
		 BufferedImage source = r.createScreenCapture(rec);
		 File destination = new File("D:\\eclipse new version dont crash\\Adactin Hotel App\\Screenshots\\Adactin Registraction.png");
		 ImageIO.write(source, "png", destination);
		 
		
	}

}

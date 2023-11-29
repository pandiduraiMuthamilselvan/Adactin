package screenshot.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreensShot {

	//public static void main(String[] args) {
		public void ScreenShot(WebDriver driver,Integer a) throws IOException  {
			TakesScreenshot ts= (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("D:\\eclipse new version dont crash\\Adactin Hotel App\\Screenshots\\"+a+".png");
			FileHandler.copy(source, destination);
			
			
		}
	}



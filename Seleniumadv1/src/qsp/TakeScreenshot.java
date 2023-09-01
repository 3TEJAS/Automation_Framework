package qsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//step1
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		//step3
		File dst = new File("D:\\project\\tejas.jpeg");
		//step4
		FileHandler.copy(src,dst);
	}

}
	

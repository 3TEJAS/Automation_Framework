package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Partialtext2 {

public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/link.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("google")).click();
	Thread.sleep(2000);
	driver.close();
}
}

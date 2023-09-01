package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css_selector {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/link.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("google")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("tejas@123");
}
}
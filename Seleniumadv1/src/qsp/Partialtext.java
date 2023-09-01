package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partialtext {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/link.html");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("google")).click();
	Thread.sleep(2000);
	driver.close();
}
}
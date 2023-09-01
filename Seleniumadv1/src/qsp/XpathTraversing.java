package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTraversing {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='menu-link main-menu-link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='video-title']")).click();
Thread.sleep(8000);
	driver.close();
}
}
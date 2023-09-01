package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kantara songs");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@id='video-title']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-watch-metadata']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
}} 
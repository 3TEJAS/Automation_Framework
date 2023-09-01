package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class swap {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/html/swap.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a1"));
		ele.sendKeys(Keys.CONTROL+"ax");
		Thread.sleep(2000);	
	WebElement ele1=driver.findElement(By.id("a3"));
	ele1.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	WebElement ele2=driver.findElement(By.id("a2"));
	ele2.sendKeys(Keys.CONTROL+"aX");
	Thread.sleep(2000);
	ele.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	ele1.sendKeys(Keys.CONTROL+"aX");
	Thread.sleep(2000);
	ele2.sendKeys(Keys.CONTROL+"v");
	Thread.sleep(2000);
	driver.close();
	}}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frames {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/html/mainpage.html");
		Thread.sleep(2000);
		driver.findElement(By.id("un")).sendKeys("tejas");
		Thread.sleep(2000);
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(1);
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		driver.findElement(By.id("pwd")).sendKeys("qwerty");
		
	}
	
}

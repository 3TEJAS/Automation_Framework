package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_page {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[.='Downloads']"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		Robot r = new Robot();
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Support']"));
		
		ArrayList<WebElement> l = new ArrayList<WebElement>();
		l.add(ele);
		l.add(ele1);
		l.add(ele2);
		l.add(ele3);
		for(WebElement l1 : l)
		{
			act.contextClick(l1).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			Thread.sleep(2000);
		}
		Set<String> whls = driver.getWindowHandles();
		ArrayList<String> a = new ArrayList<>(whls);
		String s =a.get(2);
		driver.switchTo().window(s);
		Thread.sleep(2000);
		driver.quit();
	}
}
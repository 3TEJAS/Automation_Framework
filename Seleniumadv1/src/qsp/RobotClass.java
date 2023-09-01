package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
public static void main(String[] args) throws InterruptedException, AWTException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/?gws_rd=ssl");
	Thread.sleep(2000);
	WebElement rclick = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.contextClick(rclick).perform();
	Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
}
}
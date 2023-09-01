package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_double_click {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("  http://demo.guru99.com/test/simple_context_menu.html\r\n"+"");
		Thread.sleep(2000);
		WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
	Actions act = new Actions(driver);
	act.doubleClick(dclick).perform();
	Thread.sleep(2000);
	}
}
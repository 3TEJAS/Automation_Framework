package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specifically_close_browser {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		String P_id = driver.getWindowHandle();
	Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh) {
		driver.switchTo().window(wh);
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("page not found-qavalidation"))
			{
			driver.close();
			}
	}
}
}
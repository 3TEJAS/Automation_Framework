package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passthe_data {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/passthe%20data.html");
        List<WebElement> t = driver.findElements(By.xpath("//input"));
		int count = t.size();
		 System.out.println(count);
		 for(WebElement we:t)
		 {
			 we.sendKeys("hello");
			 Thread.sleep(1000);
		 }
		for(int i=count-1;i>=0;i--)
		{
			WebElement b = t.get(i);
			b.clear();
			Thread.sleep(1000);
		}driver.close();
}}

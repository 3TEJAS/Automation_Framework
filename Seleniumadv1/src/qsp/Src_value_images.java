package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Src_value_images {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
        List<WebElement> img = driver.findElements(By.xpath("//img"));
		int count = img.size();
		 System.out.println(count);
		 for(int i=count-1;i>=0;i--)
		 {
			 WebElement we = img.get(i);
			 String t = we.getAttribute("src");
			 System.out.println(t);
		 }
	}
}

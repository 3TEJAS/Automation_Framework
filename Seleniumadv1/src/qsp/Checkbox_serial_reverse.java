package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_serial_reverse {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/checkbox10.html");
		Thread.sleep(2000);
        List<WebElement> ele = driver.findElements(By.xpath("//input"));
		int count = ele.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			 WebElement we = ele.get(i);
			 we.click();
			 Thread.sleep(1000);
		 }
		 for(int i=count-1;i>=0;i--)
		 {
			 WebElement we = ele.get(i);
			 we.click();
			 Thread.sleep(1000);
		 }
		 }
}
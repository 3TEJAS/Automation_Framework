package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
		public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","./softwares/chromeDriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		}
}
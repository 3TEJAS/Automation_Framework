package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 {
	@Test
	public void data3() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("tejas");
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("tejas");
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
		 driver.close();
		}
		}




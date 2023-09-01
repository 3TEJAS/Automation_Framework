package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorchrome {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgftrailer");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='channel-info']")).click();
	}
	}
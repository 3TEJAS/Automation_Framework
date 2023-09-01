package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart_close_browser {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkaet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("oneplus mobiles");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[class='4rR01T']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//button[type='button']o")).click();
		Thread.sleep(2000);	
}

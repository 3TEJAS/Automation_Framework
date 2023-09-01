package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload_popup {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/OneDrive/Desktop/html/fileuplaod.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("Upload file"));
		ele.sendKeys("C:\\Users\\ADMIN\\OneDrive\\Desktop\\html\\fileuplaod.html");
	}}

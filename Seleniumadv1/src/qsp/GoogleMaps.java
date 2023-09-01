package qsp;

public class GoogleMaps
{
		import org.openqa.selenium.By;
			import org.openqa.selenium.firefox.FirefoxDriver;
			public static void main(String[] args) throws InterruptedException{
				System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='eYqqWd vF7Cdb']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("bangalore");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@class='mL3xi']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@class='tactile-searchbox-input']")).sendKeys("mysore");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@class='mL3xi']")).click();
				Thread.sleep(1000);
			}}
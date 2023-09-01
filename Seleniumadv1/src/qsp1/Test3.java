package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void data1() throws InterruptedException
	{
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://skpatro.github.io/demo/links/");
			Thread.sleep(2000);
		Reporter.log("P_id");
		 }
	}
}



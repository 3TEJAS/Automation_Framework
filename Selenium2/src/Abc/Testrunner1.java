package Abc;

public class Testrunner1 
{
	@Test
	public void test1() throws Interrupted Exception
	{
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-3vfuoac/login.do");
	}
}

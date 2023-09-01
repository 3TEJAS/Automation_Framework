package PoM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_login_pom {
	@FindBy(name="email")
	private WebElement eTbox;
	@FindBy(name="pass")
	private WebElement pwdTbox;
	@FindBy(xpath="//button[text()='Log in']")
	public fb_login_pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click login()
	{
		loginbtn.click();
		
	}

}

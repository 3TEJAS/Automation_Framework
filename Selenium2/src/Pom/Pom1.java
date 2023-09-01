package Pom;

public class Pom1 {
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginBtn;
	public Pom1(WebDriver driver)
	{
		Pagefactory.initElements(driver,this);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
}
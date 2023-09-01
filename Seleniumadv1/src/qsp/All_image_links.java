package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_image_links {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/mobile-accessories/cases-and-covers/plain-cases-covers/pr?sid=tyy%2C4mr%2Cq2u%2Cajg&offer=nb%3Amp%3A0063db0627%2Cnb%3Amp%3A00b205cd27&hpid=nLlOD4Xq1sPFeqeA8Gljnqp7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJVbmRlciDigrkxNjkiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19LCJoZXJvUGlkIjp7InNpbmdsZVZhbHVlQXR0cmlidXRlIjp7ImtleSI6Imhlcm9QaWQiLCJpbmZlcmVuY2VUeXBlIjoiUElEIiwidmFsdWUiOiJBQ0NGSlJaR1k1QUNVRUs0IiwidmFsdWVUeXBlIjoiU0lOR0xFX1ZBTFVFRCJ9fSwidGl0bGUiOnsibXVsdGlWYWx1ZWRBdHRyaWJ1dGUiOnsia2V5IjoidGl0bGUiLCJpbmZlcmVuY2VUeXBlIjoiVElUTEUiLCJ2YWx1ZXMiOlsiUGxhaW4gQ2FzZXMgJiBDb3ZlcnMiXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19&fm=neo%2Fmerchandising&iid=M_bbd85d78-9b52-492d-8056-3996a5dc0e7f_3.CFZC7QB944YD&ppt=None&ppn=None&ssid=kbqsl1i4ds0000001682445398493&otracker=hp_omu_Best%2Bof%2BElectronics_4_3.dealCard.OMU_CFZC7QB944YD_3&otracker1=hp_omu_PINNED_neo%2Fmerchandising_Best%2Bof%2BElectronics_NA_dealCard_cc_4_NA_view-all_3&cid=CFZC7QB944YD");
		Thread.sleep(2000);
        List<WebElement> links = driver.findElements(By.xpath("//img|//links"));
		int count = links.size();
		 System.out.println(count);
		 }
	}


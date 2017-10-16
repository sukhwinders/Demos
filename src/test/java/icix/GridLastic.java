package icix;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridLastic {
	
	RemoteWebDriver d;
	
	@BeforeTest
	public void GridDemo() throws MalformedURLException
	{
		DesiredCapabilities DC = new DesiredCapabilities();
		DC.setPlatform(Platform.LINUX);
		DC.setBrowserName("firefox");
		DC.setVersion("55");
		d=new RemoteWebDriver(new URL("http://To5ZNY8Cl59V70taW0BrcGokf36zU4TD:iOsWDroPmoAjeTk0KLiMhwXnqTMaOvEX@AXL6KVS4.gridlastic.com:80/wd/hub"),DC);
	}
	
	@Test
	public void openBrowser()
	{
		d.get("https://login.salesforce.com/");
	}	
}

package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	public static ChromeDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.quit();
	}
	
	public String readandGetData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/main/resources/leaftaps.properties");
		Properties propObj = new Properties();
		propObj.load(fis);
		String value = propObj.getProperty(key);
		return value;
	}

}

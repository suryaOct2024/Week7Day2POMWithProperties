package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class createLeadPage extends ProjectSpecificMethod {
	
	public createLeadPage enterFirstName() throws IOException
	{
		String fname = readandGetData("Firstname");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public createLeadPage enterLastName() throws IOException
	{
		String lname = readandGetData("Lastname");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	
	public createLeadPage enterCompanyName() throws IOException
	{
		String cname = readandGetData("Companyname");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	
	public viewLeadsPage clickSubmit()
	{
		driver.findElement(By.name("submitButton")).click();
		return new viewLeadsPage();
	}
	
//	public String readandGetData(String key) throws IOException
//	{
//		FileInputStream fis = new FileInputStream("./src/main/resources/leaftaps.properties");
//		Properties propObj = new Properties();
//		propObj.load(fis);
//		String value = propObj.getProperty(key);
//		return value;
//	}
}

package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod {
	
	public createLeadPage clickCreateLeads()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new createLeadPage();
	}

}

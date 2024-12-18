package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;


public class HomePage extends ProjectSpecificMethod{
	
	public LeadsPage clickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}
	
	public MyAccountPage clickAccountsTab()
	{
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}

}

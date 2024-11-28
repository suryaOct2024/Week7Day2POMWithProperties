package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod {
	
	public CreateAccountPage enterAcctName() throws IOException
	{
		String acctName = readandGetData("AcctName");
		driver.findElement(By.id("accountName")).sendKeys(acctName);
		return this;
	}
	
	public ViewAccountPage clickCreateAccountButton()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}

}

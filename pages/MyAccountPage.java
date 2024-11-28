package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod {
	
	public CreateAccountPage clickCreateAccountLink()
	{
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}


}


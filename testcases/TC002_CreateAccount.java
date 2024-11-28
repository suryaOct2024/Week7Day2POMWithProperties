package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC002_CreateAccount extends ProjectSpecificMethod {
	
	@Test
	public void runCreateAccount() throws IOException
	{
		LoginPage loginObj = new LoginPage();
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickAccountsTab()
		.clickCreateAccountLink()
		.enterAcctName()
		.clickCreateAccountButton()
		.verifyAccount();
	}

}

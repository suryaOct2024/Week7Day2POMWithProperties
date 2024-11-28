package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class TC002_Login extends ProjectSpecificMethod{
	
	@Test
	public void runLogin() {
		LoginPage lp  = new LoginPage();
		/*
		 * lp.enterUsername(); lp.enterPassword(); lp.clickLoginButton();
		 */
		lp.enterUsername()
		.enterPassword()
		.clickLogin();
	}

}

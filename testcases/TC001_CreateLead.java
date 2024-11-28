package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;


public class TC001_CreateLead extends ProjectSpecificMethod {
	
	@Test
	public void runCreateLead() throws IOException
	{
		LoginPage loginObj = new LoginPage();
		loginObj.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickSubmit()
		.verifyLeadId();
		
	}

}

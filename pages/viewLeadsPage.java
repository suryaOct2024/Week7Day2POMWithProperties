package pages;

import base.ProjectSpecificMethod;

public class viewLeadsPage extends ProjectSpecificMethod{
	
	public void verifyLeadId()
	{
		String title = driver.getTitle();
		System.out.println("Title of the webpage: "+title);
	}

}

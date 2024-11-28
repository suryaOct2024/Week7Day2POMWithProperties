package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod{
	
	public void verifyAccount()
	{
		String account = driver.findElement(By.xpath("(//div[@class='frameSectionBody']/table/tbody/tr/td[2]/span)[1]")).getText();
		System.out.println("Account id:"+account);
		int AcctId = Integer.parseInt(account.replaceAll("[^0-9]", ""));
		Assert.assertTrue(AcctId>0, "Verify Account Creation");
	}

}

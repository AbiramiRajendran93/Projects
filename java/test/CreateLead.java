package test;

import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;

import lib.Selenium.PreAndPost;

public class CreateLead extends PreAndPost{

	@Test
	public void createLead() {
		
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleCreateLd = locateElement("link","Create Lead");
		click(eleCreateLd);
		
		
		
		WebElement eleFirstname = locateElement("id", "createLeadForm_firstName");
		type(eleFirstname, "Abi");
		
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName, "Raj");
		
		
		
		WebElement eleCompanyName = locateElement("id", "createLeadForm_companyName");
		type(eleCompanyName, "Ducen");
		

		WebElement eleCreateLead = locateElement("class", "smallSubmit");
		click(eleCreateLead);
		
		
		}
	
}





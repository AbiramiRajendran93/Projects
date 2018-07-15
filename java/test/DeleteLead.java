package test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;


import lib.Selenium.PreAndPost;
public class DeleteLead extends PreAndPost
{
	public String phoneNumber = "9176347434";
	
	@Test
	public void deleteLead() 
	{
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleLeadsLink = locateElement("link", "Leads");
		click(eleLeadsLink);
		
		WebElement eleFindLeadsLink = locateElement("link", "Find Leads");
		click(eleFindLeadsLink);
		
		WebElement elePhoneTab = locateElement("xpath", "//span[text()='Phone']");
		click(elePhoneTab);
		
		WebElement eleEnterPhoneNum = locateElement("xpath", "//input[@name='phoneNumber']");
		type(eleEnterPhoneNum, phoneNumber);
		
		WebElement eleFindLeadsButton = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeadsButton);
		try 
		{
			Thread.sleep(500);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		WebElement eleFirstLeadIDCapture = locateElement("xpath", "(//a[@class='linktext'])[4]");
		//captureText(eleFirstLeadIDCapture, eleFirstLeadIDCapture.getText());
		String textEleFirstLeadIDCapture = getText(eleFirstLeadIDCapture);
		System.out.println(textEleFirstLeadIDCapture);
		
		String textEleFirstLeadIDCaptureForID = textEleFirstLeadIDCapture.replaceAll("\\D", "");
		System.out.println(textEleFirstLeadIDCaptureForID);
		
		WebElement eleFirstLeadIDClick = locateElement("xpath", "(//a[@class='linktext'])[4]");
		click(eleFirstLeadIDClick);
		
		WebElement eleDeleteButton = locateElement("xpath", "//a[text()='Delete']");
		click(eleDeleteButton);
		
		WebElement eleFindLeadsAfterDelete = locateElement("xpath", "//a[text()='Find Leads']");
		click(eleFindLeadsAfterDelete);
		
		WebElement eleLeadIdTextBox = locateElement("xpath", "//input[@name='id']");
		type(eleLeadIdTextBox, textEleFirstLeadIDCaptureForID);
		
		WebElement eleFindLeadsButtonAfterDelete = locateElement("xpath", "//button[text()='Find Leads']");
		click(eleFindLeadsButtonAfterDelete);
		
		WebElement afterDelPhNoRec = locateElement("xpath", "//div[@class='x-paging-info']");
		verifyExactText(afterDelPhNoRec, "No records to display");
		
		closeActiveBrowser();
	}
	
	
}
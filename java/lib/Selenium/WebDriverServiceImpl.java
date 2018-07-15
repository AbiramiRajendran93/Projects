package lib.Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {
		
	
		
				switch (locator) {
				case "id": return driver.findElement(By.id(locValue));
				
				case "class": return driver.findElement(By.className(locValue));
				
				case "link" : return driver.findElement(By.linkText(locValue));
				
				case "xpath" : return driver.findElement(By.xpath(locValue));
				
				case "tagname" : return driver.findElement(By.tagName(locValue));
				
				case "name": return driver .findElement(By.name(locValue));
				
				case "clsname": return driver.findElement(By.className(locValue));
				
				default:
					
					break;
				}
			
		return null;
	}

	public void type(WebElement ele, String data) {
		
		ele.sendKeys(data);		
		
	}

	public void click(WebElement ele) {
		try {
			ele.click();
		} catch (Exception e) {
			System.out.println("Error- Not able to click using the given elemennt");
		}		
	}

	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		
		try {
			Select DropList = new Select(ele);
			DropList.selectByVisibleText(value);
		} catch (Exception e) {
			
			System.out.println("Error-Could not select the item from droplist by using visibletext");
			e.printStackTrace();
		}
		
	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		
		try {
			Select Droplist = new Select(ele);
			Droplist.selectByValue(value);
		} catch (Exception e) {
			
			System.out.println("Error-Could not select the item from droplist by using value ");
			e.printStackTrace();
		}
		
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		
		try {
			Select droplist = new Select(ele);
			droplist.selectByIndex(index);
		} catch (Exception e) {
			
			System.out.println("Error- Could not select the item from droplist using index");
			e.printStackTrace();
		}
		
	}

	public boolean verifyExactTitle(String expectedTitle) {
		
		try {
			if (driver.getTitle().equals(expectedTitle))
			{
				System.out.println("System title verified successfully:"+expectedTitle);
			}
			
			else
			{
				System.out.println("System title verifcations fails:"+ expectedTitle);
			}
		} catch (Exception e) {
			
			System.out.println("Error on title verfication");
			e.printStackTrace();
		}
		return false;
		
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
	
		try {
			if(ele.getText().equals(expectedText)) {
				
				System.out.println("The text verifived successfully:" + expectedText);
			}
			
			else {
				System.out.println("The text not veriified successfully:"+expectedText);
			}
		} catch (Exception e) {
			
			System.out.println("Error on text verification");
			e.printStackTrace();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		
	
		
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		
	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	public void switchToFrame(int index) {
		
		Set<String> windowHandlesLIST = driver.getWindowHandles();
	List<String> windowlist = new ArrayList<String>();
		windowlist.addAll(windowHandlesLIST);
		driver.switchTo().window(windowlist.get(index));
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class MyAccountPage extends ProjectSpecificWrappers  {

	public MyAccountPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("My account - My Store")){
			reportStep("This is not Profile Page", "Fail");
		}
	}
	
	
	
	public MyAddressesPage clickMyaddresses() throws InterruptedException{
		Thread.sleep(2000);
		WebElement element = getElementByXpath("//span[contains(text(),'My addresses')]");
		scrollToElement(element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'My addresses')]");
		return new MyAddressesPage(driver, test); 
	}	
	
	public WomenTshirtsPage mouseOverandclick() throws InterruptedException{
		Thread.sleep(2000);
		getElementByXpath("//a[@title='Women']");
		mouseOverByXpath("//a[@title='Women']");
		clickByXpath("//a[@title='T-shirts'][1]");
		return new WomenTshirtsPage(driver, test); 
		
	
	}
	


}
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class MyAddressesPage extends ProjectSpecificWrappers{
	

	public MyAddressesPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Addresses - My Store")){
			reportStep("This is not Books page", "Fail");
		}
	}
	
	
	public UpdateAddressPage ClickUpdate() throws InterruptedException{
		Thread.sleep(2000);
		WebElement element = getElementByXpath("//span[contains(text(),'Update')]");
		scrollToElement(element);
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Update')]");
		return new UpdateAddressPage(driver, test); 
	}	
	
	public MyAddressesPage VerifyCity(String city) throws InterruptedException{
		verifyTextContainsByXpath("//span[contains(text(),'Toronto')]", city);
		System.out.print(city);
		return this;
	}
	
	public MyAddressesPage VerifyState(String State) throws InterruptedException{
		verifyTextContainsByXpath("//span[contains(text(),'Washington')]", State);
		System.out.print(State);
		return this;
		
	}	
	
	public LoginPage Signout() throws InterruptedException{
		Thread.sleep(2000);
		WebElement element = getElementByXpath("//a[@class='logout']");
		scrollToElement(element);
		Thread.sleep(2000);
		clickByXpath("//a[@class='logout']");
		return new LoginPage(driver, test); 
	
	}
	
}



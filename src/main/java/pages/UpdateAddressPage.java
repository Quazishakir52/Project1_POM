package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class UpdateAddressPage extends ProjectSpecificWrappers{
	

	public UpdateAddressPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("Address - My Store")){
			reportStep("This is not Books page", "Fail");
		}
	}
	public UpdateAddressPage enterCity(String city){
		enterByXpath("//input[@id='city']",city);
		return this; 
	}
	
	public UpdateAddressPage selectState(String State){
		selectVisibileTextById("id_state", State);
		return this; 
		
	}
	
	public MyAddressesPage clickSave(){
		clickById("submitAddress");
		return new MyAddressesPage(driver,test);
		
	}

}

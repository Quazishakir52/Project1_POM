package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers  {

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Login - My Store")){
			reportStep("This is not Login Page", "Fail");
		}
	}
	
	public LoginPage enterUserName(){
		enterById("email", username);
		return this;
	}
	
	public LoginPage enterPassword(){
		enterById("passwd", password);
		return this;
		
	}
	
	public MyAccountPage clickLogin(){
		clickById("SubmitLogin");		
		return new MyAccountPage(driver, test);
	}
	

	
	
	
	
	
	
	
	
	
	
	

}

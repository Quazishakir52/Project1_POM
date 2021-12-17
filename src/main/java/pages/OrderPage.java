package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class OrderPage extends ProjectSpecificWrappers {

public OrderPage(RemoteWebDriver driver, ExtentTest test){
	this.driver = driver;
	this.test = test;
	if(!verifyTitle("Order - My Store")){
		reportStep("This is not Books page", "Fail");}
	
 	
	}


public OrderPage validateProduct (String xpath1, String text1) throws InterruptedException{
	WebElement element = getElementByXpath("//td[@class='cart_description']");
	scrollToElement(element);
	verifyTextContainsByXpath("//td[@class='cart_description']", text1); 
	System.out.print(text1);
	return this;
	
	}


public OrderPage clickProceedToCheckout1() throws InterruptedException{
	clickByXpath("//span[contains(text(),'Proceed to checkout')]");
	return this;
	
	}
	
public OrderPage clickProceedToCheckout2() throws InterruptedException{
		clickByXpath("//span[contains(text(),'Proceed to checkout')]");
	return this;	
	
	
	}

public OrderPage clickTermsofService() throws InterruptedException{
	clickByXpath("//input[@id='cgv']");
	return this;	
	
	}

public OrderPage clickProceedToCheckout3() throws InterruptedException{
	clickByXpath("//span[contains(text(),'Proceed to checkout')]");
	return this;
	

	}

public OrderPage Signout1() throws InterruptedException{
	Thread.sleep(2000);
	WebElement element = getElementByXpath("//a[@class='logout']");
	scrollToElement(element);
	Thread.sleep(2000);
	clickByXpath("//a[@class='logout']");
	return this;
	
	}
	

}

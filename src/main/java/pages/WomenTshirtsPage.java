package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class WomenTshirtsPage extends ProjectSpecificWrappers {
	
	public WomenTshirtsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
		if(!verifyTitle("T-shirts - My Store")){
			reportStep("This is not Books page", "Fail");
		}

}
	
	public WomenTshirtsPage scrollToProduct() throws InterruptedException{
		Thread.sleep(2000);
		WebElement element = getElementByXpath("//div[@class='right-block']");
		scrollToElement(element);
		mouseOverByXpath("//div[@class='right-block']");
		clickByXpath("//span[contains(text(),'Add to cart')]");
		return new WomenTshirtsPage(driver, test);
		
}
	
	public WomenTshirtsPage verifyMessage(String xpath, String text) throws InterruptedException{
		Thread.sleep(2000);
		WebElement element = getElementByXpath("(//div[@id='layer_cart']//h2)[1]");
		scrollToElement(element);
		verifyTextContainsByXpath("(//div[@id='layer_cart']//h2)[1]",text);
		System.out.print(text);
		return new WomenTshirtsPage(driver, test);
	
}
	
	public OrderPage ClickProceedToCheckout() throws InterruptedException{
		Thread.sleep(2000);
		clickByXpath("//span[contains(text(),'Proceed to checkout')]");
		return new OrderPage(driver, test);
		
}	

}
package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase2 extends ProjectSpecificWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TestCase2";
		testDescription="Purchase Faded Short Sleeve T-shirts & checkout";
		browserName="chrome";
		dataSheetName="TC2";
		category="Smoke";
		authors="Shakir";
	}

	@Test(dataProvider="fetchData")
	public void Testcase2(String xpath, String xpath1,  String text, String text1) throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.mouseOverandclick()
		.scrollToProduct()
		.verifyMessage(xpath, text)
		.ClickProceedToCheckout()
		.validateProduct(xpath1, text1)
		.clickProceedToCheckout1()
		.clickProceedToCheckout2()
		.clickProceedToCheckout3()
		.Signout1();

}
	
}
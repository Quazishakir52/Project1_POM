package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.LoginPage;
import wrappers.ProjectSpecificWrappers;

public class TestCase1 extends ProjectSpecificWrappers {
	@BeforeClass
	public void setData() {
		testCaseName="TestCase1";
		testDescription="Address Change for Automationpractice";
		browserName="chrome";
		dataSheetName="TC1";
		category="Smoke";
		authors="Shakir";
	}

	@Test(dataProvider="fetchData")
	public void Testcase1(String city, String State) throws InterruptedException {
		new LoginPage(driver, test)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickMyaddresses()
		.ClickUpdate()
		.enterCity(city)
		.selectState(State)
		.clickSave()
		.VerifyCity(city)
		.VerifyState(State)
		.Signout();
		
	}

}


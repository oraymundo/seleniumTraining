package com.cedrox.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cedrox.training.selenium.pageobject.AccountPO;
import com.cedrox.training.selenium.pageobject.LoginPO;
import com.cedrox.training.selenium.pageobject.WelcomePO;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
	}
	
	@Test
	public void LoginTest() {
		String email = "testselenium@mailinator.com";
		String password = "testselenium";

		WelcomePO welcome = new WelcomePO(driver);
		LoginPO login= welcome.gotoLogin();
		AccountPO account= login.login(email, password);
		Assert.assertEquals(account.getUserName(), "Hello, Selenium");

	}
	
	@AfterClass
	public void afterClass(){
		driver.close();
	}

}

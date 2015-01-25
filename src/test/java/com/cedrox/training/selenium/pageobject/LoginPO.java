package com.cedrox.training.selenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {

	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement fieldEmail;

	@FindBy(xpath = "//input[@id='ap_password']")
	private WebElement fieldPassword;

	@FindBy(xpath = "//input[@id='signInSubmit-input']")
	private WebElement buttonLogin;

	private WebDriver driver;
	public LoginPO(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public AccountPO login(String email, String password) {
		fieldEmail.sendKeys(email);
		fieldPassword.sendKeys(password);
		buttonLogin.click();
		return new AccountPO(driver);
	}

}

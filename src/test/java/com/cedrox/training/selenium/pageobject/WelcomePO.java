package com.cedrox.training.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePO {

	@FindBy(xpath="//a[@id='nav-your-amazon']")
	private WebElement tabSignIn;
	@FindBy(xpath = "//a[@class='nav-action-button' and contains(@href,'signin') and @rel='nofollow']")
	private WebElement signInButton;

	private WebDriver driver;

	public WelcomePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPO gotoLogin() {
		tabSignIn.click();
	//	signInButton.click();
		return new LoginPO(driver);
	}

}

package com.cedrox.training.selenium.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPO {
	@FindBy(xpath="//span[@id='nav-signin-title']")
	private WebElement tittle;
	
	private WebDriver driver;
	
	public AccountPO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getUserName(){
		return tittle.getText();
	}
	
}

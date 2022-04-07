package com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	  WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_emailid;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
    private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;
	
	
	public LoginPom(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement gettxt_emailid() {
		return txt_emailid;
	}

	public WebElement gettxt_password() {
		return txt_password;
	}

	public WebElement getbtn_login() {
		return btn_login;
	}	
}

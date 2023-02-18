package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyLogin_Page extends BaseTestPage {
	
	public VerifyLogin_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@placeholder='Username']")
	private WebElement txt_userName;

	@FindBy(id = "password")
	private WebElement txt_password;

	@FindBy(id = "login-button")
	private WebElement btn_login;
	

	public void setUserName(String userName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(txt_userName));
		txt_userName.sendKeys(userName);
	}

	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void clickLogin() {
		btn_login.click();
	}

}

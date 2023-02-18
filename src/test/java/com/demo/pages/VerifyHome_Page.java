package com.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyHome_Page extends BaseTestPage {
	
	public VerifyHome_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "app_logo")
	private WebElement lbl_applicationLogo;

	@FindBy(id = "react-burger-menu-btn")
	private WebElement btn_Menu;

	@FindBy(id = "logout_sidebar_link")
	private WebElement btn_logout;

	//Below method will verify the logo after login to applicaiton 
	public void verfiyLogo() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(lbl_applicationLogo));
		if (lbl_applicationLogo.isDisplayed()) {
			System.out.print("logo displaying");
		} else {
			System.out.print("logo not displaying");
		}
	}

	//Below method will click on logout button
	
	public void clickLogout() {
		btn_Menu.click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(btn_logout));
		btn_logout.click();
	}
}

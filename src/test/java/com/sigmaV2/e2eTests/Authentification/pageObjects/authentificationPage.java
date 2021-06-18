package com.sigmaV2.e2eTests.Authentification.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class authentificationPage {
	
	/* locators */
	final static String USER_NAME_ID = "username";
	final static String USER_PASSWORD_ID = "password";
	final static String BUTTON_LOGIN_XPATH = "//*[@id=\"NOTIE\"]/div/div/div/div/form/button";
	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.XPATH, using = BUTTON_LOGIN_XPATH)
	public static WebElement btnLogin;
	
	/* Methods */
	public void fillUsername(String username1) {
		userName.sendKeys(username1);
	}

	public void fillPassword(String password2) {
		password.sendKeys(password2);
	}

	public void clickOnBtnLogin() {
		btnLogin.click();
	}

}

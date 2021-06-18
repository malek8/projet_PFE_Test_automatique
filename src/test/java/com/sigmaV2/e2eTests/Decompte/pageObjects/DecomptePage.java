package com.sigmaV2.e2eTests.Decompte.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DecomptePage {
	/* Locators */

	final static String MODULE_PRESTATION_XPATH = "//*[@id=\"sidebar\"]/ul/li[2]/a"; 
	final static String MENU_PRESTATION_XPATH = "//*[@id=\"menuFraisSante\"]/li[1]/a";
	
	@FindBy(how = How.XPATH, using = MODULE_PRESTATION_XPATH)
	public static WebElement module_prestation;
	@FindBy(how = How.XPATH, using = MENU_PRESTATION_XPATH)
	public static WebElement menu_prestation;
	@FindBy(how = How.ID, using = Grab_NClient_ID)
	public static WebElement grab_Nclient;
	
	/* Methods */
	public void clickModulePrestation() {
		module_prestation.click();
	}

	public void clickMenuPrestation() {
		menu_prestation.click();

}
	
	public void fillGrabCodePostal(String cp) {
		grab_Nclient.sendKeys(cp);
	}
	
	
}
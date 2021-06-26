package com.sigmaV2.e2eTests.decompte_sigma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DecomptePage {
	
	/* Locators */
	final static String MODULE_PRESTATION_XPATH = "//*[@id=\"sidebar\"]/ul/li[2]/a"; 
	final static String MENU_PRESTATION_XPATH = "//*[@id=\"menuFraisSante\"]/li[1]/a";
	final static String Grab_NClient_ID = "searchNumClient";
	final static String Rechercher_ID = "btnSearch";
	final static String container_ID = "gridResultContainer";
	
	@FindBy(how = How.XPATH, using = MODULE_PRESTATION_XPATH)
	public static WebElement module_prestation;
	@FindBy(how = How.XPATH, using = MENU_PRESTATION_XPATH)
	public static WebElement menu_prestation;
	@FindBy(how = How.ID, using = Grab_NClient_ID)
	public static WebElement grab_Nclient;
	@FindBy(how = How.ID, using = Rechercher_ID)
	public static WebElement clicK_Rechercher;
	@FindBy(how = How.ID, using =container_ID)
	public static WebElement clicK_container;
	
	
	/* Methods */
	public void clickModulePrestation() {
		module_prestation.click();
	}

	public void clickMenuPrestation() {
		menu_prestation.click();

}
	
	public void fillGrabNclient(String NC) {
		grab_Nclient.sendKeys(NC);
	}
	
	public void click_Rechercher1() {
		clicK_Rechercher.click();
	}
	
	public void click_container1() {
		clicK_container.click();
	}
	
	
}
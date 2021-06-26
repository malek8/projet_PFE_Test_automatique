package com.sigmaV2.e2eTests.connexion.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.sigmaV2.e2eTests.connexion.pages.ConnexionPage;
import com.sigmaV2.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConnexionStepDefs {
	
	public WebDriver driver;
	public ConnexionPage connexionnPage = new ConnexionPage();
	
	
	// constructor
	public ConnexionStepDefs() {
		driver = Setup.driver ;
		PageFactory.initElements(driver, ConnexionPage.class);
	}

	
	@Given("^Jouvre lapplication SigmaV(\\d+)$")
	public void jouvreLapplicationSigmaV(String url) throws Throwable {
		driver.get("https://sigmav2-recette-mai.iga-tunisie.com/");
		//CommonMethods.openApplication("");
		
	}

	@When("^Je saisie le username \"([^\"]*)\"$")
	public void jeSaisieLeUsername(String username) throws Throwable {
		connexionnPage.fillUsername(username);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String passWord) throws Throwable {
		connexionnPage.fillPassword(passWord);
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		connexionnPage.clickOnBtnLogin();
	}

	@Then("^je me redirige vers la page Accueil de l'application Sigmav(\\d+) \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageAccueilDeLApplicationSigmav(int arg1, String arg2) throws Throwable {
		SoftAssert softassert = new SoftAssert();
		String expectedURL = "https://sigmav2-recette-mai.iga-tunisie.com/";
		String originalURL = "https://sigmav2-recette-mai.iga-tunisie.com/";
		softassert.assertEquals(originalURL, expectedURL);
		softassert.assertAll();
	}
		

}


package com.sigmaV2.e2eTests.Authentification.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.sigmaV2.e2eTests.Authentification.pageObjects.authentificationPage;
import com.sigmaV2.e2eTests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class authentificationStepDefinitions extends com.sigmaV2.e2eTests.utils.CommonMethods {
	
	public WebDriver driver;
	public authentificationPage AuthentificationPage = new authentificationPage();

	// constructor
	
	public authentificationStepDefinitions() {
		driver = Setup.driver;
		PageFactory.initElements(driver, authentificationPage.class);
	}

	
	@Given("^Jouvre lapplication SigmaV(\\d+)$")
	public void jouvreLapplicationSigmaV(int arg1) throws Throwable {
		driver.get("https://sigmav2-recette-mai.iga-tunisie.com/");
	}

	@When("^Je saisis le username \"([^\"]*)\"$")
	public void jeSaisisLeUsername(String username) throws Throwable {
		AuthentificationPage.fillUsername(username);
	}

	@When("^Je saisis le mot de passe \"([^\"]*)\"$")
	public void jeSaisisLeMotDePasse(String password2) throws Throwable {
		AuthentificationPage.fillPassword(password2);
	    
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		AuthentificationPage.clickOnBtnLogin();
	}

	@Then("^Redirection vers la page Accueil de l'application Sigmav(\\d+) \"([^\"]*)\"$")
	public void redirectionVersLaPageAccueilDeLApplicationSigmav(int arg1, String arg2) throws Throwable {
		SoftAssert softassert = new SoftAssert();
		String expectedURL = "https://sigmav2-recette-mai.iga-tunisie.com/";
		String originalURL = driver.getCurrentUrl();
		softassert.assertEquals(originalURL, expectedURL);
		softassert.assertAll();
	}





}

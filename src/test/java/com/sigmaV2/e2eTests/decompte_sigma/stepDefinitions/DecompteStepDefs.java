package com.sigmaV2.e2eTests.decompte_sigma.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.sigmaV2.e2eTests.decompte_sigma.pages.DecomptePage;

import cucumber.api.java.en.When;

public class DecompteStepDefs {

	public WebDriver driver;
	public DecomptePage decomptepage = new DecomptePage();

	public DecompteStepDefs() {

		driver = com.sigmaV2.e2eTests.utils.Setup.driver;

		PageFactory.initElements(driver, DecomptePage.class);

	}

	@When("^Je clique sur l icône prestation$")
	public void jeCliqueSurLIcônePrestation() throws Throwable {
		decomptepage.clickModulePrestation();

	}

	@When("^Je clique sur Saisie internationale$")
	public void jeCliqueSurSaisieInternationale() throws Throwable {
		decomptepage.clickMenuPrestation();
	}

	@When("^je saisie Nclient \"([^\"]*)\"$")
	public void jeSaisieNclient(String arg1) throws Throwable {
		decomptepage.fillGrabNclient(arg1);
	}

	@When("^je clique sur le boutton Rechercher$")
	public void jeCliqueSurLeBouttonRechercher() throws Throwable {
		decomptepage.click_Rechercher1();
	}

	@When("^je clique sur container$")
	public void je_clique_sur_container() throws Throwable {
		// decomptepage.click_container1();
		Thread.sleep(3000);
		WebElement element = DecomptePage.clicK_container;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		executor.executeScript("arguments[0].click();", element);
	}

	@When("^je select \"([^\"]*)\"$")
	public void jeSelect(String arg1) throws Throwable {

	}

	@When("^je saisie Date de soins \"([^\"]*)\"$")
	public void jeSaisieDateDeSoins(String arg1) throws Throwable {

	}

	@When("^je saisie Date reception \"([^\"]*)\"$")
	public void jeSaisieDateReception(String arg1) throws Throwable {

	}

	@When("^je checke \"([^\"]*)\"$")
	public void jeChecke(String arg1) throws Throwable {

	}

	@When("^je select pro de Sante \"([^\"]*)\"$")
	public void jeSelectProDeSante(String arg1) throws Throwable {

	}

	@When("^je saisie Pays \"([^\"]*)\"$")
	public void jeSaisiePays(String arg1) throws Throwable {

	}

	@When("^je saisie TypeAdmission \"([^\"]*)\"$")
	public void jeSaisieTypeAdmission(String arg1) throws Throwable {

	}

	@When("^je saisie categorie \"([^\"]*)\"$")
	public void jeSaisieCategorie(String arg1) throws Throwable {

	}

	@When("^je saisie Diagnostique \"([^\"]*)\"$")
	public void jeSaisieDiagnostique(String arg1) throws Throwable {

	}

	@When("^je saisie TypeFamille \"([^\"]*)\"$")
	public void jeSaisieTypeFamille(String arg1) throws Throwable {

	}

	@When("^je saisie Acte \"([^\"]*)\"$")
	public void jeSaisieActe(String arg1) throws Throwable {

	}

	@When("^je saisie Frais reels \"([^\"]*)\"$")
	public void jeSaisieFraisReels(String arg1) throws Throwable {

	}

	@When("^je saisie Frais acceptes \"([^\"]*)\"$")
	public void jeSaisieFraisAcceptes(String arg1) throws Throwable {

	}

	@When("^je saisie QT \"([^\"]*)\"$")
	public void jeSaisieQT(String arg1) throws Throwable {

	}

	@When("^Je clique sur \"([^\"]*)\"$")
	public void jeCliqueSur(String arg1) throws Throwable {

	}

}

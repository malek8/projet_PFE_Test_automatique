package com.sigmaV2.e2eTests.Decompte.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sigmaV2.e2eTests.Decompte.pageObjects.DecomptePage;

import cucumber.api.java.en.When;

public class DecompteStepDefinitions {
	
	
	public WebDriver driver;
	public DecomptePage decomptepage = new DecomptePage();

	public DecompteStepDefinitions() {
		
		driver = com.sigmaV2.e2eTests.utils.Setup.driver;
		
		PageFactory.initElements(driver,DecomptePage.class);
	
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
	   
	}

	@When("^je clique sur le boutton Rechercher$")
	public void jeCliqueSurLeBouttonRechercher() throws Throwable {
	    
	}

	@When("^je clique Nclient$")
	public void jeCliqueNclient() throws Throwable {
	    
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

@Decompte
Feature: creerDecompte
  En tant que utilisateur je souhaite Creer une Souscrition

  Background: 
    Given Jouvre lapplication SigmaV2
    When Je saisis le username "RECETTE@IGAEDITIONS.COM"
    And Je saisis le mot de passe "Iga1234!"
    And Je clique sur le bouton login
    Then Redirection vers la page Accueil de l'application Sigmav2 "https://sigmav2-recette-mai.iga-tunisie.com/"
    
    Scenario Outline: Creer Decompte  - cas passant
    When Je clique sur l icône prestation
    And Je clique sur Saisie internationale
    And je saisie Nclient "<nclient>"
    And je clique sur le boutton Rechercher
    And je clique Nclient
    And je select "<Beneficiaire>"
    And je saisie Date de soins "<datesoins>"
    And je saisie Date reception "<datereception>"
    And je checke "<Beneficiaire>"
    And je select pro de Sante "<prodeSante>"
    And je saisie Pays "<pays>"
    And je saisie TypeAdmission "<TypeAdmission>"
    And je saisie categorie "<Categorie>"
    And je saisie Diagnostique "<Diagnostique>"
    And je saisie TypeFamille "<TypeFamille>"
    And je saisie Acte "<acte>"
    And je saisie Frais reels "<FraisReels>"
    And je saisie Frais acceptes "<FraisAcceptes>"
    And je saisie QT "<QTE>"
    And Je clique sur "<creer>"

    Examples: 
      |nclient|Beneficiaire |datesoins |datereception|Beneficiaire|prodeSante |pays   |TypeAdmission   |Categorie                                                  | Diagnostique             |TypeFamille               |acte             |FraisReels|FraisAcceptes|QTE|
      |353255 |Mme SS(A)    |18/06/2021|18/06/2021   |Beneficiaire|333413     |FRANCE |Hospitalisation |A00-B99 - Certaines maladies infectieuses et parasitaires  |AUXILIAIRES MEDICAUX HOSP |AUXILIAIRES MEDICAUX HOSP |Prothèse médicale|10        |10           |1  |
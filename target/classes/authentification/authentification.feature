@authentification
Feature: Authentification-SigmaV2
  En tant que utilisateur je souhaite m'authantifier

  @connexion
  Scenario: Vérifier l'authentification
    Given Jouvre lapplication SigmaV2
    When Je saisis le username "RECETTE@IGAEDITIONS.COM"
    And Je saisis le mot de passe "Iga1234!"
    And Je clique sur le bouton login
    Then Redirection vers la page Accueil de l'application Sigmav2 "https://sigmav2-recette-mai.iga-tunisie.com/"

  @connexion1
  Scenario: Vérifier l'authentification
    Given Jouvre lapplication SigmaV2
    When Je saisis le username "RECETTE@IGAEDITIONS.COM"
    And Je saisis le mot de passe "MALEK"
    And Je clique sur le bouton login
    Then Redirection vers la page Accueil de l'application Sigmav2 "https://sigmav2-recette-mai.iga-tunisie.com/"
  

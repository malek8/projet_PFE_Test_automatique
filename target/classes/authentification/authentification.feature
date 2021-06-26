@authentification
Feature: Authentification-SigmaV2
  En tant que utilisateur je souhaite m'authantifier

  @connexion
  Scenario: Vérifier l'authentification
    Given Jouvre lapplication SigmaV2
    When Je saisie le username "RECETTE@IGAEDITIONS.COM"
    And Je saisie le mot de passe "Iga1234!"
    And Je clique sur le bouton login
    Then je me redirige vers la page Accueil de l'application Sigmav2 "https://sigmav2-recette-mai.iga-tunisie.com/"

  @connexion1
  Scenario: Vérifier l'authentification
    Given Jouvre lapplication SigmaV2
    When Je saisie le username "RECETTE@IGAEDITIONS.COM"
    And Je saisie le mot de passe "TES"
    And Je clique sur le bouton login
    Then je me redirige vers la page Accueil de l'application Sigmav2 "https://sigmav2-recette-mai.iga-tunisie.com/"
  

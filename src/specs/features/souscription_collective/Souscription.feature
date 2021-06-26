@Souscription
Feature: Creer Souscription
  En tant que utilisateur je souhaite Creer une Souscrition

  Background: 
    Given Jouvre lapplication SigmaV2
    When Je saisie le username "RECETTE@IGAEDITIONS.COM"
    And Je saisie le mot de passe "Iga1234!"
    And Je clique sur le bouton login
    Then je me redirige vers la page Accueil de l'application Sigmav2 "https://sigmav2-recette-mai.iga-tunisie.com/

  @Souscription1
  Scenario Outline: Creer Souscription  - cas passant
    When Je clique sur l icône Production
    And Je clique sur souscriptin Collective
    And je clique sur le boutton Créer

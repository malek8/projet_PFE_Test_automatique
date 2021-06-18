$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification-SigmaV2",
  "description": "En tant que utilisateur je souhaite m\u0027authantifier",
  "id": "authentification-sigmav2",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentification"
    }
  ]
});
formatter.before({
  "duration": 4154972500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Vérifier l\u0027authentification",
  "description": "",
  "id": "authentification-sigmav2;vérifier-l\u0027authentification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@connexion1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Jouvre lapplication SigmaV2",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Je saisis le username \"RECETTE@IGAEDITIONS.COM\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Je saisis le mot de passe \"MALEK\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Redirection vers la page Accueil de l\u0027application Sigmav2 \"https://sigmav2-recette-mai.iga-tunisie.com/\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    }
  ],
  "location": "authentificationStepDefinitions.jouvreLapplicationSigmaV(int)"
});
formatter.result({
  "duration": 7779097100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RECETTE@IGAEDITIONS.COM",
      "offset": 23
    }
  ],
  "location": "authentificationStepDefinitions.jeSaisisLeUsername(String)"
});
formatter.result({
  "duration": 315802300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MALEK",
      "offset": 27
    }
  ],
  "location": "authentificationStepDefinitions.jeSaisisLeMotDePasse(String)"
});
formatter.result({
  "duration": 124211400,
  "status": "passed"
});
formatter.match({
  "location": "authentificationStepDefinitions.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 1357790400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 56
    },
    {
      "val": "https://sigmav2-recette-mai.iga-tunisie.com/",
      "offset": 59
    }
  ],
  "location": "authentificationStepDefinitions.redirectionVersLaPageAccueilDeLApplicationSigmav(int,String)"
});
formatter.result({
  "duration": 90243900,
  "error_message": "java.lang.AssertionError: The following asserts failed:\nnull\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:38)\r\n\tat com.sigmaV2.e2eTests.Authentification.StepDefinitions.authentificationStepDefinitions.redirectionVersLaPageAccueilDeLApplicationSigmav(authentificationStepDefinitions.java:54)\r\n\tat ✽.Then Redirection vers la page Accueil de l\u0027application Sigmav2 \"https://sigmav2-recette-mai.iga-tunisie.com/\"(authentification/authentification.feature:19)\r\n",
  "status": "failed"
});
formatter.write("Current page url is https://sigmav2-recette-mai.iga-tunisie.com/identity/login?signin\u003d423d87e5fe3f5e3c606a41bfa9304724");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 696590800,
  "status": "passed"
});
});
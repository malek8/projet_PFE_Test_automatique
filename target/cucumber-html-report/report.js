$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
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
  "duration": 3294421500,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Vérifier l\u0027authentification",
  "description": "",
  "id": "authentification-sigmav2;vérifier-l\u0027authentification",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@connexion"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Jouvre lapplication SigmaV2",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le username \"RECETTE@IGAEDITIONS.COM\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Je saisie le mot de passe \"Iga1234!\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "je me redirige vers la page Accueil de l\u0027application Sigmav2 \"https://sigmav2-recette-mai.iga-tunisie.com/\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    }
  ],
  "location": "ConnexionStepDefs.jouvreLapplicationSigmaV(String)"
});
formatter.result({
  "duration": 25473155800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "RECETTE@IGAEDITIONS.COM",
      "offset": 23
    }
  ],
  "location": "ConnexionStepDefs.jeSaisieLeUsername(String)"
});
formatter.result({
  "duration": 15591200,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d91.0.4472.114)\n  (Driver info: chromedriver\u003d91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}),platform\u003dWindows NT 10.0.19042 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 12 milliseconds\nBuild info: version: \u00272.47.1\u0027, revision: \u0027unknown\u0027, time: \u00272015-07-30 11:02:44\u0027\nSystem info: host: \u0027ASUS\u0027, ip: \u0027192.168.1.20\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002715.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:65468}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}), userDataDir\u003dC:\\Users\\asus\\AppData\\Local\\Temp\\scoped_dir1992_2125211386}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d91.0.4472.114, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 639f8cea33f6fcc78da96aa99b7b3804\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:595)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:389)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:215)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:340)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat com.sigmaV2.e2eTests.connexion.pages.ConnexionPage.fillUsername(ConnexionPage.java:25)\r\n\tat com.sigmaV2.e2eTests.connexion.stepDefinitions.ConnexionStepDefs.jeSaisieLeUsername(ConnexionStepDefs.java:36)\r\n\tat ✽.When Je saisie le username \"RECETTE@IGAEDITIONS.COM\"(authentification/Authentification.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iga1234!",
      "offset": 27
    }
  ],
  "location": "ConnexionStepDefs.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ConnexionStepDefs.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 59
    },
    {
      "val": "https://sigmav2-recette-mai.iga-tunisie.com/",
      "offset": 62
    }
  ],
  "location": "ConnexionStepDefs.jeMeRedirigeVersLaPageAccueilDeLApplicationSigmav(int,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 10354700,
  "status": "passed"
});
});
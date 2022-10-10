*** Settings ***
Documentation Fichiers de scripts pour le module RQ3 : Sites.Library Selenium2Library

*** Variables ***
${vURL}    http://10.242.4.53/share/page/

*** Test Cases ***


ConnexionETdeconnexion
Login    ${vURL}    ${vBrowser}    ${vUsername}    ${vPassword}

Logout


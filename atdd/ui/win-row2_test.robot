*** Settings ***
Library SeleniumLibrary

*** Variables ***
${URL}      http://localhost:8080/webapp/TestCase.jsp
${BROWSER}  chrome

*** Test Cases ***
player 1 ชนะที่แนวนอนแถวที่กลาง
    Open Browser XO Game
    Player 1 (X) Click Position R2_C1
    Player 2 (O) Click Position R1_C1
    Player 1 (X) Click Position R2_C2
    Player 2 (O) Click Position R1_C2
    Player 1 (X) Click Position R2_C3
    Add Score and Display
    Close Browser XO Game

*** Keywords ***
Open Browser XO Game
    Open Browser    ${URL}    ${BROWSER}

Player 1 (X) Click Position R2_C1
    Click Element    id=R2_C1
    Wait Until Element Contains    id=R2_C1    X

Player 2 (O) Click Position R1_C1
    Click Element    id=R1_C1
    Wait Until Element Contains    id=R1_C1    O

Player 1 (X) Click Position R2_C2
    Click Element    id=R2_C2
    Wait Until Element Contains    id=R2_C2    X

Player 2 (O) Click Position R1_C2
    Click Element    id=R1_C2
    Wait Until Element Contains    id=R1_C2    O

Player 1 (X) Click Position R2_C3
    Click Element    id=R2_C3
    Wait Until Element Contains    id=R2_C3    X

Add Score and Display
    Wait Until Element Contains    id=player1Score    1

Close Browser XO Game
    Close Browser
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
        <style>
            body {
                background-color: #303030;
            }
            
            #tictactoe {
                color: #fff;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
            }
            
            .box {
                width: 100px;
                height: 100px;
            }
            .box1:nth-child(1) {
                border-right: 1px solid #fff;
                border-bottom: 1px solid #fff;
            }
            .box1:nth-child(2) {
                border-left: 1px solid #fff;
                border-right: 1px solid #fff;
                border-bottom: 1px solid #fff;
            }
            .box1:nth-child(3) {
                border-left: 1px solid #fff;
                border-bottom: 1px solid #fff;
            }
            .box2:nth-child(1) {
                border-top: 1px solid #fff;
                border-right: 1px solid #fff;
                border-bottom: 1px solid #fff;
            }
            .box2:nth-child(2) {
                border: 1px solid #fff;
            }
            .box2:nth-child(3) {
                border-top: 1px solid #fff;
                border-left: 1px solid #fff;
                border-bottom: 1px solid #fff;
            }
            .box3:nth-child(1) {
                border-right: 1px solid #fff;
                border-top: 1px solid #fff;
            }
            .box3:nth-child(2) {
                border-left: 1px solid #fff;
                border-right: 1px solid #fff;
                border-top: 1px solid #fff;
            }
            .box3:nth-child(3) {
                border-left: 1px solid #fff;
                border-top: 1px solid #fff;
            }
        </style>
    </head>

    <body>
        <section id="tictactoe">
            <div class="container-fluid">
                <div class="row justify-content-center">
                    <div class="header text-center">
                        <h1>Tic Tac Toe Game</h1>
                    </div>
                </div>
                <br>
                <div class="row justify-content-center">
                    <div id="R1_C1" class="box box1"></div>
                    <div id="R1_C2" class="box box1"></div>
                    <div id="R1_C3" class="box box1"></div>
                </div>
                <div class="row justify-content-center">
                    <div id="R2_C1" class="box box2"></div>
                    <div id="R2_C2" class="box box2"></div>
                    <div id="R2_C3" class="box box2"></div>
                </div>
                <div class="row justify-content-center">
                    <div id="R3_C1" class="box box3"></div>
                    <div id="R3_C2" class="box box3"></div>
                    <div id="R3_C3" class="box box3"></div>
                </div>
                <br>
                <div class="row justify-content-center">
                    <div class="col-4 text-center">
                        <p>Player 1</p>
                        <p id="player1Score">0</p>
                    </div>
                    <div class="col-4 text-center">
                        <p>Tie</p>
                        <p id="tieScore">0</p>
                    </div>
                    <div class="col-4 text-center">
                        <p>Player 2</p>
                        <p id="player2Score">0</p>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>

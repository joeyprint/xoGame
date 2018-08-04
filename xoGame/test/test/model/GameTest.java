/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import api.model.Game;
import api.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bom
 */
public class GameTest {
    @Test
    public void GameTest() {
        Game game = new Game();
        Player player1 = game.getPlayer1();
        Player player2 = game.getPlayer2();
        assertEquals(0, player1.getWinScore());
        assertEquals(0, player2.getWinScore());
        
        
    }
    
   
    
    
}

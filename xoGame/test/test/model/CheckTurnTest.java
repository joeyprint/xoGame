/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import api.model.CheckTurn;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author MayPT
 */
public class CheckTurnTest {
    
    @Test
    public void checkTurnMoreOrEqualFour(){
        int turn = 4;
        boolean expected = true;
        CheckTurn ct = new CheckTurn();
        
        boolean actual = ct.getTrue(turn);
//        
        assertEquals(expected,actual);
    }

    
}

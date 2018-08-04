/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.model;

import api.model.Board;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PeGuS
 */
public class BoardTest {
    
    public BoardTest() {
    }
    
    @Test
    public void testSomeMethod() {
        int index = 7;
        String value = "0";
        int turn = 0;
        String position[] = new String[9];
        position[7] = "0";

        Board b = new Board();
        b.setPosition(index , value , turn);
        
        assertArrayEquals(position, b.getPosition());
        
    }
    
}

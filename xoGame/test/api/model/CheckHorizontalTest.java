/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bow
 */
public class CheckHorizontalTest {
    
    @Test
    public void testSomeMethod() {
        String[] topBox = {"0","0","0"};
        boolean expectResult = true;
        CheckHorizontal check = new CheckHorizontal();
        boolean result = check.isCheckHorizontal(2,"0");
        assertEquals(result,expectResult);
    }
    
}

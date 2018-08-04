/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.model;

/**
 *
 * @author MayPT
 */
public class CheckTurnMoreOrEqualFour {

    public CheckTurnMoreOrEqualFour() {
    }

       
    public boolean isCheckTurnMoreOrEqualFour(int turn) {
        if(turn>=4){
            return true;
        }else{
            return false;
        }
    }
    public boolean getTrue(int turn) {
        return true;
    }
    
}

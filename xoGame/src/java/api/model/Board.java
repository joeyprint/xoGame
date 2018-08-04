/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.model;

/**
 *
 * @author PeGuS
 */
public class Board {
    int turn = 0;
    String []position = new String[9];

    public Board() {
    }
    
    public void setPosition(int index , String value , int turn) {
        position[index] = value;
    }
    
    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public String[] getPosition() {
        return position;
    }

    
    
    
}

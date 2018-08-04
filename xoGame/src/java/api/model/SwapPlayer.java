/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.model;

/**
 *
 * @author wasin
 */
public class SwapPlayer {
   public static int swapPlayer(int turn) {
       int player = 0;
       switch(turn%2) {
           case 0 : player = 0;
           case 1 : player = 1;
       }
       return player;
   }
}

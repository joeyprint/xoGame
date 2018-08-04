/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.model;

/**
 *
 * @author bow
 */
public class CheckHorizontal {
    
    public boolean isCheckHorizontal(int index, String player){
        String[] box = new String[9];
        
        if(index<3){
            for(int i =0 ; i<3;i++){
                if(box[i] == null){
                    return false; 
                }
            }
            return true;
        }
        else if(index>2 && index<6){
            for(int i =3 ; i<6;i++){
                if(box[i] == null){
                    return false;
                }
            }
            return true;
        }else {
            for(int i =6 ; i<9;i++){
                if(box[i] == null){
                    return false;
                }
            }
            return true;
        }
    }
    
}

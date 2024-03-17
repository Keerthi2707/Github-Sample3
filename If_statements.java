/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

/**
 *
 * @author pkeer
 */
public class If_statements {
    public static void main(String[] args) {
        int loop = 0;
                while(loop<=5)
                {
        System.out.println("Looping" + loop);
        if(loop == 5){
        break;
        }
                    loop++;
                    System.out.println("Running");
    }
        
    }
    
}

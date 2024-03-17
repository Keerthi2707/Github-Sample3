/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.util.Arrays;

/**
 *
 * @author pkeer
 */
public class multidimensional_array {
    
      public static void main(String[] args) {
     int[][] myNumbers = { 
         {1, 2, 3, 4}, 
         {5, 6, 7},
         {8, 9, 10}
     };
   
   
     for (int row = 0; row < myNumbers.length; row++) {
        for(int col = 0; col < myNumbers[row].length; col++) {
           System.out.print(myNumbers[row][col] + "\t");
        }
         System.out.println();

     }
   }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.util.Scanner;

/**
 *
 * @author pkeer
 */
public class DowhileLoop {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

 int i = 0;
 do {
     
 System.out.println("Enter the value of i: " );
    i = scanner.nextInt();
   
  }
 while (i !=1);
        System.out.println("Got 1!");
}
    
}

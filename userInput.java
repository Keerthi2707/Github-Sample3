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
public class userInput {
    public static void main(String[] args) {
        //Create Sanner Object
        Scanner input = new Scanner (System.in);
        //Output the prompt
        System.out.println("Enter a floating point value: ");
        //Wait for the user to enter something
        //String line = input.nextLine();
        float value = input.nextFloat();
        //Tell them what they enterde
        System.out.println("Entered value: "+value);
        
    }
    
}

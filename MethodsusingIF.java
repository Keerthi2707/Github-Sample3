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
public class MethodsusingIF {
    static void checkAge(int age){
        
      if (age < 18){
          System.out.println("Access denied - you are not old enough!");
          
      } else{
                  System.out.println("Access granted - You are old enough!");
                  
                  }
      
      }
      
      public static void main(String[] args){
      
          checkAge(30);
      }
    
    
    }

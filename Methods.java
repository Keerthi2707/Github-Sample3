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
public class Methods {
            static void myMethod(String fname, int age){
                System.out.println(fname + " is " + age);
            }

    public static void main(String[] args) {
        myMethod("Keerthi", 23);
        myMethod("Saraswathi", 45);
        myMethod("Sathis Kumar", 28);
    }
}

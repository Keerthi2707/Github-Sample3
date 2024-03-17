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
public class JavamethodOverloading {
    
    static int plusMethodint(int X, int Y){
    return X+Y;
    }
    
    static double plusMethoddouble(double X,double Y ){
    return X+Y;
    }
    
    public static void main(String[] args){
    
        int myNum1 = plusMethodint (5,6);
        double myNum2 = plusMethoddouble(5.5, 4.63);
        System.out.println("Int:" + myNum1 );
        System.out.println("Double:" + myNum2 );

        
    }
    
    
    
}

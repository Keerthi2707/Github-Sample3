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
public class Addallofthenumbersupto10 {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k){
    if(k>0){
    return k + sum(k-1);}
    
    else{
            return 0;
            }
    }
    
        
        }

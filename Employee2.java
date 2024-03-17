/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.util.ArrayList;

/**
 *
 * @author pkeer
 */

public class Employee2 {
     String name;
         int id;
        public Employee2(String name, int id) {
            this.name = name;
            this.id = id;}
    
    public static void main(String[] args) {
        String n = new String("Keerthi");
        System.out.println(n);
        int i = 5;
        System.out.println(i);
        ArrayList al = new ArrayList();
        al.add("Keerthi P");
        al.add("Perumal");
        System.out.println(al);
        Employee2 e2 = new Employee2("Keerthi", 234);
        System.out.println(e2);
        
    }
    
    

}

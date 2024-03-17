/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author pkeer
 */
class machine{
    public String toString(){
        return "I am a machine";
}
    public void start(){
        System.out.println("Machine Started");}
    
}
class Camera extends machine{
     public String toString(){
        return "I am a Camera";
}
     public void snap(){
         System.out.println("Snap!");
     };

}


public class Main {
    public static void main(String[] args) {
       ArrayList<machine> List1 = new ArrayList<machine>();
       List1.add(new machine());
       List1.add(new machine());
       showList(List1);
       ArrayList<Camera> List2 = new ArrayList<Camera>();
       List2.add(new Camera());
       List2.add(new Camera());
          showList(List2);
    }
    public static void showList(ArrayList<? extends machine> List){
    for(machine value: List){
        System.out.println(value);
        value.start();
    }}
    public static void showList2(ArrayList<? super Camera> List){
    for(Object value: List){
        System.out.println(value);
    }}
}
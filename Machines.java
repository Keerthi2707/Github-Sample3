/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import BusReservation.BusDemo;

/**
 *
 * @author pkeer
 */
class Machine2{
public void start(){
    System.out.println("Machine Started");
}
}

class camera extends Machine2{
    public void start(){
        System.out.println("camera started");}
    public void snap(){
            System.out.println("photo taken");}
}



public class Machines{
    public static void main(String[] args) {
        Machine1 mach1 = new Machine1();
        mach1.start();
        mach1.stop();
        
        car c = new car();
        c.start();
        c.wipewindshield();
        c.stop();
        
        BusDemo b = new BusDemo();
        
        Machine2 mach2 = new Machine2();
        camera cam = new camera();
        mach2.start();
        cam.snap();
        cam.start();
        
        //Upcasting
        Machine2 mach3 = cam;
        mach3.start();
        
        //Downcasting 
        Machine2 mach4 = new camera();
        camera cam1 = (camera)mach4;
        
        
    }

}
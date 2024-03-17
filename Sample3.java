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
class Frog{
 private String Name;
 private int age;

public void setName(String Name){
this.Name = Name;
}

public void setAge(int Age){
this.age = Age;}

public String getName(){
return Name;
}
public int getAge(){
return age;
}

}
public class Sample3 {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        //frog1.Name = "Bertie";
        //frog1.age = 1;
        frog1.setName("Bertie");
        frog1.setAge(2);
        System.out.println("Frog1's Name: " +frog1.getName());
        System.out.println("Frog1's Age: " + frog1.getAge());
    }
}

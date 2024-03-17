/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author pkeer
 */
/*public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        
       try{
           System.out.println(a/b);
       }
       catch(ArithmeticException E){
           System.out.println("Here B is 0");}
       
      finally{
           System.out.println("Final Block");}
       
        System.out.println("Hello");
    }
}
*/
/*class userdefined extends Exception{
    userdefined(String str){
        super(str);
     }
}
public class ExceptionHandling {
    static void check(int age)throws userdefined{
    if(age <18){
    throw new userdefined("Age is Invalid");
    }
        
        }
    public static void main(String[] args) {
        try{
        check(17);
        }
        catch(userdefined E){
            System.out.println(E.getMessage());
            
        }
        System.out.println("Hello");
    }


}*/
/*public class ExceptionHandling {
    public static void main(String[] args){
        String[] texts = {"one", "two", "three"};
        
        try{
            System.out.println(texts[3]);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
       
    }
}  */
/*public class ExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("Example.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
        System.out.println(line);}
        br.close();
        
    }
}
*/

public class ExceptionHandling {
    public static void main(String[] args) {
        File file = new File("Example.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
        String line;
        while((line = br.readLine()) != null){
        System.out.println(line);}
        }
        catch(FileNotFoundException e){
            System.out.println(file.toString());
        }
        catch(IOException e){
            System.out.println(file.toString());}
    }
}
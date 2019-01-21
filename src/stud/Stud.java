/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stud;

/**
 *
 * @author Mamou
 */
public class Stud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creating Object
        Student s1 = new Student(3,"mamoun");
        Student s2 = new Student(4,"Diab");
        
        
        System.out.println("Name of S2 is " +s2.getStudentName());
        s2.setStudentName("Mamoun");
        System.out.println("The name of s2 after some wierd reason " +s2.getStudentName());
        
   
    
    }//end of main
    
}//endd class

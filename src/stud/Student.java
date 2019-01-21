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
public class Student {
    
    private int studID;
    private String studName;
    
    
    public Student(int give, String giveStud){
        this.studID= give;
        this.studName = giveStud;
             
    }
    
    public int getStudentID(){
         
        return studID;
    }
    
    public void setStudID(int give){
        
        studID = give;
    }
    
    
    public String getStudentName(){
        
        
        return studName;
    }

    
    public void setStudentName(String giveStud){
        
        studName = giveStud;
    }
    
    
}//end class

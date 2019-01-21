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
    private String program;
    
    
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

    /**
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(String program) {
        this.program = program;
    }
    
    
}//end class

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapterfour;

/**
 *
 * @author Carmen_Lucia3
 */
public class Professor {
    String name;
    Department department;
    
    public Professor(String name, String department){
        this.name = name;
        this.department = new Department(department);
    }
      
    public String getName(){
        return name;
    }
    
    public String getDepartment(){
        return department.getName();
    }
    
}

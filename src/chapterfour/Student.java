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
public class Student {
    String name;
    double gpa;
    Professor advisor;
    
    public Student(String name){
        this.name = name;
        advisor = new Professor("Jorge Camargo","Computer Science");
    }

    public Student (String name, Professor advisor){
        this.name = name;
        advisor = new Professor("Jorge Camargo","Computer Science");
    }
    
    public Student (String name, double gpa){
        this.name = name;
        this.gpa = gpa;
        advisor = new Professor("Jorge Camargo","Computer Science");
    }
    
    public Student (String name, double gpa, Professor advisor){
        advisor = new Professor("Jorge Camargo","Computer Science");
        this.name = name;
        this.gpa = gpa;
    }
    
    public String getName(){
        return name;
    }
    
    public double getGpa(){
        return gpa;
    }
    
    public String getProfessorName(){
        return advisor.getName();
    }
    public String getAdvisorsDepartment() {
        return advisor.getDepartment();
    }

    public static void main(String[] args) {
        Student carmen = new Student("Carmen Barrios", 4.1);
        
        System.out.println("Student name: " + carmen.getName() + ", Gpa: " 
                + carmen.getGpa() + ", Advisor name: " + carmen.getProfessorName()
                + ", Advisor department: " + carmen.getAdvisorsDepartment());
        
    }
    
}

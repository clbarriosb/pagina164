/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapterfour;

import java.util.*;

/**
 *
 * @author Carmen_Lucia3
 */
public class Ejemplo {
    
  public static void main(String[] args) {
     
        // VECTORES ESTATICOS, COMO INICIALIZAR RESPECTO A UNA CLASE E IMPRIMIR
       Student   [] x  = new Student [20];
       
      /* for(int i = 0; i < 20; i++){
           
           x[i] = new Student();
       }*/
       
       Student[] y = new Student[3];
       
       y [0]  = new Student ("MAAF");
       y [1]  = new Student ("JOHO",1);
       y [2]  = new Student ("JUANCA",2);
    
       for( int i=0; i < y.length; i++){
           
           System.out.println(y[i].getName());
           y[i].printStudent();
       }
       
       // CREAR ArrayList y agrgarle valores de una clase ademas forma de impresion
       ArrayList<Student> example = new ArrayList<Student> ();
       
       Student a = new Student ("Hi");
       Student b = new Student ("MOCHI MOCHI");
       
       example.add(a);
       example.add(b);
       example.add(new Student ("GUTEN ABEND"));
       
       for( Student student : example) System.out.println(student.getName());
       
       
       // USO DE ATRIBUTO .addAll() ************************************
       ArrayList<Student> one = new ArrayList<Student>();
       ArrayList<Student> two = new ArrayList<Student>();
       
      
       
       Student one_a = new Student ("one_a");
       Student one_b = new Student ("one_b");
       one.add(one_a);
       one.add(one_b);
       
       Student two_a = new Student ("two_a");
       Student two_b = new Student ("two_b");
       two.add(two_a);
       two.add(two_b);
       
       two.addAll(one);
       
       for(Student student_two : two)System.out.println(student_two.getName());
      
       
       // METODO DE IMPRESION PARA UN LUGAR ESPECIFICO DEL ARRAYLIST
       
       
       for(Student student_two : two)
           if(student_two.getName().equals("two_a")){
               System.out.println("Se ha encontrado a two_a");
               //break;//MIRA QUE PASA SI QUITAS BREAK
           }else{
               System.out.println("NO se ha encontrado a two_a");
           };
           
    }
    
    // estamos viendo como se crean arreglos estaticos en java pero respecto a una clase (objeto) y compo se imprimen
    // tambien se uso array list(mirar la manera de importar array list)
    // tambien es bueno mirar el metodo .addAll para unir array list, notese que pese a que one se define primero al
    // ser agregado al final el orden son los two originales y luego los one
    
}
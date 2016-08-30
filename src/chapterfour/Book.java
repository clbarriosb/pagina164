/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author Carmen_Lucia3
 */
public class Book{
    

    Author author;
    String title;
    int noOfPages;
    boolean fiction;
    
    public Book(String title, boolean fiction, int noOfPages){
        this.title = title;
        author = new Author ("Anne Eliot");
        this.fiction= fiction;
        this.noOfPages= noOfPages;      
    }
    
    public int getNoOfPages(){
        return noOfPages;
    }
   
    public boolean getFiction(){
        return fiction;
    }
    
    public String getAuthor(){
        return author.getName();
    }
    
    public String getTitle(){
        return title;
    }
    
    public static void main(String[] args) {
        Book almost = new Book("Almost", false, 130);
        
        
        System.out.println("The book " + almost.getTitle() + " written by: " + 
                almost.getAuthor() + "has " + almost.getNoOfPages() + " pages and "
                + "is " + almost.getFiction() + " that is fiction" );
    }
    
}

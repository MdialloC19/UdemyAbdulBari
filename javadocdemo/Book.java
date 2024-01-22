/**@author Moussa Diallo
 * @version 2.0
 * @since 2015
 * 
 */

package javadocdemo;

/**
 * Class for library Book!!!
 */

public class Book {


    /**
     * @value 10 default value
     */
    static int val=10;

    /**
     * Paramatrized Constructor
     * @param s Book Name
     */
    public Book(String s){

    }
    /**
     * Issue a Book to a Student
     * @param roll roll number of a student
     * @throws Exception if book is not available, throws Exception 
     */
    
    public void issue(int roll) throws Exception{

    }
    /**
     * Check if a book is available
     * @param str Book Name
     * @return if Book is available return true else false
     */

    
    public boolean available(String str){
        return true;
    }
    /**
     * Get Book Name
     * @param id book Id 
     * @return return Book Name
     */
    public String getName(int id ){
        return "";
    }

    
}

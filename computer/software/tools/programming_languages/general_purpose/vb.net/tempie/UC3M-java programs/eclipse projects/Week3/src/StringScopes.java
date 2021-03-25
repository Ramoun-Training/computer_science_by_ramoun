/**
 * Do not change the method or class
 * declarations.
 */


public class StringScopes{
    
    /* 
     * Look at what is happening with the strings
     */
    static void assignAuthor(String sentence, String author){

	    sentence = sentence + " Author: " +author;

	    System.out.println("The sentence is: "+ sentence);
    }

    
    public static void main(String[] args){
    	int x = 2;
    	
    	if (x > 3) {//willy bang does the same thing as the loopa bang
    		int y = 4;
    	}
    	int y = 3;
	
	    String sentence = "Veni, vidi, vici";
	    String author = "Julius Caesar";
	
	    System.out.println("The sentence is: "+ sentence);
	    System.out.println("The author is: "+ author);
	    assignAuthor(sentence, author);
	    System.out.println("The sentence is: "+ sentence);

    }

}
package exceptionHandlers;

public class exceptionHandlers3 extends Exception  {

 
 
    public exceptionHandlers3 (String s) 
    { 
        super(s); 
    } 
	

	
	
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            throw new exceptionHandlers1 ("temp"); 
	        } 
	        catch (exceptionHandlers1  ex) 
	        { 
	            System.out.println("Caught"); 
	            System.out.println(ex.getMessage()); 
	        } 
	    } 
	}



package diamond;





	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("First Default"); 
	    } 
	} 
	interface Second 
	{  
	    default void show() 
	    { 
	        System.out.println("Second Default"); 
	    } 
	}  
	public class diamond1  implements First, Second 
	{  
	    public void show() 
	    {  
	        First.super.show(); 
	        Second.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	diamond1 ob = new diamond1(); 
	        ob.show(); 
	    } 
	}





package exceptionHandlers;

public class exceptionHandlers5 {

	
	        void Division() throws ArithmeticException
	        {
	            int a=45,b=0,rs;
	rs = a / b;
	            System.out.print("\n\tThe result is : " + rs);
	        }
	         public static void main(String[] args)
	        {
	        	 exceptionHandlers5 a = new exceptionHandlers5();
	             try
	            {
	                a.Division();
	            }
	            catch(ArithmeticException Ex)
	            {
	                System.out.print("\n\tError : " + Ex.getMessage());
	            }
	            System.out.print("\n\tEnd of the program.");
	        }
	    }


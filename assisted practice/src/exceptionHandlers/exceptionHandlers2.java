package exceptionHandlers;

public class exceptionHandlers2 {


  
        public static void main(String[] args)
        {
            int a=23,b=0,rs=0;
            try
            {
                rs = a / b;
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }
            finally
            {
                System.out.print("\n\tThe result is : " + rs);
            }
        }
    }




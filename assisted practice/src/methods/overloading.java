package methods;

public class overloading {
	
		
		public void area(int b,int h)
		    {
		         System.out.println("Area of Triangle is  "+(0.5*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of Circle is  "+(3.14*r*r));
		    }

		    public static void main(String args[])
		   {

		    	overloading ob=new overloading();
		       ob.area(3,6);
		       ob.area(6);  
		   }
		}


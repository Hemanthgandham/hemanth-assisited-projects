package Opps_class_obj;

public class poly {


		    public int poly(int p, int q) 
	    { 
	        return (p + q); 
	    } 
	    public int sum(int p, int q, int r) 
	    { 
	        return (p + q + r); 
	    } 
	    public double sum(double p, double q) 
	    { 
	        return (p + q); 
	    } 
	    public static void main(String args[]) 
	    { 
	    	poly s = new poly (); 
	        System.out.println(s.poly(1, 2)); 
	        System.out.println(s.sum(4, 5, 6)); 
	        System.out.println(s.sum(7, 8)); 
	    } 
	}



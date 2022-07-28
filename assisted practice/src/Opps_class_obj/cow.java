package Opps_class_obj;

public class cow {

	
	 
	    String name; 
	    String breed; 
	    int age; 
	    String color; 
	    public cow(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("My name is "+ this.getName()+ ".\nMy breed is " + this.getBreed()+".\nMy age is " + this.getAge()+ " .\nand my clour is "+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        cow scott = new cow("lakshmi","ongole", 5, "white"); 
	        System.out.println(scott.toString()); 
	    } 
	}



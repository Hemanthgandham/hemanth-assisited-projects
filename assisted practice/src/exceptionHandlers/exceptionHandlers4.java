package exceptionHandlers;

public class exceptionHandlers4 extends Exception{


		
			   String str1;
			   exceptionHandlers4(String str2) {
				str1=str2;
			   }
			   public String toString(){ 
				return ("Exception Occurred: "+str1) ;
			   }
			}
			class Example1{
			   public static void main(String args[]){
				try{
					System.out.println("initiating the  try block");
					// I'm throwing the custom exception using throw
					throw new exceptionHandlers4("This is an error Message");
				}
				catch(exceptionHandlers4 exp){
					System.out.println("Catch Block") ;
					System.out.println(exp) ;
				}
			   }
			


	}


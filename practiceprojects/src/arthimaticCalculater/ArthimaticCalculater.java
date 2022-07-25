package arthimaticCalculater;

import java.util.Scanner;

public class ArthimaticCalculater {
	
	public static void main(String[] args) {
		char operator;
		Double p,q;
		Double result=0.0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select operator(+,-,*,/,%):");
		operator=sc.next().charAt(0);
		
		System.out.println("Enter First Number:");
		p=sc.nextDouble();
		System.out.println("Enter Second Number:");
		q=sc.nextDouble();
		
		
		if(operator == '+') {
			
			result=p+q;
		}else if(operator=='-') {
			result=p-q;
		}else if(operator=='*') {
			result=p*q;
		}else if(operator=='/') {
			result=p/q;
		}else if(operator=='%') {
			result=p%q;
		}else {
			System.out.println("The operator you entered did not exist!");
		}
		System.out.println("Ans :"+result);
		
	}
	
}

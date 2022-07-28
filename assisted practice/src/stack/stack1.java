package stack;

public class stack1 {


	  	static final int MAX = 1000; 
	    	int top; 
	    	int n[] = new int[MAX];  
	  	boolean isEmpty() 
	    	{ 
	        		return (top < 0); 
	    	} 
	  	stack1() 
	    	{ 
	        		top = -1; 
	    	} 
	  	boolean push(int x) 
	    	{ 
	        		if (top >= (MAX-1)) 
	        		{ 
	            			System.out.println("Stack Overflow"); 
	            			return false; 
	        		} 
	        		else
	        		{ 
	            			n[++top] = x; 
	            			System.out.println(x + " pushed into stack"); 
	            			return true; 
	        		} 
	    	} 
	int pop() 
	    	{ 
	        		if (top < 0) 
	        		{ 
	            			System.out.println("Stack Underflow"); 
	            			return 0; 
	        		} 
	        		else
	        		{ 
	            			int x = n[top--]; 
	            			return x; 
	        		} 
	    	} 
	    
	    	public static void main(String args[])
	{
	    		stack1 stk = new stack1(); 
	        		stk.push(2); 
	        		stk.push(4); 
	        		stk.push(8); 
	        		System.out.println(stk.pop() + " Popped from stack"); 
	    	}
	} 	



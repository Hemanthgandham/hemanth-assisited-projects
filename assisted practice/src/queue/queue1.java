package queue;

import java.util.*;



public class queue1 {

	
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList();
	locationsQueue.add("palakollu");
	        		locationsQueue.add("naraspur");
	        		locationsQueue.add("palakollu");
	        		locationsQueue.add("tanuku");
	        		locationsQueue.add("eluru");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
	}

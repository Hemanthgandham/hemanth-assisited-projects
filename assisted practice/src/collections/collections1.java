package collections;
import java.util.*;
public class collections1 {
	

	
		public static void main(String[] args) {
			
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();     //array list
		      city.add("Palacole");//
		      city.add("amalapuram");    	   
		      System.out.println(city);  
			
			
		      System.out.println("\n");
		      System.out.println("Vector");                      //vector creation
		      Vector<Integer> vec = new Vector();
		      vec.addElement(20); 
		      vec.addElement(40); 
		      System.out.println(vec);
			
			
		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();   //linked list
		      names.add("bharath");  
		      names.add("hemanth");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		       System.out.println(itr.next());  
		       
		       
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();    //hash set
		       set.add(87);  
		       set.add(86);  
		       set.add(85);
		       set.add(84);
		       System.out.println(set);
		       
		      
		       System.out.println("\n");                     // Linked hash set
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(22);  
		       set2.add(23);  
		       set2.add(24);
		       set2.add(25);	       
		       System.out.println(set2);
		      	} 
		      }  
		}




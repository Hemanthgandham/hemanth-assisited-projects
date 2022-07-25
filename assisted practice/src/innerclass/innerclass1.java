package innerclass;

public class innerclass1 {


		 private String msg="Java program"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Innerclasses");}  
		 }  


		public static void main(String[] args) {

			innerclass1 obj=new innerclass1();
			innerclass1.Inner in=obj.new Inner();  
			in.hello();  
		}
	}





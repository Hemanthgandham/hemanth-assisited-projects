package innerclass;

abstract class aninnerclass {
	   public abstract void display();
	}


	public class innerclass3 {

	public static void main(String[] args) {
	aninnerclass i = new aninnerclass() {

	         public void display() {
	            System.out.println("Anonymous Inner Class");
	         }
	      };
	      i.display();
	   }
	}
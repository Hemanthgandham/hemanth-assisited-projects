package methods;

public class callbyvalue {


		int val=75;

		int operation(int val) {
			val =val*100/1000;
			return(val);
		}

		public static void main(String args[]) {
			callbyvalue d = new callbyvalue();
			System.out.println("Before operation value of The data is "+d.val);
			d.operation(1000);
			System.out.println("After operation value of The data is "+d.val);
			}
		}




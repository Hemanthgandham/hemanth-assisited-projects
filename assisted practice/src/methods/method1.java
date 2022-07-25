package methods;

public class method1 {
	

		public int Multiply(int a,int b) {
			int z=a*b;
			return z;
		}

		public static void main(String[] args) {

			method1 b=new method1();
			int ans= b.Multiply(9,999);
			System.out.println("Multipilcation is :"+ans);
			}



}

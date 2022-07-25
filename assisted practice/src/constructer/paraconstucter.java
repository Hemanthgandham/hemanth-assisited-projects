package constructer;


	class std{
		int id;
		String name ;
		
		std(int a,String b){
			 id =a;
			 name = b;
		}
			void display() {
				System.out.println(id+" "+name);
				
			}
			
		}
		
	
	public class paraconstucter {
		public static void main(String args[]) {
			std id1=new std(10,"bharath");
			std name1=new std(15,"hemanth");
			id1.display();
			name1.display();
			
		}

}
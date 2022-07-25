package constructer;





class Studentinfo{
		int id;
		String name;
		
		void display() {
		
		System.out.println(id+" "+name);
	}
		
		public class defaultconstructer1 {
	    public static void main(String args[]) {
	    	Studentinfo std=new Studentinfo();
	    	Studentinfo std2=new Studentinfo();
	    	std.display();
	    	std2.display();
	
	    	
	    }
	}
	}
	
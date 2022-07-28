package runnable;

public class runnable1  extends Thread {



 	public void run()
 	{
  		System.out.println(" Thread started running.");
}
 	public static void main( String args[] )
 	{
 		runnable1 thr = new  runnable1();
  		thr.start();
 	}
}


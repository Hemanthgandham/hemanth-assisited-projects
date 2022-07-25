package Emailverification;

import java.util.ArrayList;

public class EmailVerification {
    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
                
        emailID.add("hhvm@movie.com");
        emailID.add("rc15@movie.com");
        emailID.add("salar@movie.com");
        emailID.add("ntr30@movie.com");
        emailID.add("pushpa2@movie.com");
        emailID.add("mb28@movie.com");
       
        int c = 0;  
        String searchEmailID = "rc15@movie.com";
        
                for(int i=0; i<emailID.size(); i++) {
                                      
                    if(searchEmailID==emailID.get(i)) {
                        
                        System.out.println("\n");
                        
                       c = 1;                        
                        break;                        
                    }
                }                
                if(c==1)
                	
                {System.out.println("email ID " + searchEmailID + " is found");}
                
                else{System.out.println("email ID Not found");}

    }

}

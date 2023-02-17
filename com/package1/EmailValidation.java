package com.package1;
import java.util.ArrayList;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>emails = new ArrayList<String>();
		emails.add("javaValidation@domain.co.in");
		emails.add("javaValidation@domain.com");
		emails.add("javaValidation.name@domain.com");
		emails.add("javaValidation#@domain.co.in");
		
		String EmailValidation = "javaValidation@domain.com";
        
        for(int i=0; i<emails.size(); i++) {
            
            System.out.println(emails.get(i));
            
            if(EmailValidation==emails.get(i)) {
                
                System.out.println("\n");
                
                System.out.println("email ID"+" "+ EmailValidation +" "+"found");
                
                break;
		}
	}

}
}

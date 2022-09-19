package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.model.NewHire;
import com.greatlearning.service.Services;

public class DriverClass {

	public static void main(String[] args) {
	
		NewHire nh= new NewHire();
		
		Services ss = new Services();
		
		String generateEmail="";
		char[] generatePword=null;

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");

		int choice= sc.nextInt();
		
		switch(choice) {
		case 1:
			generateEmail=ss.generateEmailID(nh.getFirstName().toLowerCase(),nh.getLastName().toLowerCase(), "technical");
			generatePword=ss.generatePassword();
			break;
			
		case 2:
			generateEmail=ss.generateEmailID(nh.getFirstName().toLowerCase(),nh.getLastName().toLowerCase(), "admin");
			generatePword=ss.generatePassword();
			break;
			
		case 3:
			generateEmail=ss.generateEmailID(nh.getFirstName().toLowerCase(),nh.getLastName().toLowerCase(), "humanresources");
			generatePword=ss.generatePassword();
			break;

			
		case 4:
			generateEmail=ss.generateEmailID(nh.getFirstName().toLowerCase(),nh.getLastName().toLowerCase(), "legal");
			generatePword=ss.generatePassword();
			break;
			

			
		default:
			System.out.println("Please enter a valid number");
			}
		
		ss.displayDetails(nh.getFirstName(),nh.getLastName(),generateEmail,generatePword);
		
		
		System.out.println("Email -->"+generateEmail);
		System.out.println("Password -->"+generatePword);
		
	
	}

}

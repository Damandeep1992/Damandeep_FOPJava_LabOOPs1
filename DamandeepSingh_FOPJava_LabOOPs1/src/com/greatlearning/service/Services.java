package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.NewHire;

public class Services {
	
	public String generateEmailID(String fname, String sname, String dept) {
		
		return fname+sname+"@"+dept+".gl.com";
	}
	
	public char[] generatePassword() {
		
		String capLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String splCharacters="~!@#$%^&*";
		
		String value=capLetters+smallLetters+numbers+splCharacters;
		
		int i;
		char p[]= new char[10];
		
		Random random=new Random();
		
		for(i=0;i<10;i++) {
			p[i]=value.charAt(random.nextInt(value.length()));
		}
		return p;
	}
	
	public void displayDetails(NewHire nh) {
		
		
	}

	public void displayDetails(String firstName, String lastName, String generateEmail, char[] generatePword) {
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		
	}

	
}

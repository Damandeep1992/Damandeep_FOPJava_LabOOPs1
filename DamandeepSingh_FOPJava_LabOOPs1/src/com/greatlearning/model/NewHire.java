package com.greatlearning.model;

public class NewHire {
   private String firstName;
   private String lastName;
   
   public NewHire() {
	   this.firstName="Damandeep";
	   this.lastName="Singh";
	   
   }

public NewHire(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
   

}

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	
	class Student extends Person{
		private int[] testScores;
		public int total = 0;
	    
	}
	
	public char char_calculate(int... grades){
		for (int a = 0; a < grades.length ; a++){
				
		}
		
		
	}
	 
}
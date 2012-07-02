/*
 * Create New Java Project 
Create Package and Class with name Taskfirst 

Explore basic data types on Java's documentation site 

Create few functions like: 
- sumOfTwoNumers(int a, int b) 
  this function will return integer c 

-printBrianName() 
this function will return String Brian 

-printYourName(String firstName; String lastName) 
this function will return String of your full Name; 

-5 more function by yourself 

- Create main method in Class and Call all of these functions 
 */

package task1;

public class Task1 {
//Create Methods for the Class
	public int sumOfTwoNumbers(int a, int b){
		int c = a+ b;
		return c;	
	}
	public String printBrianName(String name){
		return name;	
	}
	public String printYourName(String firstName, String lastName){
		return "Your First Name is:" + firstName +" "+ lastName;
	}
	public int setAge(int age){
		return age;
	} 
	public boolean isEmpty(int i) {
		return false;
	}
	public double bubble(double a){
		return a*a;	
	}
	public boolean isPrime(int N) {
		if (N<2) return false;
		for (int i=2; i<=N/i; i++)
			if (N % i == 0) return false;
		return true;
	}
	public int abs(int x) {
		if (x<0) 	return -x;
		else		return x;		
	}
//Now Call the Methods with parameters	
	public static void main (String[] arg) {
		
		Task1 brianInfo = new Task1();
		
		brianInfo.sumOfTwoNumbers(34, 28);
		brianInfo.printBrianName("Brian");
		brianInfo.printYourName("Brian","Clampet");
		brianInfo.setAge(30);
		brianInfo.isEmpty(0);
		brianInfo.bubble(12);
		brianInfo.isPrime(13);
		brianInfo.abs(-5864);
	}
}

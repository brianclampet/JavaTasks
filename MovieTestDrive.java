package task2;

public class MovieTestDrive {
	public static void main (String[] arg) {
		
		Movie mov1 = new Movie();
		
		mov1.title ("Spiderman");
		mov1.genre("Action");
		mov1.rating(4);
		
		Movie mov2 = new Movie();
		
		mov2.title("The Dictator");
		mov2.genre("Comedy");
		mov2.rating(4);
		
		Movie mov3 = new Movie();
		
		mov3.title("Twilight");
		mov3.genre("Stupid");
		mov3.rating(0);
		
		
		mov1.playIt();
		mov2.playIt();
		mov3.playIt();
	}
	
	
	
	
		
}

package guessGame;

public class Player {

	public int number;
	
	//sets Player.number as a random integer between 0 & 9
	public void guess(){
		 number = (int) (Math.random() * 10);
		
	}
}

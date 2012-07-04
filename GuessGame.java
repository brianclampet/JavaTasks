package guessGame;

public class GuessGame {

	//creates instances of player variables
	Player player1;
	Player player2;

	public void startGame() {

		// assigns Player objects to player instances
		player1 = new Player();
		player2 = new Player();

		// sets integers variables for integers guesses from players
		int intguess1 = 0;
		int intguess2 = 0;

		// assigns boolean values to player correctness
		boolean player1Right = false;
		boolean player2Right = false;

		// creates random integers between 0-9
		int randomNum = (int) (Math.random() * 10);
		System.out.println("The Magic Number is:" + randomNum);

		
		while (true) {

			// runs guess method for each player object
			player1.guess();
			player2.guess();

			// assigns results of guess method to player integer guess value
			intguess1 = player1.number;
			intguess2 = player2.number;

			
			System.out.println("Player 1 Please Enter a #:" + intguess1);
			System.out.println("Player 2 Please Enter a #:" + intguess2);

			// compares random integer to player guess and sets the result to the player#Right variable
			if (intguess1 == randomNum) {
				player1Right = true;

			}
			if (intguess2 == randomNum) {
				player2Right = true;
			}
			// checks if there is a true value for player#Right
			if (player1Right || player2Right) {
				System.out.println("Player 1 # = " + intguess1);
				System.out.println("Player 2 # = " + intguess2);
				System.out.println("Mystery Number is " + randomNum);
				System.out.println("Player 1 You Win!");
				break;
			} else {
				System.out.println("Player 1 # = " + intguess1);
				System.out.println("Player 2 # = " + intguess2);
				System.out.println("Mystery Number is " + randomNum);

				System.out.println("Please Try Again");
			}

		}
	}
}

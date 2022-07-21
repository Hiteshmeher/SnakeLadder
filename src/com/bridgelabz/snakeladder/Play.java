package com.bridgelabz.snakeladder;
/**
 * 
 * @author LENOVO
 *
 */
public class Play {
	static final int WinningPosition = 100;

	public void rolling() {
		/**
		 * initialize position is 0
		 * rolling dice using random function thats 1 to 6
		 * again using random generating 0, 1 and 2
		 * if 0 then No PLAY
		 * if 1 then Ladder and will increase player position
		 * if 2 then snake and will decrease player position 
		 */
		int playerPosition = 0;
		System.out.println("Players starting Position is " + playerPosition);
		System.out.println("Roll dice to get number ");
		while (playerPosition != WinningPosition) {
			int number = 1 + (int) (Math.random() * 6);
			int option = (int) Math.floor(Math.random() * 3);
			if (option == 0) {
			} else if (option == 1) {
				System.out.println("wow !!! it's a Ladder");
				if (playerPosition < WinningPosition) {
					playerPosition = playerPosition + number;
					System.out.println("Player's current position is " + playerPosition);

				} else {
					playerPosition = playerPosition - number;
				}
			} else {
				System.out.println("Ohh No.... Snake");
				playerPosition = playerPosition - number;
				if (playerPosition < 0)
					playerPosition = 0;
				System.out.println("Player's current position is " + playerPosition);

			}
		}
		System.out.println("Player's current position is " + playerPosition);
	}
    
}
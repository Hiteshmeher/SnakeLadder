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
		 * again using random generating 1 and 2
		 * if 1 then Ladder, will increase player position
		 * if 2 then Snake, will decrease player position
		 * continuing till player reaches 100 (winning position)
		 * count the dice rolled
		 */
		int playerPosition = 0;
		int i = 0;
		System.out.println("Players starting Position is " + playerPosition);
		System.out.println("please roll dice to get number\n ");
		while (playerPosition != WinningPosition) {
			int number = 1 + (int) (Math.random() * 6);
			int option = (int) Math.floor(Math.random() * 2);
			switch (option) {
			case 0:
				System.out.println("Dice gave " + number);
				System.out.println("wow !!! it's a Ladder");
				if (playerPosition < WinningPosition) {
					playerPosition = playerPosition + number;
				}
				System.out.println("Player's current position is " + playerPosition);
				break;
			case 1:
				System.out.println("Dice gave " + number);
				System.out.println("Ohh No.... Snake");
				playerPosition = playerPosition - number;
				if (playerPosition < 0) {
					playerPosition = 0;

				}
				System.out.println("Player's current position is " + playerPosition);
				break;
			}
			i++;
		}
		System.out.println("\nPlayer's final position is " + playerPosition);
		System.out.println("Dice was Rolled " +i+ " times");
	}
}
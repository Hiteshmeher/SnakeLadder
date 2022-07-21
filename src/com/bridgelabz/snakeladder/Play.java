package com.bridgelabz.snakeladder;
/**
 * 
 * @author LENOVO
 *
 */
public class Play {
	
	public void rolling() {
		/**
		 * initialize position is 0
		 */
		int playerPosition = 0;
        System.out.println("Players starting Position is " +playerPosition);
        int number = 1 + (int)(Math.random() * 6);
        System.out.println("After rolling the dice i got " + number);
        playerPosition+=number;
        System.out.println("After rolling Player Position is " +playerPosition);

    }
}

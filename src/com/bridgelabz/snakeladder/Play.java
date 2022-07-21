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
		 * rolling dice using random function thats 1 to 6
		 * again using random generating 0, 1 and 2
		 * if 0 then No PLAY
		 * if 1 then Ladder and will increase player position
		 * if 2 then snake and will decrease player position 
		 */
		 int playerPosition = 0;
	        System.out.println("\nPlayers starting Position is " +playerPosition);
	        int number = 1 + (int)(Math.random() * 6);
	        System.out.println("After rolling the dice i got " + number+ "\n");
	        
	        int option = (int) Math.floor(Math.random()*3);
	        if (option == 0) {
	            System.out.println("Sorry Don't want to Play !!!");
	            System.out.println("Player current position is " + playerPosition);
	        }
	        else if (option == 1) {
	            System.out.println("Wow... its Ladder");
	            playerPosition+=number;
	            System.out.println("Player current position is " +playerPosition);
	        }
	        else {
	            System.out.println("Oops.... it's Snake");
	            playerPosition-=number;
	            if (playerPosition < 0) {
	            	playerPosition = 0;
	            }
	            System.out.println("Player current position is " + playerPosition);
	        }
    }
}

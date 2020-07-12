package JAVA17;

import java.util.Scanner;

class DiceGame{
	int diceFace;
	int userGuess;
	
	private void RollDice() {
		diceFace = (int)(Math.random()*6) + 1;
	}
	
	private int getUserInput(String prompt) {
		System.out.println(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public void checkUserGuess() {
		if ( diceFace == userGuess)
			System.out.println("�¾ҽ��ϴ�.");
		else
			System.out.println("Ʋ�Ƚ��ϴ�.");
	}
	public void startPlaying() {
		userGuess = getUserInput("������ �Է��Ͻÿ�.");
		RollDice();
		checkUserGuess();
	}
}
public class DiceGameTest {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();
		game.startPlaying();
	}
}

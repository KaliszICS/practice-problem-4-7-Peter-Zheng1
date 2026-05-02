/**
	* Lesson: 4.7

	* Author: Peter

	* Date Created: May 1, 2026

	* Date Last Modified: May 2, 2026

	*/

import java.util.Random;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int randomNumber(int num1, int num2){
		Random random = new Random();
		
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);

		return random.nextInt((max - min) + 1) + min;
	}

	public static char randomChar(String word){
		Random random = new Random();
		
		int index = random.nextInt(word.length());
		return word.charAt(index);
	}

	public static int randomEvenNumber(int num1, int num2){
		Random random = new Random();

		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		int num;

		do {
			num = random.nextInt((max-min) + 1) + min;
		}while (num % 2 !=0);

		return num;
	}
	
}

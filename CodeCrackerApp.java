/**
 * CodeCrackerApp.java
 * @author: S. Dworschak
 * 6th May 2017
 */

import javax.swing.JOptionPane;

public class CodeCrackerApp {
	public static void main(String [] args) {

		String guess;
		String secret;
		int ranNum;
		int vowels;
		int consonants;
		int corVowels = 0;
		int corConsonants = 0;

		CodeCracker Cracker;
		Cracker = new CodeCracker();

		Cracker.compute();
		secret = Cracker.getSecret();
		vowels = Cracker.getVowels();
		consonants = Cracker.getConsonants();

		JOptionPane.showMessageDialog(null,"There are "+vowels+" vowels and "+consonants+" consonants in the secret word. "+secret);
		for(int i = 0; i < 6; i++) {
		guess=JOptionPane.showInputDialog(null,"What's the secret word? Tell me your guess.");
		if(guess.equals(secret)) {
			JOptionPane.showMessageDialog(null,"Brilliant!! You got it right!");
			i = 6;
		}
		else if(i == 5) {
			JOptionPane.showMessageDialog(null,"Sorry, no more tries...");
		} else {
			corVowels = 0;
			corConsonants = 0;
			for(int j=0; j < secret.length(); j++) {
				System.out.println(secret.charAt(j) + " " + guess.charAt(j));
				if(secret.charAt(j) == guess.charAt(j)) {
					if(guess.charAt(j) == 'a' || guess.charAt(j) == 'e' || guess.charAt(j) == 'i' || guess.charAt(j) == 'o' || guess.charAt(j) == 'u') {
							corVowels++;
					} else {corConsonants++;}
				}
			}
			JOptionPane.showMessageDialog(null, "You have guessed "+corVowels+" vowels and "+corConsonants+" consonants correctly.");

		}
	}
	}
}
/**
 * CodeCracker.java
 * @author: S. Dworschak
 * 6th May 2017
 */

import java.util.Random;
public class CodeCracker {

	final private String [] secrets = {"posifk", "emcaou", "ldjciv", "enauiv"};
	private String secret;
	private int vowels;
	private int consonants;
	private int numRandom;

	Random rnd;

	public CodeCracker() {
		numRandom = 0;
		vowels = 0;
		consonants = 0;
		rnd=new Random();
	}

	public void compute(){

		numRandom = (int)rnd.nextInt(4);
		secret = secrets[numRandom];

		for(int i = 0; i <secret.length(); i++) {
			if(secret.charAt(i) == 'a' || secret.charAt(i) == 'e' || secret.charAt(i) == 'i' || secret.charAt(i) == 'o' || secret.charAt(i) == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}

	}

	public int getVowels(){
		return vowels;
	}
	public int getRandom(){
			return numRandom;
	}
	public int getConsonants(){
		return consonants;
	}
	public String getSecret() {
		return secret;
	}

}
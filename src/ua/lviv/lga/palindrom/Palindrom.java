package ua.lviv.lga.palindrom;

import java.util.Scanner;

public class Palindrom {
	
	public static void main(String[] args) throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 5 letter word");
		String word = sc.next();
		
		if(word.length() != 5) {
			String message = "The word does not consist of 5 letters. You must to enter a 5 letter word";
			throw new MyException(message);
		} else {
		
			StringBuffer sbWord = new StringBuffer(word.toUpperCase());
			sbWord.reverse();
			
			if(word.toUpperCase().equals(sbWord.toString())) {
				System.out.println("The word is Palindrom");
				} else {
					System.out.println("The word is not Palindrom");
				}
		}				
	}
}

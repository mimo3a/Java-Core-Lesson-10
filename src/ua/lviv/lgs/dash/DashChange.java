package ua.lviv.lgs.dash;


import java.util.Scanner;

public class DashChange {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter a string Please");
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String[] vowels = { "e", "u", "i", "o", "a","E","U","I","O","A","ó", "å", "³", "¿", "º", "à", "î", "ÿ", "è",
				"þ","Ó","Å","¯","²","À","Î","ª","ß","È","Þ"};
		
		String[] myStringArray = myString.split("");

		StringBuffer newString = new StringBuffer();

		for (int i = 0; i < myStringArray.length; i++) {

			for (String vow : vowels) {
				if (myStringArray[i].equals(vow)) {

					myStringArray[i] = "-";
				}
			}
			newString.append(myStringArray[i]);

		}
		System.out.println(newString);

	}

}

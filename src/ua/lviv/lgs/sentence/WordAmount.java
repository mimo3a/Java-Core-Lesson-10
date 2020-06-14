package ua.lviv.lgs.sentence;

import java.lang.reflect.Array;
import java.util.Arrays;

public class WordAmount {
	public static void main(String[] args) {

		String mySentence = "Програма повинна обробляти нормально слово обробляти повинна слово програма ";
		System.out.println(mySentence);
		String[] myArray = mySentence.split(" ");
		System.out.println("The sentence contains " + myArray.length + " words");

//		сколько раз аждое слово повторяется в предложении

		int[] countArray = new int[myArray.length];

		for (int i = 0; i < myArray.length; i++) {
			int count = 0;
			for (String word : myArray) {
				if (word.equalsIgnoreCase(myArray[i])) {
					count += 1;
				}
			}
			countArray[i] = count;
		}

//		вывод наибольшего индекса

		int mostNumber = 1;

		for (int i = 0; i < countArray.length - 1; i++) {
			if (countArray[i + 1] > countArray[i]) {
				mostNumber = countArray[i + 1];
			}
		}

//		создание массива слов с наибольшим индексом mostNumber

		String[] mostPopularArray = new String[countArray.length];

		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] == mostNumber) {
				mostPopularArray[i] = myArray[i];
			}
		}

//		расчет длины массива с самыми повторяемыми словами без null

		int arrayLength = 0;
		for (int i = 0; i < mostPopularArray.length; i++) {
			if (mostPopularArray[i] != null) {
				arrayLength += 1;
			}
		}

//		создание чистого массива с самыми повторяемыми словами без null

		String[] mostPopularCleanArray = new String[arrayLength];
		int clearIndex = -1;
		for (int i = 0; i < mostPopularArray.length; i++) {

			if (mostPopularArray[i] != null) {
				clearIndex += 1;
				mostPopularCleanArray[clearIndex] = mostPopularArray[i];
			}
		}

//		замена повторений на "-"

		for (int i = 0; i < mostPopularCleanArray.length; i++) {
//			System.out.println(i + " = " + mostPopularCleanArray[i]);
			for (int i1 = i + 1; i1 < mostPopularCleanArray.length; i1++) {
//				System.out.println("i1 = " + i1);
				if (mostPopularCleanArray[i].equalsIgnoreCase(mostPopularCleanArray[i1])) {
					mostPopularCleanArray[i1] = "-";
				}
			}
		}

//		вывод ответа на консоль

		if (mostNumber != 1) {

			System.out.println("Most popular words are ");

			for (int i = 0; i < mostPopularCleanArray.length; i++) {

				if (!mostPopularCleanArray[i].equals("-")) {

					System.out.println("'" + mostPopularCleanArray[i].toLowerCase() + "'");
				}
			}
			System.out.println("Repeads " + mostNumber + " times");
		} else {
			System.out.println("The sentence have not repeat words");
		}
	}
}

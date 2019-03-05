/**
* Java Level 2. Homework 3
*
*@author Pavel Bulin
*@version 03/05/2019 
*@link https://github.com/PavelBulin/java.git
*/
import java.util.*;

public class Collections {

    public static void main(String[] args) {		
		String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
	
		int counter, r, n = words.length;
		
		String[] wordStarts = new String[n];
		String[][] wordSorted = new String[n][n];
		int[] wordRepeats = new int[words.length];
		HashSet<String> hs = new HashSet<String>();

		Random rand = new Random();
		System.out.println("-- wordStarts[] - Before sorted");
		for (int i = 0; i < n; i++) {
			r = rand.nextInt(words.length);
			wordStarts[i] = words[r];
			hs.add(wordStarts[i]);
			System.out.print(wordStarts[i] + " ");
		}
		System.out.println();
		String temp;
		
		do {
			counter = 0;	
			for (int i = 0; i < (n - 1); i++) {
				if (wordStarts[i].compareTo(wordStarts[i + 1]) > 0) {
					temp = wordStarts[i];
					wordStarts[i] = wordStarts[i + 1];
					wordStarts[i + 1] = temp;
					counter++;
				}
			}
		} while (counter > 0);
		
		System.out.println("-- wordStarts[] after sorted");
		for (int i = 0; i < n; i++) {
			System.out.print(wordStarts[i] + " ");
		}
		
		System.out.println();	
		
		for (int j = 0; j < n; j++) {
			wordSorted[0][j] = wordStarts[j];
		}
		
		for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < (n - 1); i++) {
				if (wordSorted[j][i].equals(wordSorted[j][i + 1])) {
					wordSorted[j + 1][i] = wordSorted[j][i];
				} else {
					wordSorted[j + 1][i] = "zero";
				}
			
			}
			wordSorted[j + 1][(n - 1)] = "zero";
		}
		do {
			counter = 0;	
			for (int i = 0; i < (n - 1); i++) {
				if (words[i].compareTo(words[i + 1]) > 0) {
					temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
					counter++;
				}
			}
		} while (counter > 0);
		
		System.out.println("-- words[] --");
		
			for (int k = 0; k < words.length; k++) {
				for (int j = 0; j < n; j++) {
					for (int i = 0; i < n; i++) {
						if (words[k].equals(wordSorted[j][i])) {
							wordRepeats[k]++;
							break;
						}
					}
				}  
			}
			
			// for (int k = 0; k < hs.size; k++) {
				// for (int j = 0; j < words.length; j++) {
					// if (words[k].equals(wordSorted[j][i])) {
						// wordRepeats[k]++;
						// break;
					// }
				// }
			// }  
			
		for (int i = 0; i < n; i++) {
			System.out.print(words[i] + " ");
		}
		
		System.out.println();
		
		for (int k = 0; k < n; k++) {
			System.out.print(wordRepeats[k] + "      ");
		}

		System.out.println();
		
		for (int k = 0; k < n; k++) {
			if (wordRepeats[k] != 0)
				System.out.println(words[k] + " - " + wordRepeats[k]);
		}
		
		System.out.println();
		System.out.println(hs.size());
		System.out.println(hs);
	
		System.out.println(wordStarts.length);
	
	}
}









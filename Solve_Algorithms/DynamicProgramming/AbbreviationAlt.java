package algorithms.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class Abbreviation_alt {

	public static void main(String[] args) {
		String results = "";

		// A:65 +/-32 a: 97
		// Z:90 +/-32 z: 122

		// YES
//		String a = "daBcd";
//		String b = "ABC";

		// NO
//		String a = "AbCdE";
//		String b = "AFE";

		// NO
		String a = "beFgH";
		String b = "EFG";

		// YES
//		String a = "beFgH";
//		String b = "EFH";

		int matches = 0;

		int strALen = a.length();
		int strBLen = b.length();

		int[] intCharA = new int[strALen];
		int[] intCharB = new int[strBLen];

		for (int idx = 0; idx < strALen; idx++) {
			intCharA[idx] = a.charAt(idx);
		}
		for (int idx = 0; idx < strBLen; idx++) {
			intCharB[idx] = b.charAt(idx);
		}

		System.out.println(a);
		for (int ascii : intCharA)
			System.out.printf("%d ", ascii);

		System.out.println("\n\n\n");
		
		System.out.println(b);
		for (int ascii : intCharB)
			System.out.printf("%d ", ascii);
		System.out.println("\n\n\n");

		for(int idxB=0; idxB<strBLen; idxB++) {
			
			int pointerB=intCharB[idxB];
			
			for(int idxA=0; idxA<strALen; idxA++) {
				
				int pointerA=intCharA[idxA];
				
				if(pointerA==pointerB || pointerA-32==pointerB) {
					matches++;
					System.out.printf("Match:  %d\n",pointerA);
				}

				
				
			}
		}
//		System.out.printf("Upper total:  %d\n", upper);
//		System.out.printf("Lower total:  %d\n", lower);
//		System.out.printf("Matches:      %d\n", matches);
//		System.out.printf("Counter:      %d\n", counter);
//		if (counter == 0) {
//			extraUpper = matches - upper;
//
//		}
//		System.out.printf("extraUpper:   %d\n", extraUpper);
//		if (extraUpper == 0) {
//			System.out.println("YES!!!!!");
//		}
//
//		else
//			System.out.println("NO!!");
//		// System.out.println(results);
	}

}

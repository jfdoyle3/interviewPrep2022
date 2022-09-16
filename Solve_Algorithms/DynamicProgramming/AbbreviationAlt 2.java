package algorithms.dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class Abbreviation_alt2 {

	public static void main(String[] args) {


		// A:65 +/-32 a: 97
		// Z:90 +/-32 z: 122
		

		// YES
		String a = "daBcd";
		String b = "ABC";

		// NO
//		String a = "AfPZN";
//		String b = "APZNC";

		// NO
//		String a = "sYOCa";
//		String b = "YOCN";

		
		


		List<Integer> lowerCaseA=new ArrayList<>();
		List<Integer> upperCaseA=new ArrayList<>();
		List<Integer> listStrB=new ArrayList<>();
		
		int strALen = a.length();
		int strBLen = b.length();
		
		for(int idxA=0; idxA<strALen; idxA++) {
			int letterCase=a.charAt(idxA);
			if(letterCase>=97 && letterCase<=122) 
				lowerCaseA.add(letterCase);
			
			if(letterCase>=65 && letterCase<90) 
				upperCaseA.add(letterCase);
		}
		
		for(int idxB=0; idxB<strBLen; idxB++) {
			int letterStrB=b.charAt(idxB);
			listStrB.add(letterStrB);
			}
				
		
//			System.out.println("lower: "+lowerCaseA);
			System.out.println("upper: "+upperCaseA);
			System.out.println("str B: "+listStrB);
				
				
				
//		for(int idxUpper=upperCaseA.size()-1; idxUpper>=0; idxUpper--) {
//			if(listStrB.contains(upperCaseA.get(idxUpper)))
//				upperCaseA.remove(idxUpper);	
//		}
		for(int idxUpperA=upperCaseA.size()-1; idxUpperA>=0; idxUpperA--) {
		for(int idxUpperB=listStrB.size()-1; idxUpperB>=0; idxUpperB--) {
			if(listStrB.contains(upperCaseA.get(idxUpperA)))
				
				listStrB.remove(upperCaseA.get(idxUpperA));
		}	
		upperCaseA.remove(idxUpperA);
		}

		System.out.println("--> upper: "+upperCaseA);
		System.out.println("--> str B: "+listStrB);
		
		if(upperCaseA.isEmpty() || listStrB.isEmpty())
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}

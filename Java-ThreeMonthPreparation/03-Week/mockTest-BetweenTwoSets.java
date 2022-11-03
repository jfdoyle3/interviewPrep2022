/*
 * Sandbox.java
 *
 * Copyright 2022 Jim Doyle <>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */
import java.util.*;


public class Sandbox {

    public static void main (String[] args) {
		List<Integer> listA=new ArrayList<>(Arrays.asList(2,4));
		List<Integer> listB=new ArrayList<>(Arrays.asList(16,24,96));

		Collections.sort(listA);
		Collections.sort(listB);

		int maxNumListA=Collections.max(listA);
		int minNumListB=Collections.min(listB);

		List<Integer> factorList=new ArrayList<>();
		List<Integer> results=new ArrayList<>();

		for (int i = maxNumListA; i <= minNumListB; ++i) {
          if(i%maxNumListA==0)
			factorList.add(i);
		}

		for (int factor : factorList){
			for(int number : listB){
				if(number%factor==0)
					results.add(factor);

		 }
		}

		System.out.println(results);
    }
//  Methods Start here


}

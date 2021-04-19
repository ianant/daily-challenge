
package com.anant.practice.daily.daily_coding_challenge.Day1;

import java.util.HashSet;

/**
 * @author Anant Given a list of numbers and a number k, return whether any two
 *         numbers from the list add up to k.
 * 
 *         For example, given [10, 15, 3, 7] and k of 17, return true since 10 +
 *         7 is 17
 *
 */
public class Day1SumOf2Numbers {

	public static void main(String[] args) {
		int ar[]= {10, 15, 3, 7};
		int k=17;
		
		/*
		 * 1:way for(int i=0;i<ar.length-1;i++) { for(int j=i+1;j<ar.length;j++) {
		 * if(ar[i]+ar[j]==k) { System.out.println(ar[i]); System.out.println(ar[j]); }
		 * else { //System.out.println("no number found"); } } }
		 */		 
		
		//2nd way:
			HashSet<Integer> numberSet=new HashSet<Integer>();
			for(int i=0;i<ar.length;i++) {
				if(numberSet.contains(k-ar[i])) {
					System.out.println(ar[i]);
					numberSet.add(ar[i]);
					
				}
				numberSet.add(ar[i]);
			}
		
	}
}

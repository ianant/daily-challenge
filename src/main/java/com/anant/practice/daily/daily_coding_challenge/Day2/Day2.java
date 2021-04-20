package com.anant.practice.daily.daily_coding_challenge.Day2;



/**
 * @author Anant
 *
 *Given an array of integers,
 * return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5],
 the expected output would be [120, 60, 40, 30, 24].
  If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class Day2 {

	public static void main(String[] args) {
		int [] ar= {1,2,3,4,5};
		int [] outputArray=new int[ar.length];
		int [] left=new int[ar.length];
		int [] right= new int[ar.length];
		int i;
		int j;
		int n=ar.length;
		left[0]=1;
		right[n-1]=1;
		for(i=1;i<n;i++) {
			left[i]=left[i-1]*ar[i-1];
		}
		for(j=n-2;j>=0;--j) {
			right[j]=right[j+1]*ar[j+1];
		}
		for(i=0;i<n;i++) {
			outputArray[i]=left[i]*right[i];
		}
		for (int k : outputArray) {
			System.out.print(k+":");
		}
		
	}

}

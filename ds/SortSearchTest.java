package com.regnant.ds;

import java.util.Arrays;

public class SortSearchTest {

	public static void main(String[] args) {
		int arr[]= {105,45,23,95,86,27};
		int a[]= {105,45,23,95,86,27};
		SortSearch ss=new SortSearch();
		int bsarr[]=ss.bubbleSort(arr);
		System.out.println("Bubble Sort Array:"+Arrays.toString(bsarr));
		int isarr[]=ss.insertionSort(a);
		System.out.println("Insertion Sort Array:"+Arrays.toString(isarr));
		ss.linearSearch(bsarr, 105);
		ss.binarySearch(isarr, 23);
		

	}

}

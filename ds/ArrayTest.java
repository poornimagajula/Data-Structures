package com.regnant.ds;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Existing Array:"+Arrays.toString(arr));
		AddDelArray ada=new AddDelArray();
		int[] addArr=ada.addArray(arr);
		System.out.println("After Adding the Array Elements: "+Arrays.toString(addArr));
		System.out.println("Enter how many elements u want to delete:");
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] delArr=ada.delArray(addArr,size);
		System.out.println("Existing Array:"+Arrays.toString(addArr));
		System.out.println("After Deleting the Array Elements:"+Arrays.toString(delArr));
		

	}

}

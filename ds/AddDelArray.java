package com.regnant.ds;


import java.util.Scanner;

public class AddDelArray {
	int delArr[], add_ele, del_ele, pos;
	Scanner s = new Scanner(System.in);

	// Adding Elements into an existing Array
	public int[] addArray(int arr[]) {

		System.out.println("Enter how many elements u want to add:");
		add_ele = s.nextInt();
		int addArr[] = new int[arr.length + add_ele];
		for (int i = 0; i < addArr.length; i++) {
			if (i == arr.length) {
				for (i = arr.length; i < addArr.length; i++) {
					System.out.println("Enter the " + (i + 1) + "th element");
					addArr[i] = s.nextInt();
				}
			} else
				addArr[i] = arr[i];
		}
		// System.out.println("Array Elements After Adding new
		// :"+Arrays.toString(addArr));
		return addArr;
	}

	public int[] delArray(int addArr[], int size) {
		if (size == 0) {
			return delArr;
		}
		for (int i = 0; i < size; i++) {
			delArr = new int[addArr.length - 1];
			System.out.println("Enter the element u want to delete:");
			del_ele = s.nextInt();
			for(int l=0;l<addArr.length;l++) {
				if (addArr[l] == del_ele) {
					pos=l;
					for (int j = 0; j < l; j++) {
						delArr[j] = addArr[j];
					}
					for (int k = pos; k < delArr.length; k++) {
						delArr[k] = addArr[k + 1];
					}
				}
			}
		size--;
		}
		
		return delArray(delArr, size);
		}

}

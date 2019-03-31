package com.regnant.ds;

public class SortSearch {
	// Bubble Sort Algorithm
	public int[] bubbleSort(int[] arr) {
		int swap = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = j + 1; j < arr.length - 1; j++, k++) {
				if (arr[j] > arr[k]) {
					swap = arr[j];
					arr[j] = arr[k];
					arr[k] = swap;
				}
			}
		}
		return arr;
	}

	// Insertion Sort Algorithm
	public int[] insertionSort(int arr[]) {
		int temp, swap = 0;
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					temp = arr[i];
					if (temp < arr[j]) {
						swap = temp;
						temp = arr[j];
						arr[j] = swap;
						arr[i] = temp;
					}

				}
			}
		}
		return arr;
	}

	// Linear Search Algorithm
	public void linearSearch(int arr[], int ele) {
		int pos = 0;
		for (int i = 0; i < arr.length; i++) {
			pos++;
			if (arr[i] == ele) {
				System.out.println("Linear Search Element Position: " + pos);
				break;
			} else if (pos == arr.length) {
				System.out.println("Element Not found");
				break;
			}
			continue;
		}
	}

	// Binary Search Algorithm
	public void binarySearch(int arr[], int ele) {
		int mid = arr.length / 2, pos = 0;
		if (ele < arr[mid]) {
			for (int i = 0; i < mid; i++) {
				pos++;
				if (arr[i] == ele) {
					System.out.println("Binary Search Element Position:" + pos);
					break;
				} else if (arr[i] != ele) {
					System.out.println("element not found");
					break;
				}
				continue;
			}

		} else if (ele >= arr[mid]) {
			pos = mid;
			for (int i = mid; i < arr.length; i++) {
				pos++;
				if (arr[i] == ele) {
					System.out.println("Binary Search Element Position: " + pos);
					break;
				} else if (arr[i] != ele) {
					System.out.println("Element Not Found");
					break;
				}
			}
		}
	}

	public void exponentialSearch(int arr[], int ele) {

	}

}
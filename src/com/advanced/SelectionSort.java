package com.advanced;

public class SelectionSort {

	//Find minimum element and place it at the beginning.
	public void minNumber(int[]arr){
		
		for(int i = 0; i<arr.length; i++){
			
			int min = i;
			
			for(int j = i+1; j<arr.length; j++){
				
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {

		int[]arr = {7,1,5,3,6,4};
		
		SelectionSort s = new SelectionSort();
		s.minNumber(arr);
		
		System.out.println("Selection Sorting");
		for(int num : arr){
			
			System.out.print(num + " ");
		}

	}

}

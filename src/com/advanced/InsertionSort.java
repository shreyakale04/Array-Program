package com.advanced;

public class InsertionSort {
	
//taking each element and inserting it into its correct position
	
	public void insertArray(int[]arr){
		
		for(int i = 1; i < arr.length; i++){
			
			int key = arr[i]; //current element
			
			int j = i - 1;
			
			// Move bigger elements one position ahead
			
			while(j >= 0 && arr[j] > key){
				
				arr[j+1] = arr[j];
				j--;
			}
			
            // Insert key at correct position
            arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		
		int[]arr = {7,1,5,3,6,4};
		
		InsertionSort s1 = new InsertionSort();
		s1.insertArray(arr);
		
		System.out.println("Insertion Array");
		for(int num : arr){
			System.out.print(num + " ");
		}

	}

}

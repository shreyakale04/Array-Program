package com.advanced;

public class CombineSort {
	
	public static void main(String[] args) {
		
		int[]arr = {1,9,7,4,11};
		int n = 15;
		int target = 17;
		
		boolean[]result = new boolean[n+1];
		
		for(int num : arr){
			result[num] = true; 
		}
		
		System.out.println("Missing no are : ");
		
		for(int i = 1; i<=n; i++){
			
			if(!result[i])
			{
				  System.out.print(i + " ");
		}
		}
		System.out.println();
		
		//Sorted Array
		
		System.out.println("Sorted Array");
		for(int i = 1; i <= n; i++){
			
			System.out.print(i+ " ");
		}
		System.out.println();
		
		//second largest
		
		System.out.println("Second Largest " + (n-1));
		
		//Sum of two no 
		
		int count = 0;
		System.out.println("Pairs with Sum = 17");
		
		for(int i = 0 ; i<=n; i++){
			int j = target - i;
			
			if(j > i && j<=n){
				System.out.println(i + " + " + j + " = " + target);
				count++;
			}
		}
		System.out.println("Total Possibilities = " +count);
	}
	
}
	
	


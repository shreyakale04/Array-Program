package com.advanced;

import java.util.HashSet;
import java.util.Set;

public class DuplicateTwopt {
	public static void main(String[] args) {
		
	int[]arr = {0,0,1,1,1,2,2,3,3,4};
	
	Set<Integer>set = new HashSet<>();
	
    for(int num : arr){
   	 
   	 if(set.add(num)){
   		 
   		
   	 }
    }
    System.out.println(set);
	
	
	}
}
	
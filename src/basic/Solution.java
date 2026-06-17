package basic;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		
	  String s = "ab**ccd*ef*ggc";
	  int[]arr = {1,2,3,4,5,6,7,8,9,10};
	  
	  Stack<Character>stk = new Stack<>();
	  Stack<Integer>indexStk = new Stack<>();
	  
	 for(int i = 0; i<s.length(); i++){
		  
		 char ch = s.charAt(i);
		 
		  if(ch == '*'){
			  if(!stk.isEmpty()){
			  stk.pop();
			  indexStk.pop();
		  }
		  }
		  else{
		  
		 stk.push(ch);
		 indexStk.push(i);
	  }
		  }
	  
	  StringBuilder str = new StringBuilder();
	  
	  HashMap<Character, Integer> fq = new HashMap<>();
	  
	  for(char c : stk){
		  
		  str.append(c);
		  
		  fq.put(c, fq.getOrDefault(c, 0) + 1);
	  }
	  System.out.println("Final String : " + str);
	 
	  String rev = str.reverse().toString();
	  System.out.println("Reverse String : " + rev);
	  
	  System.out.println("Original Indexes : ");
	  
	  for(int index : indexStk){
		  
		  System.out.println(index + " ");
	  }
	  System.out.println();
	  
	  int sum = 0;
	  int max = arr[0];
	  int min = arr[0];
	  
	  for(int num : arr){
		  
		  sum += num;
		  
		  if(num > max)
			  max = num;
		  if(num < min)
			  min = num;
	  }
	  
	  System.out.println("sum = " + sum);
	  System.out.println("Maximum = " + max);
	  System.out.println("Minimum = " + min);
	  
	  System.out.println("Character Frequency");
	  
	  for(char c : fq.keySet()){
		  System.out.println(c + "--" + fq.get(c));
	  }
	  
	  
	}

}

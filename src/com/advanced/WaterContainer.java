package com.advanced;

public class WaterContainer {
	
	public int maxArea(int[]height){
		
	int left = 0;
	int right = height.length - 1;
	
	int maxArea = 0;
	
	while(left < right){
		
		int width = right - left;
		int currentHeight = Math.min(height[left], height[right]);
		
		int area = width * currentHeight;
		maxArea = Math.max(area, maxArea);
		
		if(height[left] < height[right]){
			
			left++;
		}else{
			right--;
		}
	}
	return maxArea;
	}
	public static void main(String[] args) {
		
		int[]height = {1,8,6,2,5,4,8,3,7};
	
		WaterContainer c = new WaterContainer();
		
		System.out.println(c.maxArea(height));
    
	}

}

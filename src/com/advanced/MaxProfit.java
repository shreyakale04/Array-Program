package com.advanced;

public class MaxProfit {
	
	public int maxProfit(int[]prices){
		
		int maxprofit = 0;
		
		for(int i = 0; i<prices.length; i++){
			for(int j = i+1; j<prices.length; j++){
				
				int profit = prices[j] - prices[i];
				
				maxprofit = Math.max(maxprofit, profit);
				
			}
		}
		
		return maxprofit;
	}
	
	

	public static void main(String[] args) {
		
		int[]prices = {7,1,5,3,6,4};
		
		MaxProfit mp = new MaxProfit();
		
		int result = mp.maxProfit(prices);
		System.out.println(result);
		

	}

}

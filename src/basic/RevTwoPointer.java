package basic;

public class RevTwoPointer {

	public static void main(String[] args) {
		
		//Two Pointer Approach
		int[] arr = {10, 2, 31, 4, 5, 8};
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left<right){
			
			//Swapping
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
			
		}
		
		for(int num : arr){
			
			System.out.println(num);
		}

	}

}

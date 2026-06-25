package basic;

public class RotateArray {

	public static void main(String[] args) {
		//Traverse
		int[] arr = {1, 2, 3, 4, 5};
		
		int k = 3;
		
		int n = arr.length;
		int[]result = new int[n];
		
		for(int i = 0; i<n; i++){
			result[i] = arr[(i+k) % n];
		}

		for(int num : result){
		System.out.print(num + " ");
	}
	}
}

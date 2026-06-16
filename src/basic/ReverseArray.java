package basic;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[]arr = {2, 3, 5, 7, 8};
		
		for(int i = arr.length-1; i>=0; i--){
			
			System.out.println(arr[i]);
		}
	}

}

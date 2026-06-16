package basic;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = {12, 45, 7, 89, 23};
		
		int lar = Integer.MIN_VALUE;
		int SecLar = Integer.MIN_VALUE;
		
	for(int i = 0; i<arr.length; i++){
		
		if(arr[i] > lar){
			
			SecLar = lar;
			lar = arr[i];
		}
		else if(arr[i] > SecLar && arr[i] != lar){
			
			SecLar = arr[i];
			
		}
		
	}
	System.out.println("Largest = " + lar);
	System.out.println("SecondLargest = " + SecLar);

		}

	}

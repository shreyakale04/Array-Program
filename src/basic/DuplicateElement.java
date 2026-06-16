package basic;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
	
		int[]arr = {1, 2, 4, 2, 3};

	   Set<Integer>set = new HashSet<>();

		
		for(int num : arr){
			
			if(set.add(num));

		}
		System.out.println(set);
		
		

	}

}

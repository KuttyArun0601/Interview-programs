package interview_prgs;

import java.util.HashSet;

public class RemoveDublicate {

	public static void main(String[] args) {
		
		int [] arr = {2,3,2,2,3,4,5,2,12,3,14,56};
		
		HashSet<Integer> set = new HashSet<>();
		
		for (int integer : arr) 
		{
			set.add(integer);
			
			
		}
		System.out.println(set);
	}
}

package interview_prgs;

public class FindLargest {

	public static void main(String[] args) {
		
		int [] arr = {2,14,6,35,74,345};
		
		int largest = arr[0];
		for (int i : arr) 
		{
			if (i > largest) {
				largest = i;
			}
		}
		System.out.println(largest);
	}
}

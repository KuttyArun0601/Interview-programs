package interview_prgs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String to check palindrome or not");
		String input=sc.next();
		
		String rev = new StringBuilder(input).reverse().toString();
		
		if(input.equals(rev))
		{
			System.out.println(rev+" is a palindrome");
		}
		else {
			System.out.println(input+" is not a palindrome");
		}
		
		sc.close();
		
	}
}

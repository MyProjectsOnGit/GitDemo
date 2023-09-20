import java.util.Scanner;

public class Palindrome {
	
	public static void palindrome(String s)
	{
		String str= s;
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
			
			if(str.equals(reverse))
				System.out.println("palindrome");
			else
				System.out.println("Not Palindrome");
			
		
		
		
	}
	public static void main(String[] args) {
		
		String original;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		original= sc.nextLine();
		palindrome(original);
		
	}

}

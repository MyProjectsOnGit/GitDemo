import java.util.Scanner;

public class Fibonacci {
	
	public static void fibonacci(int count)
	{
		int n1=0,n2=1,n3;
		System.out.println(n1+" "+n2);
		
		for(int i=2;i<count;++i)
		{
		n3=n1+n2;
		System.out.println(" "+n3);
		
		n1=n2;
		n2=n3;
		}
	}
	public static void main(String[] args) {
		
		String count;
		int value,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		count = sc.nextLine();
		value = Integer.parseInt(count);
		c = value;
		fibonacci(c);
		System.out.println("End of code");
		System.out.println("End of code:");
		System.out.println("End of code:");
		System.out.println("End of code");
		
	}
	}





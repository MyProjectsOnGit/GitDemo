import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime(int num)
	{
		if(num==1)
		{
			return false;
		}
		
		for(int i=2;i<Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		int n,value;
		String number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		number = sc.nextLine();
		n= Integer.parseInt(number);
		
		value = n;
		if(isPrime(value))
		{
			System.out.println("prime number");
			
		}
		else
		{
			System.out.println("not prime number");
			
		}
		
	}
	

}

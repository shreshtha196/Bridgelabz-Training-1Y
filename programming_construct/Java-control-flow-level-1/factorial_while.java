import java.util.Scanner;
class factorial_while
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int fact = 1;
		while(num > 0)
		{
		    fact*=num;
			num--;
		}
		System.out.println(+ fact);	
	}
}
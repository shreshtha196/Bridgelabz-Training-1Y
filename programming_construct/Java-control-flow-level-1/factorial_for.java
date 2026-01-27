import java.util.Scanner;
class factorial_for
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int fact = 1;
		for( ;num > 0; num--)
		{
		    fact*=num;
		}
		System.out.println(+ fact);	
	}
}
import java.util.Scanner;
class counter_for
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = input.nextInt();
		if(number <=0 || number>=100)
		{
			System.out.println("Invalid number");
		}
		else
		{
			System.out.println("Factors of " + number + " are:");
			for ( int i = 100 ; i >= 1 ; i--)
			{
				if(number % i == 0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
import java.util.Scanner;
class even_odd
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an number");
		int num = input.nextInt();
		if(num > 0)
		{
			for (int i = 1; i <= num ; i++)
			{
				if(i % 2 == 0)
				{
					System.out.println(i + " is an even number");
				}
				else
				{
					System.out.println(i + " is an odd number");

				}
			}
		}
	}
}
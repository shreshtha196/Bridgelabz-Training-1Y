import java.util.Scanner;
class Largest_number
{
	public static void main(String  args[])
	{
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if (num1 > num2 && num1 > num3)
		{
			System.out.println(num1 + " is the largest.");
		}
		if (num2 > num1 && num2 > num3)
		{
			System.out.println(num2 + " is the largest.");
		}
		if (num3 > num2 && num3 > num1)
		{
			System.out.println(num3 + " is the largest.");
		}
	}

}
import java.util.Scanner;
class sum
{
	public static void main(String  args[])
	{
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum;
		sum = number*(number+1)/2;
		System.out.println("sum of natural number is "+sum);
	}
}
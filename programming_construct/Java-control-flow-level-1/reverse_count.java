import java.util.Scanner;
class reverse_count
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for( ; num >= 1; num--)
		{
			System.out.println(" " + num);
		}
	}
}
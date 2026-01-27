import java.util.Scanner;
class multiplication
{
    public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		System.out.println("enter number");
		int num = input.nextInt();
		for (int i = 6; i <= 9; i++)
		{
			int multi = num*i;
			System.out.println(" " + multi);
		}
	}		
}

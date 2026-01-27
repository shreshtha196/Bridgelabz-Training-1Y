import java.util.Scanner;
class sum_of_numbers
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		while(num != 0)
		{
            sum+=num;
			num = input.nextInt();
		}	
        System.out.println("sum is " + sum);		
	}
}
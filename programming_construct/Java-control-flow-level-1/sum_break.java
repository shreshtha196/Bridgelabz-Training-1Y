import java.util.Scanner;
class sum_break
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum = 0;
		while(true)
		{
			if( num <= 0)
			{
				break;
			}
			sum+=num;
			num = input.nextInt();
		}	
        System.out.println("sum is " + sum);		
	}
}
import java.util.Scanner;
class compare_for_formula
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum1 = 0;
		int sum2 = num*(num+1)/2;
		for( ;num > 0; num--)
		{
			 sum1+=num;
			 
		}	
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
		System.out.println(sum1 == sum2);
	}
}
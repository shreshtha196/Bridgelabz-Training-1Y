import java.util.Scanner;
class compare_while_formula
{
	public static void main(String args[])
	{
        Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sum1 = 0;
		int sum2 = num*(num+1)/2;
		while(num > 0)
		{
			 sum1+=num;
			 num--;
		}	
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
		System.out.println(sum1 == sum2);
	}
}
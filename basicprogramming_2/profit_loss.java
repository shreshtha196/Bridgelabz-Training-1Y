import java.util.Scanner;
class harry
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter cost price");
		int c = input.nextInt();
		System.out.println("Enter selling price");
		int s = input.nextInt();
		int profit = s-c;
		System.out.println("profit is of"+profit);
		int percentage = (profit*100)/c;
		System.out.println("profit percentage= "+percentage);
	}
}
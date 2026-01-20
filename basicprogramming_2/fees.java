import java.util.Scanner;
class fees
{
	 public static void main(String args[])
	 {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the fee of college:");
		int f = input.nextInt();
	    System.out.println("Enter the discount:");
		int b = input.nextInt();
		int d = (f*b)/100;
		System.out.println("Discounted price is:"+d);
		int a = f-d;
		System.out.println("fee to be paid:"+a);
		}
}
import java.util.Scanner;
class calculator
{
	 public static void main(String args[])
	 {
	     Scanner input = new Scanner(System.in);
		 System.out.println("Enter the first number:");
		 int f = input.nextInt();
		 System.out.println("Enter the second number:");
		 int a = input.nextInt();
		 int s = f+a;
		 System.out.println("the sum of two number is:"+s);
		 int m = f-a;
		 System.out.println("the difference of two nuumber is:"+m);
		 int p = f*a;
		 System.out.println("the product of two number is:"+p);
		 double d = f/a;
		 System.out.println("the division of two number is:"+d);
	 }
}
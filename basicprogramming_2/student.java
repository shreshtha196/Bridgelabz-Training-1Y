import java.util.Scanner;
class student
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of pen");
		double k = input.nextDouble();
		System.out.println("Enter number of students");
		double m = input.nextDouble();
		double q = k/m;
		System.out.println("quotient is:"+q);
		double r = k-(m*q);
		System.out.println("Remainder is:"+r);
	}
}
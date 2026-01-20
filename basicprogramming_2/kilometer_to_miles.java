import java.util.Scanner;
class kilometer_to_miles
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter km distance");
		double k = input.nextDouble();
		double m = k*1.6;
		System.out.println("distancein miles="+m);
	}
}
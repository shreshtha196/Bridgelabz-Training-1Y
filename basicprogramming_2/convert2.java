import java.util.Scanner;
class convert2
{
	 public static void main(String args[])
	 {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in feet:");
		int f = input.nextInt();
		double d = f/3;
		System.out.println("height in yard:"+d);
		double a = d/1760;
		System.out.println("heightin miles:"+a);
	 }
}
import java.util.Scanner;
class square
{
	 public static void main(String args[])
	 {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the perimeter:");
		int p = input.nextInt();
		double s = p/4;
		System.out.println("the length of side of square:"+s);
	 }
}
import java.util.Scanner;
class handshake
{
	 public static void main(String args[])
	 {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int s = input.nextInt();
		double h = (s*(s-1))/2;
		System.out.println("Number of handshake:"+h);
	 }
}
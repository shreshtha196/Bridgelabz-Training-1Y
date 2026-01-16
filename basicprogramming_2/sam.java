import java.util.Scanner;
class sam
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks of maths");
		int maths = input.nextInt();
		System.out.println("Enter your marks of physics");
		int physics = input.nextInt();
		System.out.println("Enter the marks of chemistry");
		int chemistry = input.nextInt();
		int average =  (maths+physics+chemistry)/3;
		System.out.println("average marks="+average);
	}
}
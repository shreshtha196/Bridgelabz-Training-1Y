import java.util.Scanner;
class harry
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your birth year");
		int birth_year = input.nextInt();
		System.out.println("Enter your current year");
		int current_year = input.nextInt();
		int age = current_year - birth_year;
		System.out.println("age of harry="+age);
	}
}
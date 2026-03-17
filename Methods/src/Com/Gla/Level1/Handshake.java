package Com.Gla.Level1;

import java.util.Scanner;

public class Handshake
    {
        public static int CalculateHandshakes(int n)
        {
            return(n*(n-1)/2);
        }
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int  n = sc.nextInt();
            System.out.println("Maximum hanshakes: "+ CalculateHandshakes(n));
        }
    }


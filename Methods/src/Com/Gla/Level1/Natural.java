package Com.Gla.Level1;

import java.util.Scanner;

public class Natural {
        public static int findsum(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += 1;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int n = sc.nextInt();
            System.out.println("Sum Of Natural Number is: "+findsum(n));
        }
}

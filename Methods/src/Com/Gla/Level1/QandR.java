package Com.Gla.Level1;

import java.util.Scanner;

public class QandR {
    public static int[] find(int n, int d) {
        int Q = n / d;
        int R = n % d;
        return  new int[]{Q,R};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        System.out.println("d = ");
        int d = sc.nextInt();
        int[] result = find(n,d);
        System.out.println("Q = "+result[0]);
        System.out.println("R = "+result[1]);
    }
}

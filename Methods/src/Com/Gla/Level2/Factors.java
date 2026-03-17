package Com.Gla.Level2;

import java.util.Scanner;

public class Factors {
    public static int[] find(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            int[] factors = new int[count];
            int index = 0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    factors[index++] = i;
                    return factors;
                }
            }

        }
        return new int[0];
    }
    public static int sum(int[]arr) {
        int s=0;
        for (int x:arr){
            s+=x;
        }

        return s;
    }
    public static int product(int[]arr){
        int p=1;
        for (int x:arr) {
            p *= x;
        }
        return p;

    }
    public static int SquareSum(int[]arr) {
        int s = 0;
        for (int x : arr) {
            s += Math.pow(x, 2);
        }
        return s;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[]factors=find(n);
        System.out.println("Factors: ");
        for (int f:factors)
            System.out.println(f+" ");
        System.out.println("\nsum = "+sum(factors));
        System.out.println("product = "+product(factors));
        System.out.println("SquareSum = "+SquareSum(factors));
    }
}

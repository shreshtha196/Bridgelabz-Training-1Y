package Com.Gla.Level1;

import java.util.Scanner;

public class Chocolate {
    public static int[] find(int n,int m){
        int Q = n / m;
        int R = n % m;
        return  new int[]{Q,R};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        System.out.println("m = ");
        int m= sc.nextInt();
        int[] result = find(n,m);
        System.out.println("Q = "+result[0]);
        System.out.println("R = "+result[1]);
    }
}

package Com.Gla.Level3;

import java.util.Scanner;

public class Perfectnumber {
    public static int sum(int n){
        int sum=0;
        for (int i=0;i<n;i++) {
            if (n%i==0)
                sum += i;
        }
        return sum;
    }
    public static boolean isperfect(int n) {
        return sum(n) == n;
    }
    public static boolean isAbudent(int n) {
        return sum(n) > n;
    }
    public static boolean isDeficient(int n) {
        return sum(n) < n;
    }
    public static int Factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }
    public static boolean isstrong(int n){
        int temp=n;
        int sum=0;
        while(temp !=0){
            int d=temp % 10;
            sum += Factorial(d);
            temp/=10;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number:");
        int num=sc.nextInt();
        System.out.println("perfect:"+isperfect(num));
        System.out.println("Abundant:"+isAbudent(num));
        System.out.println("Deficient:"+isDeficient(num));
        System.out.println("Strong:"+isstrong(num));
    }
}

package Com.Gla.Level1;

import java.util.Scanner;

public class Number {
    public static int check( int num) {
        if (num > 0) {
            return 1;
        } else if (num<0) {
            return -1;
        }
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        int result = check(n);
        if(result==1) {
            System.out.println("Positive");
        }
        else if(result==-1) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }

    }
}

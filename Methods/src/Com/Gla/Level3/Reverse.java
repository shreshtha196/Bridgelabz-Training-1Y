package Com.Gla.Level3;

import java.util.Scanner;

public class Reverse {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int[] storeDigits(int n) {

        int len = countDigits(n);
        int[] digits = new int[len];

        for (int i = len - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }

        return digits;
    }

    public static int[] reverse(int[] arr) {

        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }

        return rev;
    }

    public static boolean compare(int[] a, int[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }

    public static boolean isDuck(int[] digits) {

        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);
        int[] rev = reverse(digits);

        System.out.println("Palindrome: " + compare(digits, rev));
        System.out.println("Duck Number: " + isDuck(digits));
    }
}

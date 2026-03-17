package Com.Gla.Level1;

import java.util.Scanner;

public class Num3 {
    public static int[] find(int a,int b,int c){
        int min = Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a =  ");
        int a = sc.nextInt();
        System.out.println("b =  ");
        int b = sc.nextInt();
        System.out.println("c =  ");
        int c = sc.nextInt();
        int[] result = find(a,b,c);
        System.out.println("Small. = "+result[0]);
        System.out.println("Largest = "+result[1]);
    }
}

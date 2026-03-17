package Com.Gla.Level1;

import java.util.Scanner;

public class Spring {
    public static boolean isSpring(int M,int D){
        return (M == 3 && D <= 20)||
                (M==4)||
                (M==5)||
                (M==6&&D<=20);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int M= sc.nextInt();
        System.out.println("Enter Day: ");
        int D= sc.nextInt();
        if(isSpring(M,D)){
            System.out.println("It's a Spring Season");
        }
        else {
            System.out.println("It is not a Spring Season");
        }
    }
}

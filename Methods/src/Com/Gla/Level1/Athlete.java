package Com.Gla.Level1;

import java.util.Scanner;

public class Athlete {
         public static double Rounds(double a, double b,double c){
             double perimeter = a+b+c;
             double Distance = 5000;
             return Distance/perimeter;
         }

         public static void main(String[] args) {
             Scanner sc = new Scanner(System.in );
             System.out.println("Enter Side A: ");
             double a = sc.nextDouble();
             System.out.println("Enter the Side B: ");
             double b = sc.nextDouble();
             System.out.println("Enter Side C: ");
             double c = sc.nextDouble();
             double rounds = Rounds(a,b,c);
             System.out.println("Rounds Needed: "+rounds
             );
         }

}
package Com.Gla.Level1;

import java.util.Scanner;

public class SimpleIntrest {
    public static double CalculateSI(double p,double r,double t)
    {
        return ((p*r*t)/100);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double p = sc.nextDouble();
        System.out.println("Enter rate: ");
        double r = sc.nextDouble();
        System.out.println("Enter time: ");
        double t =sc.nextDouble();
        double SI = CalculateSI(p,r,t);
        System.out.println("simple interest; "+SI);
    }
}

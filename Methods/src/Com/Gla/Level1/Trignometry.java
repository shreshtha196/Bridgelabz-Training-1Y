package Com.Gla.Level1;

import java.util.Scanner;

public class Trignometry {
    public static double[] find(double a){
        double rad = Math.toRadians(a);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin,cos,tan};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double[] result = find(a);
        System.out.println("sin =  "+result[0]);
        System.out.println("cos =  "+result[1]);
        System.out.println("tan =  "+result[2]);
    }
}

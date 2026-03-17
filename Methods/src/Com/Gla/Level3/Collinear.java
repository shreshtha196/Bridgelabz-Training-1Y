package Com.Gla.Level3;

import java.util.Scanner;

public class Collinear {
    public static boolean checkSlope(int x1,int y1,int x2,int y2,int x3,int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);
        return (slopeAB == slopeBC) && (slopeBC == slopeAC);
    }
    public static boolean checkArea(int x1,int y1,int x2,int y2,int x3,int y3) {
        double area = 0.5 * ( x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2) );
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,y1,x2,y2,x3,y3;
        System.out.println("Enter x1 y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter x2 y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        System.out.println("Enter x3 y3");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        if(checkSlope(x1,y1,x2,y2,x3,y3))
            System.out.println("Points are Collinear (Slope Method)");
        else
            System.out.println("Points are NOT Collinear (Slope Method)");
        if(checkArea(x1,y1,x2,y2,x3,y3))
            System.out.println("Points are Collinear (Area Method)");
        else
            System.out.println("Points are NOT Collinear (Area Method)");
    }
}

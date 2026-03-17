package Com.Gla.Level2;

import java.util.Scanner;

public class Unit {
    public static double yardsToFeet(double yards){
        return yards*3;
    }

    public static double feetToYards(double feet){
        return feet/3;
    }

    public static double metersToInches(double m){
        return m*39.3701;
    }

    public static double inchesToMeters(double inch){
        return inch*0.0254;
    }

    public static double inchesToCm(double inch){
        return inch*2.54;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double yards = sc.nextDouble();
        double feet = sc.nextDouble();
        double m = sc.nextDouble();
        double inch = sc.nextDouble();
        System.out.println("Convert in km "+yardsToFeet(yards));
        System.out.println("Convert miles to km "+feetToYards(feet));
        System.out.println("Convert meters to feet"+metersToInches(m));
        System.out.println("Convert feet to miters"+inchesToCm(inch));
    }
}

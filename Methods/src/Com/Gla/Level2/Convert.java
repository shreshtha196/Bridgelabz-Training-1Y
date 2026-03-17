package Com.Gla.Level2;

import java.util.Scanner;

public class Convert {
    public static double convertKmToMiles(double km){
        return km*0.621371;
    }

    public static double convertMilesToKm(double miles){
        return miles*1.60934;
    }

    public static double convertMetersToFeet(double m){
        return m*3.28084;
    }

    public static double convertFeetToMeters(double f){
        return f*0.3048;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = sc.nextDouble();
        double m = sc.nextDouble();
        double f = sc.nextDouble();
        System.out.println("Convert in km "+convertKmToMiles(km));
        System.out.println("Convert miles to km "+convertMilesToKm(miles));
        System.out.println("Convert meters to feet"+convertMetersToFeet(m));
        System.out.println("Convert feet to miters"+convertFeetToMeters(f));
    }
}

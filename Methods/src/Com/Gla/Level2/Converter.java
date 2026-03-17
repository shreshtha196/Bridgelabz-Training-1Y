package Com.Gla.Level2;

import java.util.Scanner;

public class Converter {
    public static double fahrenheitToCelsius(double f){
        return (f-32)*5/9;
    }

    public static double celsiusToFahrenheit(double c){
        return (c*9/5)+32;
    }

    public static double poundsToKg(double p){
        return p*0.453592;
    }

    public static double kgToPounds(double kg){
        return kg*2.20462;
    }

    public static double gallonsToLiters(double g){
        return g*3.78541;
    }

    public static double litersToGallons(double l){
        return l*0.264172;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double f = sc.nextDouble();
        double c = sc.nextDouble();
        double p = sc.nextDouble();
        double kg = sc.nextDouble();
        double g = sc.nextDouble();
        double l = sc.nextDouble();
        System.out.println("Convert in km "+fahrenheitToCelsius(f));
        System.out.println("Convert miles to km "+celsiusToFahrenheit(c));
        System.out.println("Convert meters to feet"+poundsToKg(p));
        System.out.println("Convert feet to miters"+gallonsToLiters(g));
        System.out.println("Convert meters to feet"+litersToGallons(l));
        System.out.println("Convert feet to miters"+kgToPounds(kg));

    }
}

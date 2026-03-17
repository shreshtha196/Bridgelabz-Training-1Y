package Com.Gla.Level2;

import java.util.Scanner;

public class BMI {
    public static double bmi(double weight,double heightCm){
        double h=heightCm/100;
        return weight/(h*h);
    }

    public static String status(double bmi){

        if(bmi<=18.4) return "Underweight";
        else if(bmi<=24.9) return "Normal";
        else if(bmi<=39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++){

            double w=sc.nextDouble();
            double h=sc.nextDouble();

            double b=bmi(w,h);

            System.out.println("BMI="+b);
            System.out.println("Status="+status(b));
        }
    }
}

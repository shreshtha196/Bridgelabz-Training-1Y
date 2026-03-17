package Com.Gla.Level2;

import java.util.Scanner;

public class Friends {
    public static int youngest(int[] age){
        int min=age[0];
        for(int x:age)
            if(x<min) min=x;
        return min;
    }

    public static int tallest(int[] height){
        int max=height[0];
        for(int x:height)
            if(x>max) max=x;
        return max;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int[] age=new int[3];
        int[] height=new int[3];

        for(int i=0;i<3;i++)
            age[i]=sc.nextInt();

        for(int i=0;i<3;i++)
            height[i]=sc.nextInt();

        System.out.println("Youngest age="+youngest(age));
        System.out.println("Tallest height="+tallest(height));
    }
}

package Com.Gla.Level3;

import java.util.Random;

public class Football {
    public static int[] genrate(int n){
        Random r = new Random();
        int[] heights = new int[n];
        for (int i=0;i<n;i++){
            heights[i] =150 + r.nextInt(101);
        }
        return heights;
    }
    public static int sum(int[]arr){
        int s=0;
        for(int x : arr) s+=x;
        return s;
    }
    public static double mean(int[]arr){
        return (double) sum(arr)/arr.length;
    }
    public static int shortest(int[] arr){
        int min =arr[0];
        for(int x : arr) if (x<min)min = x;
        return min;
    }
    public static int tallest(int[]arr){
        int max =arr[0];
        for(int x: arr) if(x>max)max=x;
        return max;
    }
    public static void main(String[] args){
        int[] heights=genrate(11);
        System.out.println("heights:");
        for(int h : heights)
            System.out.print(h + "");
        System.out.println("shortest:"+shortest(heights));
        System.out.println("tallest:"+tallest(heights));
        System.out.println("mean:"+mean(heights));
    }
}

package Com.Gla.Level3;

import java.util.Scanner;

public class Calender {
    public static String[] months = {"January","February","March","April","May","June",
            "July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,3};
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            return true;
        return false;
    }
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month - 1];
    }
    public static int getStartDay(int month, int year) {
        int d = 1;
        int m = month;
        int y = year;
        if (m < 3) {
            m += 12;
            y--;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (d + (13*(m+1))/5 + k + (k/4) + (j/4) + (5*j)) % 7;
        return (h + 6) % 7;
    }
    public static void printCalendar(int month, int year) {
        int startDay = getStartDay(month, year);
        int totalDays = getDaysInMonth(month, year);
        System.out.println("\n   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < startDay; i++)
            System.out.print("    ");
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0)
                System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();
    }
}

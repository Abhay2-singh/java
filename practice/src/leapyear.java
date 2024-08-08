import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to leap year calculator");
        System.out.println("enter the year you want to check it=");
        int year=input.nextInt();
        if(year%400==0)
        {
            System.out.println("your year is leap-year");
        } else if (year % 100==0)
        {
            System.out.println("your year is not leap-year");
        } else if (year % 4==0)
        {
            System.out.println("your year is leap-year");
        }
        else
        {
            System.out.println("your year is not leap-year");
        }
    }
}

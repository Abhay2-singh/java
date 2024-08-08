import java.util.Scanner;

public class fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to temperature converter");
        System.out.print("Enter your temperature in f:");
        float fah=input.nextFloat();
        float cel=(fah-32)*5 /9;
        System.out.println("your temperature is="+ cel);
    }
}

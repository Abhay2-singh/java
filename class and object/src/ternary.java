import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        System.out.println("Welcome to number checker");
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number=");
        int num1= input.nextInt();
        System.out.println("enter the second number=");
        int num2=input.nextInt();
        int greaterNumber=num1>num2?num1:num2;
        System.out.println("greatest number is " + greaterNumber);
    }
}

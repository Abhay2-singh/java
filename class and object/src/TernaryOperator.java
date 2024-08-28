import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\nwelcome to number checker");
        System.out.println("enter the first number=");
        int num1=input.nextInt();
        System.out.println("enter the second number=");
        int num2= input.nextInt();
        int GreaterNumber;
        if (num1>num2){
            GreaterNumber=num1;
        }
        else {
            GreaterNumber=num2;
        }
        System.out.println(GreaterNumber + " is the greatest number");
    }
}

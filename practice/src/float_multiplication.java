import java.util.Scanner;

public class float_multiplication {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("we are doing float multiplication");
        System.out.println("Enter the first number=");
        double first=input.nextDouble();
        System.out.println("Now,please enter the second number=");
        double second=input.nextDouble();
        double mul=first*second;
        System.out.println("float multiplication is:"+ mul);

    }
}

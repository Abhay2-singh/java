import java.util.Scanner;

public class arithmetic1 {
    public static void main(String[] args) {
        System.out.println("welcome to our arithmetic calculator");
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number=");
        int first =input.nextInt();
        System.out.println("Now,Please enter the second number=");
        int second=input.nextInt();

        int add=first+second;
        int sub=first-second;
        int mul=first*second;
        int div=first/second;
        int mod=first%second;

        System.out.println("Addition is :"+ add);
        System.out.println("Subtraction is :"+ sub);
        System.out.println("Addition is :"+  mul);
        System.out.println("Addition is :"+  div);
        System.out.println("Addition is :"+  mod);


    }
}

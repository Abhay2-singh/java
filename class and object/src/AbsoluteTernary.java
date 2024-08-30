import java.util.Scanner;

public class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our programme");
        System.out.println("enter the first number=");
        int num=input.nextInt();
        int result=num>=0 ? num : -num;
        System.out.println("absolute value is " + result);
    }
}

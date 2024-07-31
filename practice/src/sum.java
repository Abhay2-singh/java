import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our programme");
        System.out.println("please enter the first number=");
        int firstNum=input.nextInt();
        System.out.println("please enter the second number=");
        int secondNum=input.nextInt();
        int sum =firstNum+secondNum;
        System.out.println("sum of two number is=" + sum);
    }
}

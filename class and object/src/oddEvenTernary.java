import java.util.Scanner;

public class oddEvenTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our odd even ternary checker");
        System.out.println("enter the number=");
        int num=input.nextInt();
        String result=num%2==0 ? "even" : "odd";
        System.out.println("your number is " + result);


    }
}

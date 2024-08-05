import java.util.Scanner;

public class BitwiseNOT {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("showcasing the bitwise not operator");
        System.out.println("enter the first number=");
        int first= input.nextInt();
        int result=~first;
        System.out.println("Result is=" + result);
    }
}

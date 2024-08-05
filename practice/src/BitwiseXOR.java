import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing of bitwise  X-OR operator");
        System.out.print("enter the first number=");
        int first = input.nextInt();
        System.out.println("enter the second number=");
        int second = input.nextInt();

        int result = first ^ second;
        System.out.println("result is=" + result);
    }
}

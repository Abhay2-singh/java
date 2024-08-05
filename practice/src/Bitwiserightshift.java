import java.util.Scanner;
public class Bitwiserightshift {
        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("showcasing the bitwise right shift operator");
            System.out.println("enter the first number=");
            int first= input.nextInt();
            int result=first >>1;
            System.out.println("Result is=" + result);
        }
}


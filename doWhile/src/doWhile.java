import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        do {
            System.out.println("enter your age");
            age = input.nextInt();
        }while (age<0 || age>100);
        System.out.println("your age is " + age);
    }
}
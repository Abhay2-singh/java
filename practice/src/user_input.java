import java.sql.SQLOutput;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name=");
        String name = input.nextLine();
        System.out.println("good morning," + name);
        System.out.println(name + ",also tell the age");
        int age =input.nextInt();
        System.out.println("your age is=," + age);

    }
}

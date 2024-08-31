import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our number guessing game");
        int num=5,guess;
        do {
            System.out.println("please guess the number between 1 to 10=");
            guess= input.nextInt();
        }while (num!=guess);
        System.out.println("you guess correct number ");
    }
}

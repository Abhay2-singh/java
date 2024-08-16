import java.util.Scanner;

public class Reversedigit {
    public static void main(String[] args) {
        System.out.println("Welcome to our reverse digit programme");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number=");
        int num= input.nextInt();
        int reverse=reverse(num);
        System.out.println("Reverse of your number"+ reverse);

    }
    public static int reverse(int num){
        int newNum=0;
        while (num>0){
            int digit=num%10;
            newNum=newNum *10 +digit;
            num=num/10;
        }
        return newNum;
    }
}

import java.util.Scanner;

public class Sumofdigit {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num=input.nextInt();
        int sum=sumofdigit(num);
        System.out.println("The sum of digit: " + sum);

    }
    public static int sumofdigit(int num){
        int sum=0;
        while (num>0){
            sum=sum+num%10;
            num=num/10;
        }
        return sum;
    }
}

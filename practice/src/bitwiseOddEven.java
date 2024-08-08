import java.util.Scanner;

public class bitwiseOddEven {
    public static void main(String[] args) {
        System.out.println("welcome to our odd or even calculator");
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number=");
        int num=input.nextInt();
        if((num & 1)==1)
        {
            System.out.println("number is odd");
        }
        else
        {
            System.out.println("number is even");
        }
    }
}

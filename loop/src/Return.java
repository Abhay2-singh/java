import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int first=Readnumber();
        int second=Readnumber();
        int sum=first+second;
        System.out.println("the sum of two number is "+ sum);

    }
    public static int Readnumber(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first number=");
        int number=input.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("welcome to our calculator");
    }
}

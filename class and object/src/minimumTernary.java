import java.util.Scanner;

public class minimumTernary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to minimum number finding");
        System.out.print("enter the first number=");
        int num1=input.nextInt();
        System.out.print("enter the second number=");
        int num2=input.nextInt();
        minimumTernary ternary=new minimumTernary();
        int min=ternary.min(num1,num2);
        System.out.println("minimum number is " + min);
    }
    public  int min(int num1,int num2){
        return num1 < num2 ? num1:num2;
    }
}

import java.util.Scanner;
//write a programme of factorial using recursion 

public class Recursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number=");
        int num= input.nextInt();
        long fact=factorial(num);
//        long fact=factorialIterative(num);
        System.out.println("the factorial of your number is " + fact);

    }
    public  static long factorial(int num){
        System.out.println("function called for " + num);
        if (num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static long factorialIterative(int num){
        long result=1;
        for (int i=1; i<=num; i++){
            result=result*i;
        }
        return result;
    }
}

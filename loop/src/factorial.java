import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our factorial programme");
        System.out.println("Enetr the first number=");
        int num=input.nextInt();
        long fact=factorial(num);
        System.out.println("The factorial is: "+ fact);

    }
    public static long factorial(int num){
        if(num<2){
            return 1;
        }
        long fact=1;
        int i=2;
        while (i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num= input.nextInt();
        boolean isprime=isprime(num);
        if (isprime){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }

    }
    public static  boolean isprime(int num){
        int i=2;
        while (i<num){
            if( num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}

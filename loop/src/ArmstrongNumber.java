import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("welcome to our programme=");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num= input.nextInt();
        boolean isArmstrongNumber=isArmstrongNumber(num);
        if (isArmstrongNumber){
            System.out.println("your number is Armstrong");
        }
        else {
            System.out.println("your number is not Armstrong");
        }

    }
    public static boolean isArmstrongNumber(int num){
        int digits=Noofdigit(num);
        int numCopy=num;
        System.out.println("No of digit "+ digits);
        int finalNumber=0;
        while (num>0){
            int Lastdigit = num % 10;
            num=num/10;
            finalNumber+=pow(Lastdigit,digits);
        }
        System.out.println("the final number is"+finalNumber);
        return finalNumber==numCopy;
    }
    public static int pow(int num1,int num2){
        int result=1;
        int i=0;
        while (i<num2){
            result*=num1;
            i++;
        }
        return result;
    }
    public static int Noofdigit(int num){
        int digits=0;
        while (num>0){
            digits++;
            num=num/10;
        }
        return digits;
    }
}

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num=input.nextInt();
        System.out.println("Here is the fabonacci series");
         printFabonacci(num);
    }
    public static void printFabonacci(int num){
        if (num < 0) return;
        System.out.println("0 ");
        if (num==0) return;
        System.out.println("1 ");
        int first=0 ,second=1;
        while (first+second<=num){
            int third=first+second;
            System.out.println(third + "");
            first=second;
            second=third;
        }

    }
}

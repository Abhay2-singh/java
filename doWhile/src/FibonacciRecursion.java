import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println("welcome to printing fibonacci  series ");
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number of element to be printed=");
        int count= input.nextInt();
        for (int i=1; i<=count; i++){
            System.out.print(fibonacci(i) + " ");
        }

    }
    public static int fibonacci(int position){
        if (position==1){
            return 0;
        }
        if (position==2){
            return 1;
        }
        return fibonacci(position-1)
                +fibonacci(position-2);
    }
}
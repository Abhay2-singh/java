import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("welcome to java programming");
        int n;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the first  number=");
        n=input.nextInt();
        for (int i=1; i<10; i++){
            System.out.println(n*i);
        }
    }
}

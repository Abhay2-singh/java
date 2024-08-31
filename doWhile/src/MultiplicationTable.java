import java.nio.file.LinkPermission;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to table generator");
        System.out.println("enter the number you want to print the table=");
        int num= input.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}

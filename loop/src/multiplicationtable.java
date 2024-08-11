import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number=51");
        int num=input.nextInt();
        multiplicationtable(num);

    }
    public static void multiplicationtable(int num){
        int i=1;
        while (i<=10){
            System.out.println(num + " x " + i + "=" + (num*i));
            i++;
        }

    }
}

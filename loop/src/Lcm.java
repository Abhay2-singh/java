import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.println("Welcome to our programme");
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first number=");
        int first=input.nextInt();
        System.out.println("enter the second number=");
        int second=input.nextInt();
        int lcm=lcm(first,second);
        System.out.println("Lcm of two number is=" + lcm);

    }
    public static int lcm(int first,int second){
        int i=1;
        while (true){
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}

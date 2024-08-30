import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our programme");
        System.out.println("enter your day in number=");
        int day=input.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid state");
                break;
        }
    }
}

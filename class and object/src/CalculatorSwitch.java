import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome  to our calculator");
        System.out.println("enter the first number=");
        int num1=input.nextInt();
        System.out.println("enter the second number=");
        int num2=input.nextInt();
        System.out.println("now,you can enter the operation=");
        String operation=input.next();

        int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> -1;
        };
        System.out.println("your answer is " + result);
    }
}

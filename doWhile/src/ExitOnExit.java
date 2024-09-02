import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("enter the command=");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            }
        }
        System.out.println("you have successfully exited the loop");
    }
}

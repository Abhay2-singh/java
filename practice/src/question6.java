import java.util.Scanner;

//write a programe for user input name of the person and respond with
//"welcome name to kg coding "
public class question6 {
    public static void main(String[] args) {
        System.out.print("please enter your name=");
        Scanner input =new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("welcome "+name+ " to KG coding");
    }

}

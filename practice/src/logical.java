import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        System.out.println("welcome to our programme");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the age=");
        int age=input.nextInt();
        System.out.println("Are you female?(true/false)");
        boolean isfemale=input.nextBoolean();
        if (age<5)
        {
            System.out.println("you got 75% discount");
        } else if (isfemale)
        {
            System.out.println("you got 50% discount");
        } else if (age>60 && !isfemale)
        {
            System.out.println("you got 25% discount");
        }
        else
        {
            System.out.println("you got no discount please try again next time...");
        }

    }
}

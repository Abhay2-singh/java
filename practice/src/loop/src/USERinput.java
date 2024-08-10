import java.util.Scanner;

public class USERinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
             int i=0;
        while (i<5)
        {
            int inp=input.nextInt();
            System.out.println("Number is=" + inp);
            i=i+1;
        }
    }
}

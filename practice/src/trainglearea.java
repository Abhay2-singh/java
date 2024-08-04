import java.util.Scanner;

public class trainglearea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("welcome to our programme");
        System.out.print("please enter your base in cms=");
        double base=input.nextDouble();
        System.out.println("now,please enter the perpendicular height in cms=");
        double height=input.nextDouble();
         double area=0.5*base*height;
        System.out.println("the area of traingle is="+ area);
    }
}
